package com.projectTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geo {

	private String lat;
	private String lng;
	
	public Geo() {
		super();
	}
	public Geo(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	
	
}
