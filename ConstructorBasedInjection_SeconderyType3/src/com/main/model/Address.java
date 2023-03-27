package com.main.model;

public class Address {
	private String aeraName;
	private String cityName;
	private int pin;
	public Address(String aeraName, String cityName, int pin) {
		super();
		this.aeraName = aeraName;
		this.cityName = cityName;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [aeraName=" + aeraName + ", cityName=" + cityName + ", pin=" + pin + "]";
	}
	

}
