package com.learn.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.SocketFactory;

public class AudioSocket extends SocketFactory {

	@Override
	public Socket createSocket(String host, int port) throws IOException,
			UnknownHostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Socket createSocket(InetAddress host, int port) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Socket createSocket(String host, int port, InetAddress localHost,
			int localPort) throws IOException, UnknownHostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Socket createSocket(InetAddress address, int port,
			InetAddress localAddress, int localPort) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
