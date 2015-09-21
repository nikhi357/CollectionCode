package com.mypackage;

import java.util.Scanner;

public class Test {
	private static Scanner sc;

	public static void main(String[] args) {
		int i = 0;
		sc = new Scanner(System.in);
		while (i < 3) {
			System.out.println("Since i m in loop");
			i = sc.nextInt();
			if(i>2)
			System.out.println("U entered value over 2, so loop is exiting");

		}
		System.out.println("I m out of loop becoz my vale is:" + i);
	}

}
