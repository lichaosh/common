package com.lichaoshuai.common.utils;

/**
 * 
 * @ClassName: CMSRuntimeException
 * @Description: è‡ªå®šä¹‰å¼‚å¸?
 * @author: charles
 * @date: 2019å¹?7æœ?12æ—? ä¸‹åˆ3:47:13
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
