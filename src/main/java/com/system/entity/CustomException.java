package com.system.entity;


/**
 * @author Dhrumil Shah
 *
 */
public class CustomException extends RuntimeException {
	private String code;
	private String msg;
	
	/**
	 * 
	 */
	public CustomException() {
	}
	
	/**
	 * @param code
	 * @param msg
	 */
	public CustomException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	/**
	 * @return
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
