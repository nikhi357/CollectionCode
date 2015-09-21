package com.mypackage;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedDemo {
	private static Scanner sc;

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("raja");
		ll.add("tarun");
		ll.add("nikhi");
		ll.add("vara");
		ll.add("ram");
		ll.add("thimma");
		System.out.println("list of elements" + ll);
		String ele;
		int pos, ch = 0;
		sc = new Scanner(System.in);
		while (ch < 4) {
			System.out.println("Linked list operations");
			System.out.println("1.insert an ele");
			System.out.println("2.remove an ele");
			System.out.println("3.change the ele");
			System.out.println("4.exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter element");
				ele = sc.next();
				System.out.println("Enter position");
				pos = sc.nextInt();
				ll.add(pos, ele);
				break;
			case 2:
				System.out.println("enter position");
				pos = sc.nextInt();
				ll.remove(pos);
				break;
			case 3:
				System.out.println("enter new element");
				ele = sc.next();
				System.out.println("enter the position");
				pos = sc.nextInt();
				ll.set(pos, ele);
				break;
			default:
				System.out.println("u reached out of choice limit");
				break;
			}
			System.out.println("list=" + ll);
		}

	}

}
