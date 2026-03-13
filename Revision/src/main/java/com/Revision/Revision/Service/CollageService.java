package com.Revision.Revision.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Revision.Revision.Dto.CollageDto;
import com.Revision.Revision.Entity.Collage;
import com.Revision.Revision.Repository.CollageRepo;

@Service
public class CollageService {
	
	private CollageRepo repo;
	
	public CollageService( CollageRepo repo) {
		this.repo=repo;
	}
	
	public Collage addcollage(Collage collage) {
		Collage clg = repo.save(collage);
		return clg;
	}
	
	public List<CollageDto> getCollage(int page,int size){
		Pageable pageable = PageRequest.of(page, size);
		List<CollageDto> list = repo.findAll(pageable).stream().map((p)->{
			CollageDto clg = new CollageDto();
			clg.setId(p.getId());
			clg.setAddress(p.getAddress());
			clg.setName(p.getName());
			return clg;
		}).collect(Collectors.toList());
		return list;
	}

}
