package com.learn.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AudioClient {

	public static void main(String[] args) {
		try(
				Socket socket = new Socket("localhost", 7770);
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	            BufferedReader in = new BufferedReader(
	                new InputStreamReader(socket.getInputStream()));
	        ){
			BufferedReader stdIn =
	                new BufferedReader(new InputStreamReader(System.in));
			String fromServer;
            String fromUser;
            
            while((fromServer = in.readLine()) != null){
            	System.out.println("Server: " + fromServer);
                if (fromServer.equals("Bye."))
                    break;
                
                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    out.println(fromUser);
                }
            }
		}
		catch(Exception e){
		}
	}
}
