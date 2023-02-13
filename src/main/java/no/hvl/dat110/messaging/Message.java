package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		if(data.length <= 127 && data != null){

			this.data = data;

		}else if (data.length > 127 && data != null ){

			for(byte i = 0; i < 127; i++){

				this.data[i] = data[i];

			}

		}
	}

	public byte[] getData() {
		return this.data; 
	}

}
