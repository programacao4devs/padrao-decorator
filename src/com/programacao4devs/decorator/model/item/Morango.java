package com.programacao4devs.decorator.model.item;

import com.programacao4devs.decorator.model.Food;

public class Morango extends ItemDecorator {
	
	Food food;
	
	public Morango(Food food) {
		this.food = food;
	}

	@Override
	public String getDescription() {
		return food.getDescription() + ", Morango";
	}

	@Override
	public double cost() {
		return 2.00 + food.cost();
	}
}
