package com.canvas.exception;

/**
 * @author Abhijeet Gupta
 * custome exception run time created when wrong dimensions are passed.
 *
 */
public class CanvasCreateException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6623339957825064593L;

	public CanvasCreateException(String message) {
		super(message); 
	}

}
