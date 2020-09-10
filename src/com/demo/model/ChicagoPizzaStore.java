package com.demo.model;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		else if(type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		
		return pizza;
	}

}