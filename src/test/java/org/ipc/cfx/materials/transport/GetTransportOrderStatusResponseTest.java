package org.ipc.cfx.materials.transport;

import static org.junit.Assert.*;

import java.util.*;

import org.ipc.cfx.structures.RequestResult;
import org.ipc.cfx.structures.TransportOrderHistory;
import org.ipc.cfx.structures.TransportOrderStatus;
import org.ipc.cfx.utilities.CFXJsonSerializer;
import org.junit.Test;

public class GetTransportOrderStatusResponseTest {

	@Test
	public void test() {
		GetTransportOrderStatusResponse out = new GetTransportOrderStatusResponse();
		out.setResult(new RequestResult());
		
		TransportOrderHistory hist1 = new TransportOrderHistory();
		Date d1 =  new Date();
		hist1.setEventDateTime(d1);
		hist1.setStatus(TransportOrderStatus.INTRANSIT);
		TransportOrderHistory[] history = new TransportOrderHistory[] {
				hist1 
				
		};
		out.setHistory(history );
		
		String k = CFXJsonSerializer.serializeObject(out, true);
		System.out.println(k);
		
	}

}
