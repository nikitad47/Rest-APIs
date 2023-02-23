package com.Handson.Brewery.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Handson.Brewery.Enitity.BreweryCatalog;

@Service
public class BreweryServiceImp implements BreweryService{
	List<BreweryCatalog> allproducts;

	@Override
	public List<BreweryCatalog> saveProducts(List<BreweryCatalog> products) {
		this.allproducts=products;
		return products;}

	@Override
	public List<BreweryCatalog> allProducts() {
		// TODO Auto-generated method stub
		return this.allproducts;
	}

	@Override
	public String buyProduct(int id) {
		// TODO Auto-generated method stub
		Optional<BreweryCatalog> p=this.allproducts.stream().filter((data)-> data.getProductId()==id).findAny();
		if(p.isPresent()) {
			return "Dropping the Product please take it";
		}
		return "Error not found";
	}
	
	

}
