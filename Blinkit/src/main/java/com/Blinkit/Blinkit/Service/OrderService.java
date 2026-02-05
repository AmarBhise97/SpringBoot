package com.Blinkit.Blinkit.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Blinkit.Blinkit.DTO.OrderDto;
import com.Blinkit.Blinkit.Entity.Order1;
import com.Blinkit.Blinkit.Repository.OrderRepository;

@Service
public class OrderService {
	
	
	private OrderRepository orderrepo;
	
	public OrderService(OrderRepository orderrepo) {
		
		this.orderrepo=orderrepo;
	}
	
	public Order1 addorder(Order1 order1) {
		
		return orderrepo.save(order1);
	}
	
	public List<OrderDto> getorder(){
		
		return orderrepo.findAll().stream()
				.map((order)->{
					OrderDto orderdto = new OrderDto();
					orderdto.setCity(order.getAddress().getCity());
					orderdto.setDistrict(order.getAddress().getDistrict());
					orderdto.setItemid(order.getItemid());
					orderdto.setItemname(order.getItemname());
					orderdto.setPincode(order.getAddress().getPincode());
					orderdto.setPrice(order.getPrice());
					orderdto.setState(order.getAddress().getState());
					orderdto.setUserid(order.getUser().getUserid());
					orderdto.setUsername(order.getUser().getUsername());
					orderdto.setReviewid(order.getReview().getReviewid());
					orderdto.setProductname(order.getReview().getProductname());
					orderdto.setRating(order.getReview().getRating());
					orderdto.setComment(order.getReview().getComment());
					return orderdto;
				})
				.collect(Collectors.toList());
	}

}
