package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jdk.internal.org.jline.utils.Log;

public class mytest {
   
	 private static final Logger log = LogManager.getLogger(mytest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      		
		log.info("This is information message");
        log.debug("This is debug message");
		log.error("This is error message");
		
	}

}
