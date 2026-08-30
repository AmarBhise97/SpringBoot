package com.hospitalmanagment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.tags.shaded.org.apache.regexp.RE;

import com.hospitalmanagment.bean.Hospital;
import com.hospitalmanagment.util.DBConnection;

public class HospitalDao {
	
	public static final String Create_Hospital=
			"insert into hospital(hospitalname,hospitaladdress,hospitalfees) values(?,?,?)";
	
	public void createHospital(Hospital hospital)  {
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(Create_Hospital)){
			ps.setString(1, hospital.getHospitalname());
			ps.setString(2, hospital.getHospitaladdress());
			ps.setDouble(3, hospital.getHospitalfees());
			
			ps.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	public List<Hospital> getallHospital(){
		
		List<Hospital> hospital = new ArrayList<>();
		String url = "Select *from hospital";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(url)){
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int hospitalid= rs.getInt("hospitalid");
				String hospitalname=rs.getString("hospitalname");
				String hospitaladdress=rs.getString("hospitaladdress");
				double hospitalfees=rs.getDouble("hospitalfees");
				Hospital hospitals = new Hospital(hospitalid,hospitalname,hospitaladdress,hospitalfees);
				
				hospital.add(hospitals);
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return hospital;
		
	}
	public Hospital gethospital(int hospitalid) {
		Hospital hospital = null;
		String url = "select *from hospital where hospitalid=?";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(url)){
			ps.setInt(1, hospitalid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				hospital=new Hospital(
				rs.getString("hospitalname"),
				rs.getString("hospitaladdress"),
				rs.getDouble("hospitalfees"));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return hospital;
		
	}
	public boolean updatehospital(Hospital hospital) {
		
		String url="UPDATE hospital SET hospitalname=?, hospitaladdress=?, hospitalfees=? WHERE hospitalid=?";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(url)){
			ps.setString(1,hospital.getHospitalname() );
			ps.setString(2, hospital.getHospitaladdress());
			ps.setDouble(3, hospital.getHospitalfees());
			ps.setInt(4, hospital.getHospitalid());
			
			return ps.executeUpdate()>0;
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean deleteHospital(int hospitalid) {
		
		String url="delete from hospital where hospitalid=?";
		
		try(Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(url)){
			
			ps.setInt(1, hospitalid);
			return ps.executeUpdate()>0;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

}
