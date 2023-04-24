package com.bridgelabz.reviewoneassignment;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Creating a TreeSet
		Set<Integer> treeSet = new TreeSet<>();

		// Adding elements to the TreeSet
		treeSet.add(50);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(10);

		System.out.println("TreeSet elements: " + treeSet);

		// Removing an element from the TreeSet
		treeSet.remove(30);
		System.out.println("TreeSet after removing element 30: " + treeSet);

		// Checking if an element is present in the TreeSet
		int elementToCheck = 20;
		System.out.println(elementToCheck + " is present in the TreeSet? " + treeSet.contains(elementToCheck));

		// Using Stream API to perform operations on TreeSet elements
		System.out.println("TreeSet elements doubled using Stream API: "
				+ treeSet.stream().map(element -> element * 2).collect(Collectors.toCollection(TreeSet::new)));

	}
}
