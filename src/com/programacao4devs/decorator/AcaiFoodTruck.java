package com.programacao4devs.decorator;

import com.programacao4devs.decorator.model.Acai;
import com.programacao4devs.decorator.model.Food;
import com.programacao4devs.decorator.model.item.Banana;
import com.programacao4devs.decorator.model.item.Granola;
import com.programacao4devs.decorator.model.item.Morango;

public class AcaiFoodTruck {
	
	public static void main (String args[]) {
		Food acaiSemItem = new Acai();
		
		System.out.println(acaiSemItem.getDescription() + " R$ " + acaiSemItem.cost());
		
		Food acaiComItens = new Acai();
		acaiComItens = new Morango(acaiComItens);
		acaiComItens = new Banana(acaiComItens);
		acaiComItens = new Granola(acaiComItens);
		
		System.out.println(acaiComItens.getDescription() + " R$ " + acaiComItens.cost());
	}

}
