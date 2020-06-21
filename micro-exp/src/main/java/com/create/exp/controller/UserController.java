package com.create.exp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.create.exp.constants.ApplicationConstants;

@RestController
public class UserController {
	
	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@PostMapping(value = "/api/users")
	public void getUsers(){		
		try {
			
			logger.info(ApplicationConstants.RESPONSE_CODE_STATUS);
			logger.info(ApplicationConstants.RESPONSE_DESC_STATUS);
			
		}catch (Exception e) {
			logger.info(e.getMessage());
		}
	}
}
