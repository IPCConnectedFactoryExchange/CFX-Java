package org.ipc.cfx.transport;

import javax.xml.ws.handler.MessageContext;

public interface IMessageProcessor {
  //
  // Zusammenfassung:
  //     Defines the property and methods of a message processor.
      //
      // Zusammenfassung:
      //     Gets the link credit to issue to the client.
      int getCredit() ;

      //
      // Zusammenfassung:
      //     Processes a received message.
      //
      // Parameter:
      //   messageContext:
      //     Context of the received message.
      void process(MessageContext messageContext);
  }
