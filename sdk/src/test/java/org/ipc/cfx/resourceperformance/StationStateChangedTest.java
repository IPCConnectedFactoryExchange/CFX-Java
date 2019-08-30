package org.ipc.cfx.resourceperformance;

import static org.junit.Assert.*;

import org.ipc.cfx.utilities.CFXJsonSerializer;
import org.junit.Test;

public class StationStateChangedTest {

	@Test
	public void test() {
		String v = "{\r\n" + 
				"  \"MessageName\": \"CFX.ResourcePerformance.StationStateChanged\",\r\n" + 
				"  \"Version\": \"1.0\",\r\n" + 
				"  \"TimeStamp\": \"2019-05-09T05:54:40.0261723-07:00\",\r\n" + 
				"  \"UniqueID\": \"2c49d9b1-7b46-4beb-9453-83acffa5d0fc\",\r\n" + 
				"  \"Source\": \"ASM.EBYSIPLACE.12345678\",\r\n" + 
				"  \"Target\": null,\r\n" + 
				"  \"RequestID\": null,\r\n" + 
				"  \"MessageBody\": {\r\n" + 
				"    \"OldState\": 5000,\r\n" + 
				"    \"OldStateDuration\": \"00:00:01\",\r\n" + 
				"    \"NewState\": 1000,\r\n" + 
				"    \"RelatedFault\": null\r\n" + 
				"  }\r\n" + 
				"}";
		
		Object k = CFXJsonSerializer.deserializeObject(v, StationStateChanged.class);
	}

}
