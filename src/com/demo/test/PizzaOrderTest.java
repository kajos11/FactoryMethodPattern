package com.demo.test;

import com.demo.model.NYPizzaStore;
import com.demo.model.Pizza;
import com.demo.model.PizzaStore;

public class PizzaOrderTest {

	public static void main(String[] args) {
		PizzaStore store = new NYPizzaStore();
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("ordered pizza: "+pizza.getName());
		Pizza pizza2 = store.orderPizza("veggie");
		System.out.println("ordered another pizza: "+pizza2.getName());
	}

}
