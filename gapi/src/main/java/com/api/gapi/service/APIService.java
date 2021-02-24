package com.api.gapi.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.gapi.model.CryptocurrentyListResponse;

@Service
public class APIService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getName() {
		return "Gaurav Maheshwari";
	}
	
	public String getNameFromAPI() {
		 final String uri = "http://localhost:8080/employeeName";
		    RestTemplate restTemplate = new RestTemplate();
		     
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    headers.set("X-COM-PERSIST", "NO");
		    headers.set("X-COM-LOCATION", "USA");
		 
		    HttpEntity<String> entity = new HttpEntity<String>(headers);
		     
		    ResponseEntity<String> response = this.restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		    return response.getBody();
	}

	public CryptocurrentyListResponse cryptocurrencyListings() {
		 final String uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest";
		    RestTemplate restTemplate = new RestTemplate();
		     
		    HttpHeaders headers = new HttpHeaders();
		    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		    headers.set("X-COM-PERSIST", "NO");
		    headers.set("X-COM-LOCATION", "USA");
		    headers.set("Access-Control-Allow-Origin", "*");
		    headers.set("X-CMC_PRO_API_KEY", "a6dd0b1f-e8a7-4b44-8760-110921fab15a");
		 
		    HttpEntity<String> entity = new HttpEntity<String>(headers);
		     
		    ResponseEntity<CryptocurrentyListResponse> response = this.restTemplate.exchange(uri, HttpMethod.GET, entity, CryptocurrentyListResponse.class);
		    return response.getBody();
	}
}
