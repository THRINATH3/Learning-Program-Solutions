package com.cognizant.controller;

import java.util.Base64;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.utility.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> authenticate(HttpServletRequest request){
		String authHeader = request.getHeader("Authorization");
		if(authHeader == null || !authHeader.startsWith("Basic ")) {
			return ResponseEntity.status(401).body("Missing Authorization header");
		}
		String credentials = authHeader.substring(6);
		String decodedCredentials = new String(Base64.getDecoder().decode(credentials));
		String[] parts = decodedCredentials.split(":", 2);
		String username = parts[0];
		String password = parts[1];	
		if (username.equals("user") && password.equals("pwd")) {
		    String token = jwtUtil.generateToken(username);
		    return ResponseEntity.ok(Map.of("token", token));
		} else {
		    return ResponseEntity.status(401).body("Invalid credentials");
		}
	}
}
