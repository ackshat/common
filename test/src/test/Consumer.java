package test;

import test.PizzaFactory.Pizza;

public class Consumer {

	public static void main(String args[]){
		PizzaFactory pf = new PizzaFactory();
		Pizza p = pf.getPizza();
		
	}
	
}
