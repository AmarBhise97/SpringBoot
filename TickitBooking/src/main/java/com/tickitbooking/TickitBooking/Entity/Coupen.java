package com.tickitbooking.TickitBooking.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coupenid;
	private String coupnename;
	private String discount;
	
	public int getCoupenid() {
		return coupenid;
	}
	public void setCoupenid(int coupenid) {
		this.coupenid = coupenid;
	}
	public String getCoupnename() {
		return coupnename;
	}
	public void setCoupnename(String coupnename) {
		this.coupnename = coupnename;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	

}
