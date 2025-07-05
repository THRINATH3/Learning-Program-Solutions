package com.cognizant.orm_learn;



import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
@EntityScan(basePackages = "com.cognizant.orm_learn.model")
public class OrmLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class); 
	private static CountryService countryService ;
	
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("Countries={}",countries);
		LOGGER.info("End");
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		System.out.println("Hello..");
		LOGGER.info("Inside Main.......");
		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
	}

}
