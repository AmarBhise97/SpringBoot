package com.Revision.Revision.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Revision.Revision.Dto.CollageDto;
import com.Revision.Revision.Entity.Collage;
import com.Revision.Revision.Service.CollageService;

@RestController
public class CollageController {
	
	private CollageService service;
	
	public CollageController(CollageService service) {
		this.service=service;
		
	}

	@PostMapping("addcollage")
	public Collage addcollage(@RequestBody Collage collage) {
		
		return service.addcollage(collage);
	}
	
	@GetMapping("getcollage")
	public List<CollageDto> getCollage(@RequestParam("page") int page,@RequestParam("size")int size){
		return service.getCollage(page, size);
		
	}
}
