package com.learn.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;

import com.learn.server.command.CoomandListenerThread;
import com.learn.server.request.MediaRequest;
import com.learn.server.response.MediaResponse;
import com.learn.server.thread.AudioServerThread;

public class AudioServer extends Thread implements MediaServer {

	private static int SERVER_PORT = 6666;
	private String host;
	private int port;
	private ServerSocket serverSocket;
	
	
	public AudioServer(int port) {
		super();
		this.port = port;
	}


	public boolean init()  {
		boolean flag = true;
		try {
			
			this.serverSocket = new ServerSocket(this.port);
			System.out.println(" Initized");
		} catch (IOException e) {
			System.out.println("Initization Failed");
			e.printStackTrace();
			flag = false;
		}
		 
		return flag;
	}

	public void start() {
		// 
		try{
			if(this.init()){
				//new CoomandListenerThread(this).start();
				System.out.println("Server Started");
				System.out.println("Waiting for client request ...");
				while(true){
					Socket clientSocket = serverSocket.accept();
					System.out.println("Got a connection from -- "+clientSocket.getInetAddress());
					handleClient(clientSocket);
				}
			}
		}
		catch(Exception e ){
			e.printStackTrace();
		}
		
	}

	private void handleClient(Socket clientSocket) {
		new AudioServerThread(clientSocket).start();
		
	}


	public MediaResponse serve(MediaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static void main(String[] args) {
		new AudioServer(SERVER_PORT ).start();
	}


	public void shutDown() {
		try {
			this.serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't shut down as connected to a client");
			System.out.println("Use Kill to force shutdown");
			e.printStackTrace();
		}
		
	}

	public void kill() {
		try {
			this.serverSocket = null;
			this.interrupt();
			System.out.println("Killed");
		} catch (Exception e) {
			System.out.println("Killing exception");
			e.printStackTrace();
		}
		
	}
}
