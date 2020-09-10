package com.demo.model;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	
	public void prepare() {
		System.out.println("preparing: "+name);
	}
	
	public void bake() {
		System.out.println("baking: "+name);
	}
	
	public void cut() {
		System.out.println("cutting pizza: "+name);
	}
	
	public void box() {
		System.out.println("boxed pizza: "+name);
	}

	public String getName() {
		return this.name;
	}

}
