package com.tickitbooking.TickitBooking.Entity;

import java.util.List;

import org.hibernate.validator.constraints.UniqueElements;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Commuter {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int commuterid;
   
   @NotNull
   private String username;
   @NotNull
   private String password;
   private String emailid;
   private List< String> upiid;
   
   @OneToMany(mappedBy="commuter")
   private List<Tickit> tickit;

   public int getCommuterid() {
	return commuterid;
   }

   public void setCommuterid(int commuterid) {
	this.commuterid = commuterid;
   }

   public String getUsername() {
	return username;
   }

   public void setUsername(String username) {
	this.username = username;
   }

   public String getPassword() {
	return password;
   }

   public void setPassword(String password) {
	this.password = password;
   }

   public String getEmailid() {
	return emailid;
   }

   public void setEmailid(String emailid) {
	this.emailid = emailid;
   }

   public List<String> getUpiid() {
	return upiid;
   }

   public void setUpiid(List<String> upiid) {
	this.upiid = upiid;
   }

   public List<Tickit> getTickit() {
	return tickit;
   }

   public void setTickit(List<Tickit> tickit) {
	this.tickit = tickit;
   }

   
   
   
  

   
   
   
}
