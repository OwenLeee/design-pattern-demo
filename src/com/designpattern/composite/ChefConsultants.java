package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ChefConsultants implements Chef{
	
	private List<Chef> chefs;
	
	public ChefConsultants() {
		this.chefs = new ArrayList();
	}
	
	public List<Chef> getChefs() {
		return chefs;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public void remove(Chef chef) {
		chefs.remove(chef);
	}
	
	public void makeADish() {
		for(Chef chef: chefs) {
			chef.makeADish();
		}
	}
}
