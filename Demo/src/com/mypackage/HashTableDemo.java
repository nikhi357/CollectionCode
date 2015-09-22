package com.mypackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableDemo {

	private static Hashtable<String, Integer> ht;
	private static Scanner sc;

	public static void main(String[] args) {
		ht = new Hashtable<>();
		ht.put("kohli", 100);
		ht.put("sachin", 200);
		ht.put("Dravid", 150);
		System.out.println("The player names are:\n" + ht);
		System.out.println("raja");
		Enumeration<String> e = ht.keys();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
		sc = new Scanner(System.in);
		System.out.println("Enter the player to search their score:");
		String name = sc.next();
		// passing this name to the hash as a key value to search the score
		Integer value = ht.get(name);
		if (value == null) {
			System.out.println("palyer not found");
		} else {
			int n = value.intValue();
			System.out.println(name + "\t his score is\t :" + n);
		}

	}

}
