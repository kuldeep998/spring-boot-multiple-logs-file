package com.practice.code;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	private static Logger logger = Logger.getLogger(HomeController.class);

	@GetMapping(value = "/home")
	public String home() {
		logger.debug("Log4jExample: A kuldeep Debug Message");
		logger.info("Log4jExample: A kuldeep Info  Message");
		logger.warn("Log4jExample: A kuldeep Warn  Message");
		logger.error("Log4jExample: A kuldeep Error Message");
		return "working";
	}
}
