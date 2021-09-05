package com.programacao4devs.decorator.model.item;

import com.programacao4devs.decorator.model.Food;

public class Granola extends ItemDecorator {
	
	Food food;
	
	public Granola(Food food) {
		this.food = food;
	}

	@Override
	public String getDescription() {
		return food.getDescription() + ", Granola";
	}

	@Override
	public double cost() {
		return 2.00 + food.cost();
	}

}
