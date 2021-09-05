package com.programacao4devs.decorator.model.item;

import com.programacao4devs.decorator.model.Food;

public class Banana extends ItemDecorator {
	
	Food food;
	
	public Banana(Food food) {
		this.food = food;
	}

	@Override
	public String getDescription() {
		return food.getDescription() + ", Banana";
	}

	@Override
	public double cost() {
		return 2.00 + food.cost();
	}
}
