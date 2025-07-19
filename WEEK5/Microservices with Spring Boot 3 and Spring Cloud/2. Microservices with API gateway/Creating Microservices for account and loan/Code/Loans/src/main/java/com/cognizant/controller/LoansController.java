package com.cognizant.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoansController {

	@GetMapping("/{id}")
	public ResponseEntity<?> getDetailsById(@PathVariable("id") String id){
		Map<String,Object>res  = new HashMap<>();
		res.put("number", "00987987973432");
		res.put("type", "car");
		res.put("loan", 400000);
		res.put("emi", 3258);
		res.put("tenure", 18);
		return ResponseEntity.ok().body(res);
	}
}
