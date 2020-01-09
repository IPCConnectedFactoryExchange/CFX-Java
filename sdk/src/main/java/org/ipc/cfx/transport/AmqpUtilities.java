/*
 * Licensed to the Apache Software Foundation (ASF)under one
 * or more contributor license agreements.See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.The ASF licenses this file
 * to you under the Apache License, Version 2.0(the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 * This file was automatically created
 * source: CFX.DLL, Version 1.0.15.0
 * created: 23.05.2019 09:24:13 by frankp
 */
package org.ipc.cfx.transport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.zip.ZipOutputStream;

import org.apache.qpid.amqp_1_0.client.Connection;
import org.apache.qpid.amqp_1_0.client.Message;
import org.apache.qpid.amqp_1_0.client.Session;
import org.apache.qpid.amqp_1_0.type.Symbol;
import org.ipc.cfx.CFXEnvelope;
import org.ipc.cfx.utilities.CFXJsonSerializer;

import edu.emory.mathcs.backport.java.util.Arrays;

/**
 * 
 * original type: CFX.Transport.AmqpUtilities
 */
public class AmqpUtilities {

	public static Message messageFromEnvelope(CFXEnvelope env ) {
		return messageFromEnvelope(env, false);
	}
    public static Message messageFromEnvelope(CFXEnvelope env, boolean compressed  )
    {
        byte[] msgData = env.toBytes();
        if (compressed)
        {
            msgData = compress(msgData);
        }

        Message msg = new Message();
        //(msgData);
        msg.getProperties().setMessageId(  env.getUniqueID().toString());
        msg.getProperties().setCreationTime( env.getTimeStamp());
        
// TODO replace        msg.getHeader().setDurable( AmqpCFXEndpoint.DurableMessages.Value);
        
        
        if (compressed) msg.getProperties().setContentEncoding(Symbol.getSymbol("CFX-COMPRESSED"));

        return msg;
    }

//    public static Message messageFromEnvelopes(CFXEnvelope [] envelopes) {
//    	return messageFromEnvelopes(envelopes, false);
//    }
//    public static Message messageFromEnvelopes(CFXEnvelope [] envelopes, boolean compressed )
//    {
//        if (envelopes.length == 1)
//        {
//            return messageFromEnvelope(envelopes[0]);
//        }
//
//        List<CFXEnvelope> container = Arrays.asList(envelopes);
//        byte[] msgData = CFXJsonSerializer.serializeObject(container).getBytes(Charset.forName("UTF-8"));
//        if (compressed)
//        {
//            msgData = compress(msgData);
//        }
//
//        Message msg = new Message();//(msgData);
//        msg.getProperties().setMessageId(  env.getUniqueID().toString());
//        msg.getProperties().setCreationTime( new Date());
//        
//        msg.Header = new Amqp.Framing.Header()
//        {
//            Durable = AmqpCFXEndpoint.DurableMessages.Value
//        };
//        
//        if (compressed) msg.getProperties().setContentEncoding(Symbol.valueOf( "CFX-COMPRESSED"));
//
//        return msg;
//    }

//    public static List<CFXEnvelope> envelopesFromMessage(Message msg)
//    {
//        if (msg.Body is byte[])
//        {
//            byte[] msgData = msg.Body as byte[];
//            if (msg.Properties?.ContentEncoding == "CFX-COMPRESSED")
//            {
//                msgData = decompress(msgData);
//            }
//
//            List<CFXEnvelope> results;
//
//            String jsonData = Encoding.UTF8.GetString(msgData);
//            if (isMessageList(jsonData))
//            {
//                results = CFXEnvelope.fromJsonList(jsonData);
//            }
//            else
//            {
//                results =  Arrays.asList(new CFXEnvelope [] { CFXEnvelope.fromJson(jsonData) });
//            }
//
//            return results;
//        }
//
//        throw new IllegalArgumentException("AMQP Message Body does not contain a valid CFX Envelope");
//
//    }

    public static boolean isMessageList(String jsonData)
    {
        String test = jsonData.substring(0, jsonData.length() >= 20 ? 20 : jsonData.length()).trim();
        if (test.startsWith("[")) return true;
        return false;
    }

//    public static CFXEnvelope envelopeFromMessage(Message msg)
//    {
//        if (msg.Body is byte[])
//        {
//            byte[] msgData = msg.Body as byte[];
//            if (msg.getProperties().getContentEncoding().toString().equals("CFX-COMPRESSED"))
//            {
//                msgData = decompress(msgData);
//            }
//
//            return CFXEnvelope.fromBytes(msgData);
//        }
//
//        throw new IllegalArgumentException("AMQP Message Body does not contain a valid CFX Envelope");
//    }

    private static byte[] compress(byte[] data)
    {
        // JJW:  No Compression for now.
        return data;
        
        //byte [] compressedData = null;
        //using (MemoryStream zip = new MemoryStream())
        //{
        //    using (ZipArchive archive = new ZipArchive(zip, ZipArchiveMode.Update))
        //    {
        //        ZipArchiveEntry entry = archive.CreateEntry("CFXMessages.json");
        //        using (BinaryWriter writer = new BinaryWriter(entry.Open()))
        //        {
        //            writer.Write(data);
        //        }
        //    }

        //    compressedData = zip.ToArray();
        //}

        //return compressedData;
    }

    private static byte[] decompress(byte[] data)
    {
        // JJW:  No compression for now.
        return data;
        
        //byte[] uncompressedData = null;
        //using (MemoryStream zip = new MemoryStream(data))
        //{
        //    using (ZipArchive archive = new ZipArchive(zip, ZipArchiveMode.Read))
        //    {
        //        ZipArchiveEntry entry = archive.Entries.FirstOrDefault();
        //        if (entry != null)
        //        {
        //            using (MemoryStream dataFile = new MemoryStream())
        //            {
        //                using (Stream s = entry.Open())
        //                {
        //                    s.CopyTo(dataFile);
        //                    uncompressedData = dataFile.ToArray();
        //                }
        //            }
        //        }
        //    }
        //}

        //return uncompressedData;
    }

//    public static String messagePreview(Message message) {
//    	return messagePreview(message, 200);
//    }
//    public static String messagePreview(Message message, int count)
//    {
//        if (message.Body is byte [])
//        {
//            byte[] bt = message.Body as byte[];
//            String result = "";
//            try
//            {
//                result = String.valueOf(bt);
//                if (result.length() > count) result = result.substring(0, count);
//            }
//            catch (Exception e)
//            {
//                for (int i = 0; i < bt.length && i < count; i++)
//                {
//                    result += MessageFormat.format("0x{0:X2", bt[i]);
//                }
//            }
//
//            result += "...";
//            return result;
//        }
//        else if (message.Body is String)
//        {
//            String result = message.Body as string;
//            if (result.length() > count) result = result.substring(0, count);
//            result += "...";
//            return result;
//        }
//
//        return "";
//    }

    public static javax.security.cert.X509Certificate getCertificate(String certFindValue) throws KeyStoreException
    {
// TODO: Missing implementation
      
//        StoreLocation[] locations = new StoreLocation[] { StoreLocation.LocalMachine, StoreLocation.CurrentUser };
//        foreach (StoreLocation location in locations)
//        {
//            X509Store store = new X509Store(StoreName.My, location);
//            store.Open(OpenFlags.OpenExistingOnly);
//
//            X509Certificate2Collection collection = store.Certificates.Find(
//                X509FindType.FindBySubjectName,
//                certFindValue,
//                false);
//
//            if (collection.Count == 0)
//            {
//                collection = store.Certificates.Find(
//                    X509FindType.FindByThumbprint,
//                    certFindValue,
//                    false);
//            }

//            store.Dispose();
            
//            if (collection.Count > 0)
//            {
//                return collection[0];
//            }
//        }

        throw new IllegalArgumentException("No certificate can be found using the find value " + certFindValue);
    }
//
//    private static byte[] compress2(byte[] data)
//    {
//        OutputStream output = new ByteArrayOutputStream();
//        ZipOutputStream dstream = new ZipOutputStream(output);
//        dstream.setMethod(ZipOutputStream.DEFLATED);
//        
////        using (GZipStream dstream = new GZipStream(output, CompressionLevel.Optimal))
////        {
////            dstream.Write(data, 0, data.length);
////        }
//        dstream.write(data, 0, data.length);
//
//        return output.toArray();
//    }
//
//    private static byte[] decompress2(byte[] data)
//    {
//        InputStream input = new ByteArrayInputStream(data);
//        OutputStream output = new ByteArrayOutputStream();
//        using (GZipStream dstream = new GZipStream(input, CompressionMode.Decompress))
//        {
//            dstream.CopyTo(output);
//        }
//        return output.ToArray();
//    }

//    @SuppressWarnings("unchecked")
//    public static boolean sendAzureAuthenticationToken(Connection connection, String host, String shareAccessSignature, String audience)
//    {
//        boolean result = true;
//        Session session = new Session(connection, "");
//
//        String cbsReplyToAddress = "cbs-reply-to";
//        AmqpSenderLink cbsSender = new AmqpSenderLink(session, "cbs-sender", "$cbs");
//        AmqpReceiverLink cbsReceiver = new AmqpReceiverLink(session, cbsReplyToAddress, "$cbs");
//
//        // construct the put-token message
//        Message request = new Message(shareAccessSignature);
////        request.Properties = new Properties();
//        request.getProperties().setMessageId ( UUID.randomUUID().toString());
//        request.getProperties().setReplyTo( cbsReplyToAddress);
////        request.getApplicationProperties()
//        request.getApplicationProperties().getValue().put("operation",  "put-token");
//        request.getApplicationProperties().getValue().put("type",  "azure-devices.net:sastoken");
//        request.getApplicationProperties().getValue().put("name", audience);
//        cbsSender.Send(request);
//
//        // receive the response
//        var response = cbsReceiver.Receive();
//        if (response == null || response.Properties == null || response.ApplicationProperties == null)
//        {
//            result = false;
//        }
//        else
//        {
//            int statusCode = (int)response.ApplicationProperties["status-code"];
//            string statusCodeDescription = (string)response.ApplicationProperties["status-description"];
//            if (statusCode != (int)202 && statusCode != (int)200) // !Accepted && !OK
//            {
//                result = false;
//            }
//        }
//
//        // the sender/receiver may be kept open for refreshing tokens
//        cbsSender.Close();
//        cbsReceiver.Close();
//        session.Close();
//
//        return result;
//    }
//

//    public static String getSharedAccessSignature(String keyName, String sharedAccessKey, String resource, long tokenTimeToLive)
//    {
//        // http://msdn.microsoft.com/en-us/library/azure/dn170477.aspx
//        // the canonical Uri scheme is http because the token is not amqp specific
//        // signature is computed from joined encoded request Uri string and expiry string
//
//        String expiry = ((long)(new Date().getTime() - new Date(UtcReference) + tokenTimeToLive).TotalSeconds).ToString();
//        String encodedUri = HttpUtility.UrlEncode(resource);
//
//        byte[] hmac = SHA.computeHMAC_SHA256(Convert.FromBase64String(sharedAccessKey), Encoding.UTF8.GetBytes(encodedUri + "\n" + expiry));
//        String sig = Convert.ToBase64String(hmac);
//
//        if (keyName != null)
//        {
//            return Fx.Format(
//            "SharedAccessSignature sr={0}&sig={1}&se={2}&skn={3}",
//            encodedUri,
//            HttpUtility.UrlEncode(sig),
//            HttpUtility.UrlEncode(expiry),
//            HttpUtility.UrlEncode(keyName));
//        }
//        else
//        {
//            return Fx.Format(
//                "SharedAccessSignature sr={0}&sig={1}&se={2}",
//                encodedUri,
//                HttpUtility.UrlEncode(sig),
//                HttpUtility.UrlEncode(expiry));
//        }
//    }

}
