package org.tapestry5.banquet.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.EventConstants;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.beaneditor.Validate;
import org.tapestry5.banquet.entities.User;

/**
 * Start page of application tapestry5-banquet.
 */
public class Index
{
	@Property
	@Persist
	private List<String> mainCourse;
	
	@SessionState
	private User user;
	
	@OnEvent(EventConstants.ACTIVATE)
	public void activate(){
		if(mainCourse==null){
			mainCourse=new ArrayList<String>();
			mainCourse.add("Fish");
			mainCourse.add("Pizza");
			mainCourse.add("Pasta");
			mainCourse.add("Steak");
		}
		if(user==null)
			user=new User();
	}
	
	@Property
	private boolean coffee;
	
	@Property
	@Validate("required")
	private String dessert;
	
	@Property
	@Validate("required")
	private String mainCourseChosen;
	
	@OnEvent(value=EventConstants.SUCCESS, component="meal")
	public Object successForm(){
		user.addMeal(mainCourseChosen);
		user.addMeal(dessert);
		if(coffee)
			user.addMeal("coffee");
		return Validation.class;
	}
}
