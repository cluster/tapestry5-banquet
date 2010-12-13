package org.tapestry5.banquet.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	
	
	public User() {
	}

	public List<String> meal=new ArrayList<String>();
	
	public Delivery delivery;

	public List<String> getMeal() {
		return meal;
	}

	public void addMeal(String meal) {
		this.meal.add(meal);
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	
	
}
