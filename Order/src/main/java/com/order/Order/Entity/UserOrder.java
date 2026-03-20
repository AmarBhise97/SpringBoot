package com.order.Order.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserOrder implements Serializable {

	/**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	 /**
	  * 
	  */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int orderid;
	
	String productname;
	
	String ordertype;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	
	
	
}
