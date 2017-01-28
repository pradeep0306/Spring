package com.projectTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonResponse {

	private String message;
	private Country result;
	
 	public JsonResponse(String message, Country result) {
		super();
		this.message = message;
		this.result = result;
	}
	public JsonResponse() {
		super();
 	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Country getResult() {
		return result;
	}
	public void setResult(Country result) {
		this.result = result;
	}
	
	
}
