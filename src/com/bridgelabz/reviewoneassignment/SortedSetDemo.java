package com.bridgelabz.reviewoneassignment;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortedSetDemo {

	public static void main(String[] args) {
		// Creating a SortedSet
		SortedSet<Integer> sortedSet = new TreeSet<>();

		// Adding elements to the SortedSet
		sortedSet.add(50);
		sortedSet.add(30);
		sortedSet.add(40);
		sortedSet.add(20);
		sortedSet.add(10);

		System.out.println("SortedSet elements: " + sortedSet);

		// Accessing the first and last element in the SortedSet
		System.out.println("First element in the SortedSet: " + sortedSet.first());
		System.out.println("Last element in the SortedSet: " + sortedSet.last());

		// Removing an element from the SortedSet
		sortedSet.remove(30);
		System.out.println("SortedSet after removing element 30: " + sortedSet);

		// Checking if an element is present in the SortedSet
		int elementToCheck = 20;
		System.out.println(elementToCheck + " is present in the SortedSet? " + sortedSet.contains(elementToCheck));

		// Using Stream API to perform operations on SortedSet elements
		System.out.println("SortedSet elements doubled using Stream API: "
				+ sortedSet.stream().map(element -> element * 2).collect(Collectors.toCollection(TreeSet::new)));

	}
}
