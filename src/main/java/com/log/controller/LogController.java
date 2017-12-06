package com.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yf
 * @Date: 2017/11/30.
 */
@RestController
public class LogController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("log")
	public String getlogs() {
		logger.info("日志测试 log info");
		logger.error("日志测试 log error");
		logger.debug("日志测试 log debug");
		return "OK";
	}
}
