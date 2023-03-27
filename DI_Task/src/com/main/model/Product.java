package com.main.model;

import java.util.List;
import java.util.Map;

public class Product {
	private int pId;
	private String pName;
	private float pPrice;
	private List<Dealer> ld;
	private Map<Integer,Supplier> ms;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getpPrice() {
		return pPrice;
	}
	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	public List<Dealer> getLd() {
		return ld;
	}
	public void setLd(List<Dealer> ld) {
		this.ld = ld;
	}
	public Map<Integer, Supplier> getMs() {
		return ms;
	}
	public void setMs(Map<Integer, Supplier> ms) {
		this.ms = ms;
	}
	

}
