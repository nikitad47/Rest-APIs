package com.example.Dispenser.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dispenser.Entity.Categories;
import com.example.Dispenser.Service.DispenserServiceImpl;

@RestController
public class DispenserController {
	
	@Autowired
	private DispenserServiceImpl service;
	
	@GetMapping("/dispenser/{ing}")
	public Categories beverage(@PathVariable String ing)
	{
		return service.makeBeverage(ing);
	}

}
