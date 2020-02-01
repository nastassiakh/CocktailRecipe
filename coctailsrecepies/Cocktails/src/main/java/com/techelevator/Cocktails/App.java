package com.techelevator.Cocktails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Recipe bloodyMary = new BloodyMary();
    	Recipe cosmopolitan = new Cosmopolitan();
    	
        System.out.println( "Pick a number of the recipe you wish to display" );
        System.out.println("(1) Bloody Mary ");
        System.out.println("(2) Cosmopolitan ");
        Scanner scan = new Scanner(System.in); 
        String userInput = scan.nextLine();
        int userSelection = Integer.parseInt(userInput);
        
         Map<Integer, Recipe> map = new HashMap<Integer,Recipe>();
         map.put(1, bloodyMary);
         map.put(2,cosmopolitan);
         
         System.out.println(map.get(userSelection).toString());

        
    }
}
