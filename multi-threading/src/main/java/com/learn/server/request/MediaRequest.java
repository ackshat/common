package com.learn.server.request;

import com.learn.server.response.MediaResponse;


public interface MediaRequest {
	
	public <T> MediaResponse send(String host,int port,
			Class<T> t,	Object payLoad);

}
