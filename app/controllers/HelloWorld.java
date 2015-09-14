package controllers;

import model.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class HelloWorld extends Controller {
	
	
	public Result sayHello()
	{
		return ok("hello world!!");
	}
	
	public Result person(String name, int age)
	{
		return ok(views.html.person.render(name , age));
	}
	
	public Result personfom()
	{
		
		Person person = Form.form(Person.class).bindFromRequest().get();
				
		return ok(views.html.PersonDetails.render(person));
		
	}

}
