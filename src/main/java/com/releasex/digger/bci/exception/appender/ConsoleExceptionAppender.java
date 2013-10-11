package com.releasex.digger.bci.exception.appender;

public class ConsoleExceptionAppender implements IExceptionAppender {

	@Override
	public void appendException(Exception e) {
		System.out.println("Exception Occurred. " + e.getMessage());
	}

}
