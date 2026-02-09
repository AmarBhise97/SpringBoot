package com.school.School.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.School.Entity.School;
import com.school.School.Exception.schoolnotfoundexception;
import com.school.School.Service.Schoolservice;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/schoolcontroller")
public class SchoolController {
	
	
	@Autowired
	 private Schoolservice schoolser;
	
	List<String> keys=new ArrayList<String>();
	
	@PostMapping("/addschool")
	public School addschool(@RequestBody School school,@RequestHeader (value="key")String key)throws Exception {
		if(keys.contains(key)) {
			throw new Exception("Duplicate ID");
		}
		System.out.println("this is the adder method not the default method....");
		keys.add(key);
		System.out.println(key);
		return schoolser.addschool(school);
	}
	
	
//	@PostMapping("/addall")
//	public School addall(@RequestBody School school) throws Exception {
//		
//		return schoolser.addschool(school);
//		
//	}
	
	@GetMapping("/getbyid/{id}")
	public School getbyid(@PathVariable ("id")int id) throws Exception {
		return schoolser.getid(id);
	}
	
	@GetMapping("/getall")
	public List<School> getall() throws schoolnotfoundexception{
		return schoolser.getall();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteby(@PathVariable ("id")int schoolid) {
		return schoolser.deleteid(schoolid);
	}
	
	@GetMapping("/getallname/{name}")
	public List<School> getallname(@PathVariable ("name")String name){
		
		return schoolser.getbyname(name.toUpperCase());
	}
	
	@PutMapping("/updateaddress/{address}/{schooluiid}")
	public School updateaddress(@PathVariable(value="address") String address,@PathVariable(value="schooluiid")int schooluiid) {
		return schoolser.updateaddress(address, schooluiid);
	}

}
