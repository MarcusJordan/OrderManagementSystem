package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Invetory inventory = new Invetory();

	    Item p1 = new Item(56345,2500.00, "Macbook Pro", "Laptop computer",
				 new ArrayList<String>(Arrays.asList("Laptop", "Apple", "Electronics")));

		Item p2 = new Item(56345,1500.00, "Macbook Pro", "Laptop_computer",
				new ArrayList<String>(Arrays.asList("Laptop", "Apple", "Electronics")));






		inventory.add(p1, 15);
		//inventory.add(p2, 18);
		System.out.println(inventory.contains(p2));
		System.out.println(inventory);
	    System.out.println(p1.equals(p2));
    }
}
