package com.bridgelabz.reviewoneassignment;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> mylist = new LinkedList<>();

		// add elements to the Linked list
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);

		// print elements of Linked list
		System.out.println("Elements of LinkedList are: " + mylist);

		// Use size() to get the number of elements
		System.out.println("Size of LinkedList: " + mylist.size());

		// Use get() to access an element at a specific index
		System.out.println("The Element at index 3 is: " + mylist.get(3));

		// Use contains() to check if an element is present
		System.out.println(mylist.contains(1) + " Element 1 contains in the LinkedList : ");
		System.out.println(mylist.contains(6) + " Element 6 does not contains in the LinkedList");

		// Use remove() to remove an element
		mylist.remove(1);
		System.out.println("LinkedList after removing the element at index 1: " + mylist);

		// Use stream() and filter() to filter elements
		List<Integer> evenNumbers = mylist.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers using Stream API: " + evenNumbers);

		// Use stream() and filter() to transform elements
		List<Integer> squares = mylist.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Square of numbers using Stream API: " + squares);

	}

}
