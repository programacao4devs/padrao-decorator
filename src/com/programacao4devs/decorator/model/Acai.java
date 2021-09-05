package com.programacao4devs.decorator.model;

public class Acai extends Food {

	public Acai() {
		description = "Açaí";
	}
	
	@Override
	public double cost() {
		return 10.00;
	}
	
}
