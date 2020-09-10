package com.demo.model;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
		return pizza;
		
	}

	protected abstract Pizza createPizza(String type);
	
}
