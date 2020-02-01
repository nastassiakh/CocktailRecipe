package com.techelevator.Cocktails;

import java.util.ArrayList;
import java.util.List;

public class Cosmopolitan implements Recipe{

	public String getName() {
		
		return "Cosmopolitan";
	}

	public List<String> getRecipe() {
		
		List<String> recipe = new ArrayList<String>();
		recipe.add("\n1.5 oz Citrus Vodka");
		recipe.add("\n1 oz Cointreau(Triple sec)");
		recipe.add("\n0.5 oz Lime juice");
		recipe.add("\n1 dash Cranberry juice");
		recipe.add("\nGarnish:\n[lime wheel]");
		
		return recipe;
	}
	
	public String toString() {
		
		String result = "";
		
		result += this.getName();
		
		for(String element : this.getRecipe()) {
			result +="\n";
			result+= element;
		}
		return result;
			
	}

}
