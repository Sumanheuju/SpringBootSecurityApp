package com.vortexnepal.security.springsecuritydbapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/rest/starter")
@RestController
public class StarterController {
	
	@GetMapping("/all")
	public String publicIndex() {
		return "This is a public Place. Anyone can expose their Asses Here !!";
	}
	
	@PreAuthorize("hasAnyRole('USER')")
	@GetMapping("/secured/all")
	public String securedIndex() {
		return "This is a secured place, Only the chosen ones can expose their Asses Here !! We are Standard !!";
	}
}