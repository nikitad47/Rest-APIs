package com.example.Dispenser.Entity;

public class Categories {
	
	private int coffeePowder;
	private int teaPowder;
	private int steam;
	private Float milk;
	private Float water;
	public int getCoffeePowder() {
		return coffeePowder;
	}
	public void setCoffeePowder(int coffeePowder) {
		this.coffeePowder = coffeePowder;
	}
	public int getTeaPowder() {
		return teaPowder;
	}
	public void setTeaPowder(int teaPowder) {
		this.teaPowder = teaPowder;
	}
	public int getSteam() {
		return steam;
	}
	public void setSteam(int steam) {
		this.steam = steam;
	}
	public Float getMilk() {
		return milk;
	}
	public void setMilk(Float milk) {
		this.milk = milk;
	}
	public Float getWater() {
		return water;
	}
	public void setWater(Float water) {
		this.water = water;
	}
	public Categories(int coffeePowder, int teaPowder, int steam, Float milk, Float water) {
		super();
		this.coffeePowder = coffeePowder;
		this.teaPowder = teaPowder;
		this.steam = steam;
		this.milk = milk;
		this.water = water;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Categories [coffeePowder=" + coffeePowder + ", teaPowder=" + teaPowder + ", steam=" + steam + ", milk="
				+ milk + ", water=" + water + "]";
	}

}
