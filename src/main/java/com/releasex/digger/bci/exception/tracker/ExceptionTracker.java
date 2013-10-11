package com.releasex.digger.bci.exception.tracker;

import com.releasex.digger.bci.exception.appender.ConsoleExceptionAppender;
import com.releasex.digger.bci.exception.appender.IExceptionAppender;


public class ExceptionTracker {
	
	public static final String FQCN;
	public static final String NAME_METHOD_TRACK = "trackException";
	public static final String TYPE_METHOD_TRACK = "(Ljava/lang/Exception;)V";

	private static final IExceptionAppender cappender = new ConsoleExceptionAppender();
	
	static {
		FQCN = ExceptionTracker.class.getCanonicalName().replace('.', '/');
	}
	
	public static void trackException(Exception e) {
		cappender.appendException(e);
	}
}
