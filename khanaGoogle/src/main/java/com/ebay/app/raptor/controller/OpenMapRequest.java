package com.ebay.app.raptor.controller;

public class OpenMapRequest {
	
	private String location;
	private String state;
	private CountryEnum country;
	private String zipCode;
	private String format;
	private boolean polygon;
	private boolean addressdetails;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public CountryEnum getCountry() {
		return country;
	}
	public void setCountry(CountryEnum country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public boolean isPolygon() {
		return polygon;
	}
	public void setPolygon(boolean polygon) {
		this.polygon = polygon;
	}
	public boolean isAddressdetails() {
		return addressdetails;
	}
	public void setAddressdetails(boolean addressdetails) {
		this.addressdetails = addressdetails;
	}
	@Override
	public String toString() {
		return "?q=" + location + "," + state
				+ "," + zipCode + "&format=" + format + "&polygon="
				+ (polygon?"1":"0") + "&addressdetails=" + (addressdetails?"1":"0");
	}
	
	
	

}
