package com.cognizant.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@GetMapping("/{id}")
	public ResponseEntity<?> getDetailsById(@PathVariable("id") String id){
		Map<String,Object>res  = new HashMap<>();
		res.put("number", "00987987973432");
		res.put("type", "savings");
		res.put("balance", 234343);
		return ResponseEntity.ok().body(res);
	}
}
