package com.example.list;
import java.util.List;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		List<Integer> numbers =new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	numbers.add(4);
//	System.out.println("numbers "+ numbers);
 System.out.println("numbers "+ numbers);
		
int index = numbers.indexOf(3);
numbers.remove(index);

  for(Integer n: numbers) {
	  System.out.println(n);
  }
	  
	}

}
