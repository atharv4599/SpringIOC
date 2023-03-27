package com.main.model;

public class Dealer {
private int dealerId;
private String dealerName;
private long dealerMob;
public int getDealerId() {
	return dealerId;
}
public void setDealerId(int dealerId) {
	this.dealerId = dealerId;
}
public String getDealerName() {
	return dealerName;
}
public void setDealerName(String dealerName) {
	this.dealerName = dealerName;
}
public long getDealerMob() {
	return dealerMob;
}
public void setDealerMob(long dealerMob) {
	this.dealerMob = dealerMob;
}
@Override
public String toString() {
	return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerMob=" + dealerMob + "]";
}


}
