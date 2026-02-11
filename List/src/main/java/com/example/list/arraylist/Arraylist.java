package com.example.list.arraylist;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		 fruits.add("apple");
		 fruits.add("banana");
		 fruits.add("watermelon");
		  System.out.println( "fruits" + fruits);
		    String getFruitbyindex =  fruits.get(2);
		    System.out.println( "getfruits :" + getFruitbyindex);
		    
		  fruits.remove("banana");
		 
		  fruits.add(2,"pear");
		  System.out.println(" get fruits after adding pear"+ fruits);

	}

}
