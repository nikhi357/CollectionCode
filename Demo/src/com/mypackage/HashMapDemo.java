package com.mypackage;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

	private static HashMap<String, Long> hm;
	private static Scanner sc;

	public static void main(String[] args) {
		hm = new HashMap<String, Long>();
		String name, str;
		Long phno;
		while (true) {
			System.out.println("1. store telephone entries");
			System.out.println("lookup for a phone number");
			System.out.println("3. Exit");
			System.out.println("Enter u r choice:");
			sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter person name:");
				name = sc.next();
				System.out.println("Enter the value as phone number");
				str = sc.next();
				phno = new Long(str);
				hm.put(name, phno);
				break;
			case 2:
				System.out.println("Enter name:");
				name = sc.next();
				phno = hm.get(name);
				System.out.println(name + " The phone number is:" + phno);
				break;
			default:
				System.out.println("u reached out of limit");
				System.exit(0);
			}

		}

	}

}
