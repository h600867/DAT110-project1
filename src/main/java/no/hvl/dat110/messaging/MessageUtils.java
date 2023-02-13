package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = new byte[SEGMENTSIZE];
		byte[] data = message.getData();
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer

		int lengde = data.length;
		segment[0] = (byte) lengde;

		for(int i = 0; i < lengde; i++){

			segment[i + 1] = data[i];

		}

		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		byte lengde = segment[0];
		byte[] data = new byte[lengde];

		for(int i = 1; i <= lengde; i++){

			data[i - 1] = segment[i];

		}
		
		return new Message(data);
		
	}
	
}
