package com.log4j.level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test2 {

	public static Logger logger = LogManager.getLogger();//adding class name is optional
	
	public static void main(String[] args) {
		System.out.println("\n assalamualikum ...\n");
		logger.trace("this is trace message..\n");
		logger.info("this is information level message");
		logger.warn("this is warn level message");
		logger.error("this is error level message");
		logger.fatal("this is fatal level message\n");
		logger.debug("this is debugging message");
		
		System.out.println("\n alhamdulillah it is done");
	}

}
