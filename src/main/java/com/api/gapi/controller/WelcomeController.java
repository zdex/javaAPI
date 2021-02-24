package com.api.gapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gapi.model.CryptocurrentyListResponse;
import com.api.gapi.service.APIService;

@RestController
public class WelcomeController {
	
	@Autowired
	APIService service;
	
	@RequestMapping("/")
    public String home() {
        return "HelloWorld";
    }
	
	@RequestMapping("/employeeName")
	public  String empName() {
	    return service.getName();
	  }
	
	@RequestMapping("/employeeNameAPI")
	public String getNameFromAPI() {
		return service.getNameFromAPI();
	}
	
	@RequestMapping("/cryptocurrency/listings/latest")
	public CryptocurrentyListResponse cryptocurrencyListings() {
		CryptocurrentyListResponse resp = service.cryptocurrencyListings();
		return resp; 
	}
	
}
