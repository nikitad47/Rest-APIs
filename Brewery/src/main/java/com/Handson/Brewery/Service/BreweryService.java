package com.Handson.Brewery.Service;

import java.util.List;

import com.Handson.Brewery.Enitity.BreweryCatalog;

public interface BreweryService {
	List<BreweryCatalog> saveProducts(List<BreweryCatalog> products);
	List<BreweryCatalog> allProducts();
	String buyProduct(int id);
}
