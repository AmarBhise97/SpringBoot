package com.pagination.Pagination.Controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pagination.Pagination.DTo.CarDTO;
import com.pagination.Pagination.Entity.Car;
import com.pagination.Pagination.Service.CarService;

@RestController
@RequestMapping("/Car")
public class CarController {
	
	private CarService carservice;
	
	public CarController (CarService carservice) {
		this.carservice=carservice;
	}
	
	@PostMapping("/addcar")
	public Car addcar(@RequestBody Car car) {
		
		return carservice.addcar(car);
		
	}
	@GetMapping("/getcar")
	public List<CarDTO> getcar(@RequestParam(value="num")int num,@RequestParam(value="size")int size){
		return carservice.getcar(num,size);
	}
	
	@GetMapping("/getallcar")
	public List<CarDTO > getallcar(@RequestParam(value="num")int num,@RequestParam(value="size")int size,@RequestParam(value="field")String field,@RequestParam(value="direction")String direction)
	{
		return carservice.getallcar(num, size, field, direction);
	}

}
