package com.pagination.Pagination.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pagination.Pagination.DTo.CarDTO;
import com.pagination.Pagination.Entity.Car;
import com.pagination.Pagination.Repository.CarRepository;

@Service
public class CarService {

	private CarRepository carrepo;

	public CarService(CarRepository carrepo) {
		this.carrepo = carrepo;
	}

	public Car addcar(Car car) {

		Car c1 = carrepo.save(car);

		return c1;
	}
	
	public List<CarDTO> getcar(int num,int size){
		Pageable pagable = PageRequest.of(num, size);
		List<CarDTO> list= carrepo.findAll(pagable).stream().map((pag)->{
			CarDTO car = new CarDTO();
			car.setId(pag.getId());
			car.setName(pag.getName());
			car.setTime(pag.getTime());
			car.setModel(pag.getModel());
			car.setAveraje(pag.getAveraje());
			return car;
		}).collect(Collectors.toList());
		return list;
	}
	public List<CarDTO> getallcar(int num,int size,String field ,String direction){
		Sort sor;
		if(direction.equals("desc")|| direction.equals("DESC")) {
			sor=Sort.by(Sort.Direction.DESC,field);
		}
		else {
			 sor=Sort.by(Sort.Direction.ASC,field);
		}
		Pageable  page = PageRequest.of(num, size, sor);
		List<CarDTO> li = carrepo.findAll(page).stream().map((dto)->{
			CarDTO car = new CarDTO();
			car.setId(dto.getId());
			car.setName(dto.getName());
			car.setModel(dto.getModel());
			car.setAveraje(dto.getAveraje());
			car.setTime(dto.getTime());
			
			
			return car;
		}).collect(Collectors.toList());
		return li;
	}

}
