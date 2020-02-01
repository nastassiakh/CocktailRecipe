package com.techelevator.Cocktails;

import java.util.ArrayList;
import java.util.List;

public class BloodyMary implements Recipe{
	
	

	public String getName() {
	
		return "Bloody Mary";
	}

	public List<String> getRecipe() {
		
		List<String> recipe = new ArrayList<String>();
		recipe.add("\n2 oz Vodka");
		recipe.add("\n4 oz Tomato juice");
		recipe.add("\n2 dashes Tabasco sauce");
		recipe.add("\n2 dashes Worcestershire sauce");
		recipe.add("\n1 dash Lime juice");
		recipe.add("\n1 pinch Celery salt");
		recipe.add("\nGarnish:\n[olives, lime wedge, celery stick]");
		
		return recipe;
	}
	
	
	public String toString() {
		
		String result = "";
		
		result += this.getName();
		
		for (String element : this.getRecipe()) {
			result +="\n";
			result += element;
		}
		
		return result;
	}
	
	

}
