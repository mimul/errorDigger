package com.releasex.digger.bci.exception.generator;



public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ExceptionGenerator.transform("java.lang.Exception", "Exception");
	}

}
