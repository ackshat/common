package com.learn.server.request;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

import com.learn.server.response.MediaResponse;

public class AudioRequest implements MediaRequest, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7450353103883199206L;

	public <T> MediaResponse send(String host, int port, Class<T> t,
			Object payLoad) {
		
		try {
			Socket sSocket = new Socket(host, port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
