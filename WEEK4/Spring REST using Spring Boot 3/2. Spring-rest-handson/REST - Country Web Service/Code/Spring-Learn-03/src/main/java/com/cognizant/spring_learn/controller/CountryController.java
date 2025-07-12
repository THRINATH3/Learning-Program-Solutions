package com.cognizant.spring_learn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.cognizant.Country;

@RestController
public class CountryController {
	
	@RequestMapping("/country")
	public ResponseEntity<?> getCountryIndia(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country",Country.class);
		return ResponseEntity.ok().body(country);
	}
}
