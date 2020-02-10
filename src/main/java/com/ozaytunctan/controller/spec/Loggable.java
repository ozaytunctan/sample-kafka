package com.ozaytunctan.controller.spec;

import org.apache.log4j.Logger;

public abstract class Loggable {

	protected Logger logger = null;

	public Loggable(Class<?> clazz) {
		this.logger = Logger.getLogger(clazz);
	}

}
