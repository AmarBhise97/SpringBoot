package com.hospitalmanagment.bean;

public class Hospital {
	
	int hospitalid;
	String hospitalname;
	String hospitaladdress;
	double hospitalfees;
	
	
	public Hospital() {
		
	}
	public Hospital(String hospitalname, String hospitaladdress, double hospitalfees) {
		super();
		this.hospitalname = hospitalname;
		this.hospitaladdress = hospitaladdress;
		this.hospitalfees = hospitalfees;
	}
	public Hospital(int hospitalid, String hospitalname, String hospitaladdress, double hospitalfees) {
		super();
		this.hospitalid = hospitalid;
		this.hospitalname = hospitalname;
		this.hospitaladdress = hospitaladdress;
		this.hospitalfees = hospitalfees;
	}
	public int getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(int hospitalid) {
		this.hospitalid = hospitalid;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public String getHospitaladdress() {
		return hospitaladdress;
	}
	public void setHospitaladdress(String hospitaladdress) {
		this.hospitaladdress = hospitaladdress;
	}
	public double getHospitalfees() {
		return hospitalfees;
	}
	public void setHospitalfees(double hospitalfees) {
		this.hospitalfees = hospitalfees;
	}
	
	

}
