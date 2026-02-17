package com.tickitbooking.TickitBooking.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="tk")
public class Tickit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tickitid;
	
	private String source;
	private String distination;
    private double amount;
    
    private String mode;
    private int discount;
    
    
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	
	
	@OneToOne
	Coupen coupen;

	@JoinColumn(name="commuterid")
	@ManyToOne
	private Commuter commuter;
	@OneToMany

	public int getTickitid() {
		return tickitid;
	}

	public void setTickitid(int tickitid) {
		this.tickitid = tickitid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	

	public String getDistination() {
		return distination;
	}

	public void setDistination(String distination) {
		this.distination = distination;
	}

	

	public Commuter getCommuter() {
		return commuter;
	}

	public void setCommuter(Commuter commuter) {
		this.commuter = commuter;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Coupen getCoupen() {
		return coupen;
	}

	public void setCoupen(Coupen coupen) {
		this.coupen = coupen;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	
	
	

	

}
