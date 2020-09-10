package com.demo.test;

import com.demo.model.ChicagoPizzaStore;
import com.demo.model.NYPizzaStore;
import com.demo.model.Pizza;
import com.demo.model.PizzaStore;

public class PizzaOrderTest {

	public static void main(String[] args) {
		PizzaStore nystore = new NYPizzaStore();
		Pizza pizza = nystore.orderPizza("cheese");
		System.out.println("ordered pizza: "+pizza.getName());
		Pizza pizza2 = nystore.orderPizza("veggie");
		System.out.println("ordered another pizza: "+pizza2.getName());
		System.out.println("");
		PizzaStore chicagoPizzastore = new ChicagoPizzaStore();
		Pizza pizza3 = chicagoPizzastore.orderPizza("cheese");
		System.out.println("ordered pizza from Chicago pizza store: "+pizza3.getName());
		Pizza pizza4 = chicagoPizzastore.orderPizza("veggie");
		System.out.println("ordered another pizza from Chicago pizza store: "+pizza4.getName());
	}

}
