package org.javaturk.oofp.ch10.list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("At the beginning");
		stack.forEach(System.out::println);
		
		System.out.println("Empty? " + stack.empty());
		System.out.println("Size: " + stack.size());
		
		System.out.println("\nPopulating.");
		System.out.println("Pushing: " + stack.push("one"));
		System.out.println("Pushing: " + stack.push("two"));
		System.out.println("Pushing: " + stack.push("three"));
		
		System.out.println("\nAfter populating.");
		System.out.println("Size: " + stack.size());
		stack.forEach(System.out::println);
		
		System.out.println("\nPoping: " + stack.pop());
		System.out.println("\nAfter poping.");
		System.out.println("Size: " + stack.size());
		stack.forEach(System.out::println);
		
		System.out.println("\nPeeking: " + stack.peek());
		System.out.println("\nPoping: " + stack.pop());
		System.out.println("\nPeeking: " + stack.peek());
	}
}
