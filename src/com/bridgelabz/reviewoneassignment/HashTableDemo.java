package com.bridgelabz.reviewoneassignment;

import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class HashTableDemo {

	public static void main(String[] args) {
		// Creating a Hashtable
		Hashtable<String, Integer> hashtable = new Hashtable<>();

		// Adding elements to the Hashtable
		hashtable.put("One", 1);
		hashtable.put("Two", 2);
		hashtable.put("Three", 3);
		hashtable.put("Four", 4);
		hashtable.put("Five", 5);

		System.out.println("Hashtable elements: " + hashtable);

		// Accessing the value associated with a key
		String keyToAccess = "Three";
		System.out.println("Value associated with key " + keyToAccess + ": " + hashtable.get(keyToAccess));

		// Removing an element from the Hashtable
		String keyToRemove = "Four";
		hashtable.remove(keyToRemove);
		System.out.println("Hashtable after removing key " + keyToRemove + ": " + hashtable);

		// Checking if a key is present in the Hashtable
		String keyToCheck = "Two";
		System.out.println("Key " + keyToCheck + " is present in the Hashtable? " + hashtable.containsKey(keyToCheck));

		// Using Stream API to perform operations on Hashtable elements
		System.out.println("Hashtable keys doubled using Stream API: "
				+ hashtable.keySet().stream().map(key -> key + key).collect(Collectors.toList()));

	}
}
