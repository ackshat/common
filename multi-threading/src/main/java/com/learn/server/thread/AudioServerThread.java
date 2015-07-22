package com.learn.server.thread;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AudioServerThread extends Thread {

	private Socket clientSocket ;
	public AudioServerThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	public void run(){
		try {
			System.out.println("running...");
			PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
			InputStream is = new BufferedInputStream(clientSocket.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String inputLine, outputLine;
			int i;
			while ((i = reader.read()) != -1 ) {
               // outputLine = processInput(inputLine);
				System.out.println(i);
                pw.println(i);
               /* if (outputLine.equals("Done"))
                    break;*/
            }
            clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String processInput(String inputLine) {
		System.out.println("Got "+inputLine);
		return inputLine;
	}
	
}
