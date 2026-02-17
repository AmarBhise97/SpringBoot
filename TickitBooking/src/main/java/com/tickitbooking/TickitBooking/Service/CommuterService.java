package com.tickitbooking.TickitBooking.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tickitbooking.TickitBooking.DTO.CommuterDto;
import com.tickitbooking.TickitBooking.DTO.Tickit2Dto;
import com.tickitbooking.TickitBooking.Entity.Commuter;
import com.tickitbooking.TickitBooking.Repository.CommuterRepo;

@Service
public class CommuterService {
	
	@Autowired 
	private CommuterRepo repo;
	
	public ResponseEntity<Commuter> addCommuter(Commuter commuter) {
		
		return new ResponseEntity<Commuter>(repo.save(commuter),HttpStatus.CREATED);
	}
	
	public List<CommuterDto> getCommuter(){
		return repo.findAll().stream().map((com) -> {
			CommuterDto dto = new CommuterDto();
			dto.setCommuterid(com.getCommuterid());
			dto.setEmailid(com.getEmailid());
			dto.setUsername(com.getUsername());
			dto.setUpiid(com.getUpiid());
			
			List<Tickit2Dto> tickit = com.getTickit().stream()
			.map((tik)->{
				
				Tickit2Dto tick = new Tickit2Dto();
				tick.setTickitid(tik.getTickitid());
				tick.setSource(tik.getSource());
				tick.setDistination(tik.getDistination());
				tick.setMode(tik.getMode());
				tick.setAmount(tik.getAmount());
				
				return tick;
			}).collect(Collectors.toList());
			
			dto.setTickit(tickit);
			return dto;
		
			
		}).collect(Collectors.toList());
		}
	}


