package com.example.Movies.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class MovieException extends RuntimeException{
	
	private static final long versionUID = 1L;
	
	public MovieException(String msg)
	{
		super(msg);
	}
	
	public MovieException(String msg, Throwable t)
	{
		super(msg,t);
	}

}
