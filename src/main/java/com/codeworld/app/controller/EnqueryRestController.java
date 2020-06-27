package com.codeworld.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnqueryRestController {

	@RequestMapping("/home")
	public String HomepageEnquery() {
		return("Welcome to Railways :-)");
	}
}
