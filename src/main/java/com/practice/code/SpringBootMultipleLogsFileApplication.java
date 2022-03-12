package com.practice.code;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMultipleLogsFileApplication {

	private static Logger logger = Logger.getLogger(SpringBootMultipleLogsFileApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleLogsFileApplication.class, args);

		logger.debug("Log4jExample: A kuldeep Debug Message");
		logger.info("Log4jExample: A kuldeep Info  Message");
		logger.warn("Log4jExample: A kuldeep Warn  Message");
		logger.error("Log4jExample: A kuldeep Error Message");
	}

}
