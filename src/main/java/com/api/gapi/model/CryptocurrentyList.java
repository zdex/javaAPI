package com.api.gapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CryptocurrentyList {

	@JsonProperty("cmc_rank")
	private Integer cmc_rank;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("symbol")
	private String symbol;	
	
	@JsonProperty("circulating_supply")
	private String circulating_supply;
	
	@JsonProperty("total_supply")
	private String total_supply;
	
	@JsonProperty("max_supply")
	private String max_supply;	
	

	
}
