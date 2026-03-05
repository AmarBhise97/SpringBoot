package com.fileUploading.FileUploading.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fileUploading.FileUploading.Repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("/upload")
	public String addstudent(@RequestPart(value="file") MultipartFile file[]) {
		StringBuffer name = new StringBuffer();
	    for(MultipartFile f : file) {
	       name.append(f.getOriginalFilename()).append("\n");
	       name.append("\n");
	    }
		return name+"Uploaded File succesfully";
	}

	@PostMapping("/upload1")
	public String addstudent1(@RequestPart(value="file1") MultipartFile file) throws IllegalStateException, IOException {
		
		
		String path= "E:\\Upload";
		File file2 = new File(path+"/"+file.getOriginalFilename());
		if(file2.exists()) {
			throw new FileAlreadyExistsException("Duplicate file not allow");
		}
		//file2.createNewFile();
		else{
		file.transferTo(file2);
		}
		return file.getOriginalFilename();
	}
	
	@PostMapping("/upload2")
	public ResponseEntity< String> addstudent2(@RequestPart(value="file1") MultipartFile file[]) throws IllegalStateException, IOException {
		
		StringBuffer name = new StringBuffer();
	    for(MultipartFile f : file) {
	    	  name.append(f.getOriginalFilename()).append("\n");
	    	String path= "E:\\Upload";
	      
			File file2 = new File(path+"/"+f.getOriginalFilename());
	   f.transferTo(file2);
	   
	    }
		return new ResponseEntity<String>( name+"Uploaded File succesfully",HttpStatus.CREATED);
		
		
	
	}


}
