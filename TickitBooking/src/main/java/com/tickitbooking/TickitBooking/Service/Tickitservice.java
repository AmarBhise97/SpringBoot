package com.tickitbooking.TickitBooking.Service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tickitbooking.TickitBooking.DTO.TickitDto;
import com.tickitbooking.TickitBooking.Entity.Commuter;
import com.tickitbooking.TickitBooking.Entity.Coupen;
import com.tickitbooking.TickitBooking.Entity.Googlepay;
import com.tickitbooking.TickitBooking.Entity.Payment;
import com.tickitbooking.TickitBooking.Entity.Phonepay;
import com.tickitbooking.TickitBooking.Entity.Tickit;
import com.tickitbooking.TickitBooking.Exception.InvalidPaymentException;
import com.tickitbooking.TickitBooking.Repository.CommuterRepo;
import com.tickitbooking.TickitBooking.Repository.TickitRepo;

@Service
@Transactional
public class Tickitservice {

	@Autowired
	private CommuterRepo commuterRepo;
	@Autowired
	private TickitRepo repo;

	public TickitDto addTickit(Tickit tickit) throws Exception {
		Commuter commuter = commuterRepo.findById(tickit.getCommuter().getCommuterid())
				.orElseThrow(() -> new RuntimeException("Commuter not found"));

		tickit.setCommuter(commuter);
		double amt = finalprice(tickit.getSource(), tickit.getDistination(),tickit.getDiscount());
		tickit.setAmount(amt);

		List<String> list = tickit.getCommuter().getUpiid();

		if (tickit.getMode().equals("phonepe")) {
			Payment pay = new Phonepay();
			if (pay.doPayment(list.get(0), "Metro@SBI", amt) == true) {
				return convert(repo.save(tickit));
			} else {
				throw new InvalidPaymentException("Invalid Payment Exception");
			}
		} else {
			if (tickit.getMode().equals("googlepay")) {
				Payment pay = new Googlepay();
				if (pay.doPayment(list.get(0), "Metro@SBI", amt) == true) {
					return convert(repo.save(tickit));
				} else {
					throw new InvalidPaymentException("Invalid Payment Exception");
				}
			}
		}

		return convert(repo.save(tickit));
//		TickitDto dto=new TickitDto();
//		 dto.setAmount(saved.getAmount());
//		 dto.setDistination(saved.getDistination());
//		 dto.setMode(saved.getMode());
//          dto.setSource(saved.getSource());
//          dto.setUpiid(Arrays.asList(saved.getCommuter().getUpiid().get(0)));
//          dto.setUsername(saved.getCommuter().getUsername());
	}

	public static double finalprice(String source, String distination,int discount) {

		LinkedHashMap<String, Integer> li = new LinkedHashMap<String, Integer>();

		li.put("pcmc", 0);
		li.put("stn", 10);
		li.put("nashikphata", 20);
		li.put("bhosari", 30);
		li.put("phugewadi", 40);
		li.put("dapodi", 50);
		li.put("bopodi", 60);
		li.put("khadki", 70);
		li.put("shivajinager", 80);
		li.put("dirsticcourt", 90);
		li.put("kasbapeth", 100);
		li.put("mandai", 110);
		li.put("swargate", 120);

		source = source.toLowerCase();
		distination = distination.toLowerCase();
//		Integer intital = li.get(source);
//		
//		Integer end = li.get(distination);
//		if (end > intital) {
//			return end - intital;
//		}
//		return intital - end;
		
		
		Integer initial = li.get(source);
		Integer  coupen= li.get(discount); 
		Integer end = li.get(distination);

		int amount;
		if (end > initial) {
		    amount = end - initial;
		} else {
		    amount = initial - end;
		}

		int dis=amount * coupen / 100;
		return amount = amount - dis;

		 


	}

	public List<TickitDto> gettickit() {
		return  repo.findAll().stream()
				.map((tickit)->{
					TickitDto tk = new TickitDto();
					tk.setTickitid(tickit.getTickitid());
					tk.setSource(tickit.getSource());
					tk.setDistination(tickit.getDistination());
					tk.setAmount(tickit.getAmount());
					tk.setMode(tickit.getMode());
					
					tk.setUsername(tickit.getCommuter().getUsername());
					tk.setUpiid(tickit.getCommuter().getUpiid());
					
					
		return tk;		
	}).collect(Collectors.toList());
		

}
	
	
	public static TickitDto convert(Tickit saved)
	{
		TickitDto dto=new TickitDto();
		 dto.setAmount(saved.getAmount());
		 dto.setDistination(saved.getDistination());
		 dto.setMode(saved.getMode());
         dto.setSource(saved.getSource());
         dto.setUpiid(Arrays.asList(saved.getCommuter().getUpiid().get(0)));
         dto.setUsername(saved.getCommuter().getUsername());
         return dto;
	}
}
