package com.learn.server.command;

import com.learn.server.AudioServer;

public class CoomandListenerThread extends Thread {

	private AudioServer audioServer;
	
	public CoomandListenerThread(AudioServer audioServer) {
		this.audioServer = audioServer;
	}

	public void start(){
		while (true) {
			if("Stop".equalsIgnoreCase(
					System.console().readLine())){
				audioServer.shutDown();
			}
			if("kill".equalsIgnoreCase(
					System.console().readLine())){
				audioServer.kill();
			}
			
		}
	}
}
