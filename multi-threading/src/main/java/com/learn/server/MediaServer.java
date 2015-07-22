package com.learn.server;

import com.learn.server.request.MediaRequest;
import com.learn.server.response.MediaResponse;

public interface MediaServer {
	
	public boolean init();
	
	public void start();
	
	public MediaResponse serve(MediaRequest request);
	
	//public void stop();
	

}
