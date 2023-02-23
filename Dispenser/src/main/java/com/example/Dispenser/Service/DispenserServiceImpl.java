package com.example.Dispenser.Service;

import org.springframework.stereotype.Service;

import com.example.Dispenser.Entity.Categories;

@Service
public class DispenserServiceImpl implements DispenserService{

	@Override
	public Categories makeBeverage(String b) {
		Categories c = null;
		switch(b)
		{
		case "water":
			c = new Categories(0,0,5,0.0f,0.25f);
			break;
		case "cappuccino":
			c = new Categories(10,0,20,0.2f,0.02f);
			break;
		case "latte":
			c = new Categories(20,0,35,0.2f,0.02f);
			break;
		case "steam":
			c = new Categories(0,0,10,0.0f,0.02f);
			break;
		case "espresso":
			c = new Categories(20,0,20,0.2f,0.02f);
			break;
		case "tea":
			c = new Categories(0,20,15,0.2f,0.05f);
			break;
		case "menu":
			c = new Categories(0,0,0,0.0f,0.0f);
			break;
		case "milk":
			c = new Categories(0,0,15,0.2f,0.05f);
			break;
		default :
			c = new Categories(0,0,0,0.0f,0.0f);
		}
		return c;
	}

}
