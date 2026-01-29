package com.student.Studentmanagment.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Studentmanagment.ent.Stud;


/**
 * using @PathVariable.(value="na').
 * 
 * 
 */


@RestController
@RequestMapping("/User2")
public class studentController {
	
	List<Stud> li= new ArrayList<Stud>();
	
	
	@PostMapping("/adduser/{na}")
	public String getname(@PathVariable (value="na")String name) {
		System.out.println("Name : "+name);
		String string=name.toUpperCase();
		return string;
	}
	@PostMapping("/adduser2/{name}/{mobile}")
	public String getName(@PathVariable (value ="name")String name,@PathVariable (value = "mobile") String mobile) {
		System.out.println("Name : "+name);
		System.out.println("Mobile : "+mobile);
		
		if(name!=null && mobile!=null ) {
			Stud st = new Stud();
			st.name=name;
			st.mobile=mobile;
			li.add(st);
			
		}
		System.out.println(li);
		return "Data added sussessfully";
	}
	
	@GetMapping("/adduser3/{mb}")
	public Stud getMobile(@PathVariable(value="mb")String mb) {
		List<Stud> lst =li.stream()
				.filter(i->i.mobile.equals(mb))
				.collect(Collectors.toList());
		return lst.get(0);
		
	}
	@GetMapping("/adduser4/{na}")
	public Stud getnamee(@PathVariable(value="na")String na) {
		List<Stud>list=li.stream()
				.filter(i->i.name.equals(na))
				.collect(Collectors.toList());
		    return list.get(0);
	}
	@PostMapping("/adduser4")
	public String adduser(@RequestBody Stud stud) {
		Stud std = new Stud();
		std.name=stud.name;
		std.mobile=stud.mobile;
		System.out.println(stud);
		return  stud.name ;
	}
}


