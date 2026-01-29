package com.jpMorgan.JPMorgan.Entity;

public class Company {
	String Company_Name;
	String Gst_Number;
	double turnover;

	public Company(String Company_Name,String Gst_Number,double turnover) {
		this.Company_Name=Company_Name;
		this.Gst_Number=Gst_Number;
		this.turnover=turnover;
	}

	public String getCompany_Name() {
		return Company_Name;
	}

	public void setCompany_Name(String Company_Name) {
		this.Company_Name = Company_Name;
	}

	public String getGst_Number() {
		return Gst_Number;

	}

	public void setGst_Number(String Gst_Number) {
		this.Gst_Number = Gst_Number;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	
}
