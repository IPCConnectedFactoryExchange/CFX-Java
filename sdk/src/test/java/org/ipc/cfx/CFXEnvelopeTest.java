package org.ipc.cfx;

import java.util.UUID;

import org.ipc.cfx.materials.transport.TransportOrderCompleted;
import org.ipc.cfx.production.assembly.MaterialsInstalled;
import org.ipc.cfx.structures.ActorType;
import org.ipc.cfx.structures.InstalledMaterial;
import org.ipc.cfx.structures.MaterialCarrierLocation;
import org.ipc.cfx.structures.MaterialPackage;
import org.ipc.cfx.structures.Operator;
import org.ipc.cfx.structures.smtplacement.SMDTapeFeeder;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class CFXEnvelopeTest {

  // @Test
  public void test() throws JsonProcessingException {

    CFXEnvelope envelope = new CFXEnvelope();

    EndpointConnected msg = new EndpointConnected();
    msg.setCFXHandle("SMTPlus.Model_21232.SN23123");
    msg.setRequestNetworkUri("amqp://host33/");
    msg.setRequestTargetAddress("/queue/SN23123");

    TransportOrderCompleted msg2 = new TransportOrderCompleted();
    msg2.setComments("Received at Line 1");
    msg2.setTransportOrderId("TR329483249830000");
    msg2.setRelatedWorkOrderId("WO2384702937403280032");
    msg2.setFinalDestination("LINE 1");
    Operator operator = new Operator();
    operator.setOperatorIdentifier("BADGE4487");
    operator.setFirstName("Human");
    operator.setActorType(ActorType.HUMAN);
    operator.setLastName("Dolittle");
    operator.setFirstName("Mike");
    operator.setLoginName("mike.dolittle@domain1.com");

    msg2.setAcceptedBy(operator);

    envelope.setMessageBody(msg2);

    ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    om.registerModule(new JavaTimeModule());
    om.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    om.setDateFormat(new StdDateFormat().withColonInTimeZone(true));

    String k = om.writeValueAsString(envelope);
    System.out.println(k);
  }

  // @Test
  public void deserializeTest() {
    String text = "{\r\n" +
      "  \"MessageName\" : \"CFX.Materials.Transport.TransportOrderCompleted\",\r\n" +
      "  \"Version\" : \"1.0\",\r\n" +
      "  \"TimeStamp\" : \"2019-05-23T14:57:37.095+00:00\",\r\n" +
      "  \"UniqueID\" : \"e1d72954-db7a-4f26-8d1f-5fffc1759d3e\",\r\n" +
      "  \"Source\" : null,\r\n" +
      "  \"Target\" : null,\r\n" +
      "  \"RequestID\" : null,\r\n" +
      "  \"MessageBody\" : {\r\n" +
      "    \"TransportOrderId\" : \"TR329483249830000\",\r\n" +
      "    \"Comments\" : \"Received at Line 1\",\r\n" +
      "    \"AcceptedBy\" : {\r\n" +
      "      \"OperatorIdentifier\" : \"BADGE4487\",\r\n" +
      "      \"ActorType\" : \"Human\",\r\n" +
      "      \"LastName\" : \"Dolittle\",\r\n" +
      "      \"FirstName\" : \"Mike\",\r\n" +
      "      \"LoginName\" : \"mike.dolittle@domain1.com\"\r\n" +
      "    },\r\n" +
      "    \"RelatedWorkOrderId\" : \"WO2384702937403280032\",\r\n" +
      "    \"FinalDestination\" : \"LINE 1\"\r\n" +
      "  }\r\n" +
      "}";

    CFXEnvelope env = CFXEnvelope.fromJson(text);
    
    

  }

   @Test
  public void deserializeTest2() {
    String text = "{\r\n" +
      "  \"MessageName\": \"CFX.Production.Assembly.MaterialsInstalled\",\r\n" +
      "  \"Version\": \"1.0\",\r\n" +
      "  \"TimeStamp\": \"2019-05-09T07:31:52.6772615-07:00\",\r\n" +
      "  \"UniqueID\": \"c1e3fc68-2898-44c7-baa8-f6b3b3e49f19\",\r\n" +
      "  \"Source\": \"KNS.iFlex.DC017580\",\r\n" +
      "  \"Target\": null,\r\n" +
      "  \"RequestID\": null,\r\n" +
      "  \"MessageBody\": {\r\n" +
      "    \"TransactionId\": \"4739fb2b-976d-4c02-877d-955710ccb658\",\r\n" +
      "    \"InstalledMaterials\": [\r\n" +
      "      {\r\n" +
      "        \"UnitIdentifier\": \"3111\",\r\n" +
      "        \"UnitPositionNumber\": 1,\r\n" +
      "        \"QuantityInstalled\": 16.0,\r\n" +
      "        \"Material\": {\r\n" +
      "          \"UniqueIdentifier\": \"\",\r\n" +
      "          \"InternalPartNumber\": \"0402-SIM\",\r\n" +
      "          \"Quantity\": 0.0\r\n" +
      "        },\r\n" +
      "        \"CarrierLocation\": {\r\n" +
      "          \"LocationIdentifier\": \"1.18.1\",\r\n" +
      "          \"LocationName\": \"1.18.1\",\r\n" +
      "          \"CarrierInformation\": {\r\n" +
      "            \"$type\": \"CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX\",\r\n" +
      "            \"BaseUniqueIdentifier\": null,\r\n" +
      "            \"BaseName\": \"A_SERIES_FDR_TROLLEY\",\r\n" +
      "            \"LaneNumber\": 1,\r\n" +
      "            \"TapeWidth\": 0.0,\r\n" +
      "            \"TapePitch\": 0.0,\r\n" +
      "            \"UniqueIdentifier\": \"1200190\",\r\n" +
      "            \"Name\": \"\"\r\n" +
      "          }\r\n" +
      "        },\r\n" +
      "        \"InstalledComponents\": [\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"002\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"004\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"006\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"008\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"012\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"014\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"016\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"018\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"022\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"024\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"026\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"028\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"032\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"034\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"036\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"038\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          }\r\n" +
      "        ]\r\n" +
      "      },\r\n" +
      "      {\r\n" +
      "        \"UnitIdentifier\": \"3111\",\r\n" +
      "        \"UnitPositionNumber\": 1,\r\n" +
      "        \"QuantityInstalled\": 16.0,\r\n" +
      "        \"Material\": {\r\n" +
      "          \"UniqueIdentifier\": \"\",\r\n" +
      "          \"InternalPartNumber\": \"0402-SIM\",\r\n" +
      "          \"Quantity\": 0.0\r\n" +
      "        },\r\n" +
      "        \"CarrierLocation\": {\r\n" +
      "          \"LocationIdentifier\": \"1.12.1\",\r\n" +
      "          \"LocationName\": \"1.12.1\",\r\n" +
      "          \"CarrierInformation\": {\r\n" +
      "            \"$type\": \"CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX\",\r\n" +
      "            \"BaseUniqueIdentifier\": null,\r\n" +
      "            \"BaseName\": \"A_SERIES_FDR_TROLLEY\",\r\n" +
      "            \"LaneNumber\": 1,\r\n" +
      "            \"TapeWidth\": 0.0,\r\n" +
      "            \"TapePitch\": 0.0,\r\n" +
      "            \"UniqueIdentifier\": \"1200143\",\r\n" +
      "            \"Name\": \"\"\r\n" +
      "          }\r\n" +
      "        },\r\n" +
      "        \"InstalledComponents\": [\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"001\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"003\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"005\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"007\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"011\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"013\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"015\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"017\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"021\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"023\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"025\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"027\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"031\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"033\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"035\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"037\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          }\r\n" +
      "        ]\r\n" +
      "      },\r\n" +
      "      {\r\n" +
      "        \"UnitIdentifier\": \"3111\",\r\n" +
      "        \"UnitPositionNumber\": 1,\r\n" +
      "        \"QuantityInstalled\": 8.0,\r\n" +
      "        \"Material\": {\r\n" +
      "          \"UniqueIdentifier\": \"\",\r\n" +
      "          \"InternalPartNumber\": \"0402-sim\",\r\n" +
      "          \"Quantity\": 0.0\r\n" +
      "        },\r\n" +
      "        \"CarrierLocation\": {\r\n" +
      "          \"LocationIdentifier\": \"2.45.1\",\r\n" +
      "          \"LocationName\": \"2.45.1\",\r\n" +
      "          \"CarrierInformation\": {\r\n" +
      "            \"$type\": \"CFX.Structures.SMTPlacement.SMDTapeFeeder, CFX\",\r\n" +
      "            \"BaseUniqueIdentifier\": null,\r\n" +
      "            \"BaseName\": \"A_SERIES_FDR_TROLLEY\",\r\n" +
      "            \"LaneNumber\": 1,\r\n" +
      "            \"TapeWidth\": 0.0,\r\n" +
      "            \"TapePitch\": 0.0,\r\n" +
      "            \"UniqueIdentifier\": \"1200160\",\r\n" +
      "            \"Name\": \"\"\r\n" +
      "          }\r\n" +
      "        },\r\n" +
      "        \"InstalledComponents\": [\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"009\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"010\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"019\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"020\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"029\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"030\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"039\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          },\r\n" +
      "          {\r\n" +
      "            \"ReferenceDesignator\": \"040\",\r\n" +
      "            \"InstallationTime\": null\r\n" +
      "          }\r\n" +
      "        ]\r\n" +
      "      }\r\n" +
      "    ]\r\n" +
      "  }\r\n" +
      "}";

    CFXEnvelope env = CFXEnvelope.fromJson(text);

    System.out.println(env.toJson(true));
  }

  //@Test
  public void testSerializingInstalledMaterial() throws JsonProcessingException {

    InstalledMaterial installedMaterial1 = new InstalledMaterial();
    installedMaterial1.setUnitIdentifier("3111");
    installedMaterial1.setUnitPositionNumber(1);

    MaterialPackage material = new MaterialPackage();
    material.setUniqueIdentifier("uniqueIdentifier");
    material.setInternalPartNumber("0402-sim");
    material.setQuantity(2.5);
    installedMaterial1.setMaterial(material);
    installedMaterial1.setQuantityInstalled(13.0);
    SMDTapeFeeder carrier = new SMDTapeFeeder();
    carrier.setBaseName("A_SERIES_FDR_TROLLEY");
    carrier.setLaneNumber(1);
    carrier.setTapeWidth(0.0);
    carrier.setTapePitch(0.0);
    carrier.setBaseUniqueIdentifier("1200190");
    carrier.setBaseName("");

    MaterialCarrierLocation carrierLocation = new MaterialCarrierLocation();

    carrierLocation.setCarrierInformation(carrier);
    carrierLocation.setLocationIdentifier("locident");
    carrierLocation.setLocationName("locationName");

    installedMaterial1.setCarrierLocation(carrierLocation);

    InstalledMaterial installedMaterial2 = new InstalledMaterial();

    InstalledMaterial[] installedMaterials = new InstalledMaterial[] { installedMaterial1, installedMaterial2 };

    MaterialsInstalled mi = new MaterialsInstalled();
    mi.setTransactionId(UUID.randomUUID());
    mi.setInstalledMaterials(installedMaterials);

    CFXEnvelope envelope = new CFXEnvelope(mi);

    ObjectMapper om = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    om.registerModule(new JavaTimeModule());
    om.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    om.setDateFormat(new StdDateFormat().withColonInTimeZone(true));

    String k = om.writeValueAsString(envelope);
    System.out.println(k);
  }

}
