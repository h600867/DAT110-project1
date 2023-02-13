package no.hvl.dat110.system.controller;

import no.hvl.dat110.TODO;
import no.hvl.dat110.rpc.*;

public class DisplayStub extends RPCLocalStub {

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		byte[] data = RPCUtils.marshallString(message);

		byte[] retur = rpcclient.call((byte)Common.WRITE_RPCID,data);

		String unmarsh = RPCUtils.unmarshallString(retur);
		
	}
}
