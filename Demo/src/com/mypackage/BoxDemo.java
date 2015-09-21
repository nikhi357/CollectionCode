package com.mypackage;

import java.util.Scanner;

public class BoxDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// converting to binary hex octal
		String str1 = Integer.toBinaryString(n);
		String str2 = Integer.toHexString(n);
		String str3 = Integer.toOctalString(n);
		String str4 = Integer.toString(n);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		double x = Math.ceil(4.5);
		double y = Math.floor(4.5);
		double z = Math.min(Math.max(8, 3), Math.min(8, 9));
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
}
