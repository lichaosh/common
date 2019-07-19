package com.lichaoshuai.common.utils;

/**
 * 
 * @ClassName: CMSRuntimeException
 * @Description: 自定义异�?
 * @author: charles
 * @date: 2019�?7�?12�? 下午3:47:13
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	public CMSRuntimeException() {
		super();
	}

	public CMSRuntimeException(String message) {
		super(message);
	}

}
