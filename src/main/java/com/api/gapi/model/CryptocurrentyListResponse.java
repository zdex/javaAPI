package com.api.gapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CryptocurrentyListResponse {

	@JsonProperty("data")
	private List<CryptocurrentyList> data;

	public List<CryptocurrentyList> getCryptocurrentyList() {
		return data;
	}

	public void setCryptocurrentyList(List<CryptocurrentyList> cryptocurrentyList) {
		this.data = cryptocurrentyList;
	}
	
	
}
