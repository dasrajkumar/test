package com.test;

import org.apache.log4j.Logger;

public class Test {

	private static Logger LOGGER = Logger.getLogger(Test.class.toString());

	public static void main(String[] args) {

		LOGGER.info("Hello ! I am from here main method. ");
		main();
	}

	public static void main() {
		LOGGER.info("hello ai ");
	}
}