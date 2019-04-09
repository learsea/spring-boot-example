package com.midea.jr.ecf.channel.front.common.common.exception;

/**
 * Service 层访问异常
 *
 * @author  李武元
 * @version ECF-FRONT v1.0 
 * @since   ECF-FRONT v1.0
 */
public class ServiceException extends RuntimeException {

	private int code;

	public ServiceException( String message ) {
		super( message );
	}

	public ServiceException( String message, Exception e ) {
		super( message, e );
	}

	public ServiceException( String message, int code ) {
		super( message );
		this.code = code;
	}

	public ServiceException( String message, int code, Exception e ) {
		super( message, e );
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode( int code ) {
		this.code = code;
	}

}
