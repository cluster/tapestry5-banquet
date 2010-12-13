package org.tapestry5.banquet.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.tapestry5.banquet.entities.Delivery;
import org.tapestry5.banquet.entities.User;

public class Validation {

	@SessionState
	@Property
	private User user;
	
	@Property
	private String currentMeal, cityChosen;
	
	@Property
	private Delivery delivery;
	
	@OnEvent(value=EventConstants.PROVIDE_COMPLETIONS, component="city")
	public List<String> provideCompletionForCity(String entered){
		List<String> match=new ArrayList<String>();
		List<String> dictionnary=new ArrayList<String>();
		dictionnary.add("New York");
		dictionnary.add("New Castel");
		dictionnary.add("Lille");
		dictionnary.add("Paris");
		
		for(String t : dictionnary)
			if(t.startsWith(entered))
				match.add(t);
		
		return match;
	}
}
