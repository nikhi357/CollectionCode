package com.mypackage;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// sort all elements
		Arrays.sort(a);
		System.out.println("Sorted array:");
		display(a);
		// search for an element in an array
		System.out.println("Enter an element to search:");
		int x = sc.nextInt();
		int pos = Arrays.binarySearch(a, x);
		if (pos < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at position:" + (pos + 1));
		}
	}

	static void display(int a[]) {
		for (int i : a)
			System.out.println(i);

	}
}
