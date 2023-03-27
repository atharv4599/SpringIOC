package com.main.model;

import java.util.List;

public class Supplier {
	private int supId;
	private String subName;
	private long supMob;
	private List<String> cities;
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public long getSupMob() {
		return supMob;
	}
	public void setSupMob(long supMob) {
		this.supMob = supMob;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", subName=" + subName + ", supMob=" + supMob + ", cities=" + cities + "]";
	}
	
	

}
