package com.tickitbooking.TickitBooking.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Coupen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coupenid;
	private String coupnename;
	private int discount;
	
	
	@ManyToOne
	@JoinColumn(name="tickitid")
	 private Tickit tickit;
	
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
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}
