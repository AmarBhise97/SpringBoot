package com.order.Order.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.Order.Entity.UserOrder;
import com.order.Order.Service.OrderService;




@RestController
@RequestMapping("/Order")
public class OrderController {

 private	 static final Logger log=org.slf4j.LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private OrderService service;
	
	@PostMapping("/addorder")
	@CacheEvict(value = "order", allEntries = true)
	public UserOrder addorders(@RequestBody UserOrder order) throws InterruptedException {
		log.info("order saved"+order.getProductname());
		log.atError();
		return service.addorder(order);
	}
	
	@GetMapping("/getorder")
	@Cacheable(value = "order", key = "'all'")
	public List<UserOrder> getorders() throws InterruptedException{
		Thread.sleep(3000);
		return service.getorder();
	}
}
