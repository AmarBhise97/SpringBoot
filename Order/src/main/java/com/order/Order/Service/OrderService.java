package com.order.Order.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.Order.Entity.UserOrder;
import com.order.Order.Repository.OrderRepo;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepo repo;
	
	
	public UserOrder addorder(UserOrder order) {
		return repo.save(order);
	}
	
	public List<UserOrder> getorder(){
		return repo.findAll();
	}
}
