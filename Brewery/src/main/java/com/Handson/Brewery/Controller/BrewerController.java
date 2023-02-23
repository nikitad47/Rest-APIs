package com.Handson.Brewery.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Handson.Brewery.Enitity.BreweryCatalog;
import com.Handson.Brewery.Service.BreweryService;

@RestController
@RequestMapping("/brewery")
public class BrewerController {
	@Autowired
	private BreweryService service;
	
	
	@PostMapping("/addproducts")
	public List<BreweryCatalog> addProducts(){
		List<BreweryCatalog> products=new ArrayList<>();
		for(int i=1;i<11;i++) {
			products.add(new BreweryCatalog(i,"product"+i,i*10));
		}
		return service.saveProducts(products);
	}
	
	
	@GetMapping("/allproducts")
	public List<BreweryCatalog> allProducts(){
		return service.allProducts();
	}
	
	
	@PutMapping("/selectproduct/{id}")
	public String buyProduct(@PathVariable int id) {
		return service.buyProduct(id);
	}

}
