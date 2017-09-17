package com.fluppi.algorithm.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Testerklasse {

	private final static Logger jlog = LogManager.getLogger();
	
	public boolean test() {
		jlog.traceEntry();
		jlog.info("Printing test");
		System.out.println("Test");
		jlog.traceExit();
		return true;
	}
	
}
