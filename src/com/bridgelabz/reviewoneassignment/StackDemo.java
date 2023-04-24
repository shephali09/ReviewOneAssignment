package com.bridgelabz.reviewoneassignment;

import java.util.*;
import java.util.stream.Collectors;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		// Pushing elements onto the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Stack elements: " + stack);
		
		// Pop an element from the stack
		System.out.println("Popped element from stack: " + stack.pop());
		

        // Peek at the top element of the stack
		System.out.println("Top element after pop: " + stack.peek());
		
		// Check if the stack is empty
		System.out.println("Is stack empty? " + stack.isEmpty());
		
		// Use Stream API to perform operations on stack elements
		
		System.out.println("Stack elements doubled using Stream API: " + stack.stream().map(element -> element * 2).collect(Collectors.toList()));
		
	}
}