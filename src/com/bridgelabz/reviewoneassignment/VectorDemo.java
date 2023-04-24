package com.bridgelabz.reviewoneassignment;

import java.util.Vector;
import java.util.stream.Collectors;

public class VectorDemo {

	public static void main(String[] args) {
		// Creating a Vector
		Vector<Integer> vector = new Vector<>();

		// Adding elements to the Vector
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("Vector elements: " + vector);

		// Accessing elements by index
		System.out.println("Element at index 2: " + vector.get(2));

		// Updating an element
		vector.set(3, 45);
		System.out.println("Vector after updating element at index 3: " + vector);

		// Removing an element
		vector.remove(1);
		System.out.println("Vector after removing element at index 1: " + vector);

		// Checking if an element is present
		int elementToCheck = 30;
		System.out.println(elementToCheck + " is present in the Vector? " + vector.contains(elementToCheck));

		// Using Stream API to perform operations on Vector elements
		System.out.println("Vector elements doubled using Stream API: "
				+ vector.stream().map(element -> element * 2).collect(Collectors.toList()));

		// Performing other operations using Stream API
		int sum = vector.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of vector elements: " + sum);
	}
}
