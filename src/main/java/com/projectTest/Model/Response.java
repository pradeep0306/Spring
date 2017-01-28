package com.projectTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	private JsonResponse response;
	public Response() {
		super();
	 }

	public Response(JsonResponse response) {
		super();
		this.response = response;
	}

	public JsonResponse getResponse() {
		return response;
	}

	public void setResponse(JsonResponse response) {
		this.response = response;
	}
	
}
