/*
 * @(#)CacheException.java August 22, 2014
 * 
 * Copyright 2014 dbaeye. All rights reserved.
 */
package net.dbaeye.cache;

/**
 * <p>
 * <a href="CacheException.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author Zhang Songfu
 * @version $Id$
 */
public class CacheException extends RuntimeException {
	
	public CacheException(String s) {
		super(s);
	}

	public CacheException(String s, Exception e) {
		super(s, e);
	}
	
	public CacheException(Exception e) {
		super(e);
	}
	
}
