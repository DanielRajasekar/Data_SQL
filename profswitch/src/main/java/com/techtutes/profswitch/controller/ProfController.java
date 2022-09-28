package com.techtutes.profswitch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class ProfController {

	@Value("${profile.developer}")
	String profileDeveloper;
	@GetMapping
	public String helloProfile()
	{
		return "hello "+profileDeveloper;
	}
}
