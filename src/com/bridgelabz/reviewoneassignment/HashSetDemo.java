package com.bridgelabz.reviewoneassignment;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetDemo {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<Integer> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);

        System.out.println("HashSet elements: " + hashSet);

        // Removing an element from the HashSet
        hashSet.remove(30);
        System.out.println("HashSet after removing element 30: " + hashSet);

        // Checking if an element is present in the HashSet
        int elementToCheck = 20;
        System.out.println(elementToCheck + " is present in the HashSet? " + hashSet.contains(elementToCheck));

        // Using Stream API to perform operations on HashSet elements
        System.out.println("HashSet elements doubled using Stream API: " +
                hashSet.stream()
                        .map(element -> element * 2)
                        .collect(Collectors.toSet()));

        // Performing other operations using Stream API
        int sum = hashSet.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of HashSet elements: " + sum);
    }
}
