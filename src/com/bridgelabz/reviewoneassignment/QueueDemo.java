package com.bridgelabz.reviewoneassignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class QueueDemo {

	public static void main(String[] args) {
		// Creating a Queue
		Queue<Integer> queue = new LinkedList<>();

		// Adding elements to the Queue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);

		System.out.println("Queue elements: " + queue);

		// Accessing the element at the front of the Queue
		System.out.println("Element at the front of the Queue: " + queue.peek());

		// Removing the element from the front of the Queue
		System.out.println("Removed element from the front of the Queue: " + queue.poll());

		// Checking if the Queue contains an element
		int elementToCheck = 30;
		System.out.println(elementToCheck + " is present in the Queue? " + queue.contains(elementToCheck));

		// Using Stream API to perform operations on Queue elements
		System.out.println("Queue elements doubled using Stream API: "
				+ queue.stream().map(element -> element * 2).collect(Collectors.toList()));

		// Performing other operations using Stream API
		int sum = queue.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of Queue elements: " + sum);
	}
}
