package com.programacao4devs.decorator.model;

public abstract class Food {
	
	String description = "General Food";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();

}
