package java.lang;

import com.releasex.digger.bci.exception.tracker.ExceptionTracker;

public class Exception extends Throwable {
	private static final long serialVersionUID = 5130716894769011670L;

	public Exception() {
		super();
		ExceptionTracker.trackException(this);
	}

	public Exception(String message) {
		super(message);
		ExceptionTracker.trackException(this);
	}

	public Exception(String message, Throwable cause) {
		super(message, cause);
		ExceptionTracker.trackException(this);
	}

	public Exception(Throwable cause) {
		super(cause);
		ExceptionTracker.trackException(this);
	}

}
