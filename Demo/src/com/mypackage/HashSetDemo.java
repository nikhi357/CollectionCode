package com.mypackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

	private static HashSet<Integer> hs;
	private static Scanner sc;

	public static void main(String[] args) {
		hs = new HashSet<Integer>();
		ArrayList<Integer> arl = new ArrayList<Integer>();
		System.out.println("Enter elements in both array and hashset");
		sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Integer value:");
			int n = sc.nextInt();
			hs.add(n);
			arl.add(n);
		}
		System.out.println("Hashset====" + hs);
		System.out.println("ArrayList====" + arl);
	}

}
