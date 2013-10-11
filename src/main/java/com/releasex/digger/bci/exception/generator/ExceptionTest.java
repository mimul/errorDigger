package com.releasex.digger.bci.exception.generator;

public class ExceptionTest 
{
	public static void generateException(boolean exception) throws RuntimeException {
		if (exception)
			throw new RuntimeException("test");
	}

	public static void main(String[] args) {

		try { 
			ExceptionTest.generateException(true);
		} catch(Exception ex) {}

		try {
			ExceptionTest.generateException(false);
		} catch(Exception ex) {}
		}
}
