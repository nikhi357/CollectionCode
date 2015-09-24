package com.mypackage;

import java.util.Scanner;

public class SimpleStringDemo {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String name = sc.next();
		String str = name.substring(5,9);
		System.out.println(str);
	}
}
