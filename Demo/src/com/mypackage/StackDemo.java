package com.mypackage;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	private static Scanner sc;

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int ele, pos, ch = 0;
		sc = new Scanner(System.in);
		while (ch < 4) {
			System.out.println("Stack operations menu");
			System.out.println("1.push operation");
			System.out.println("2.pop operation");
			System.out.println("3.search for element");
			System.out.println("4.Exit");
			System.out.println("enter u r choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element");
				ele = sc.nextInt();
				st.push(ele);
				break;
			case 2:
				System.out.println("Remove ele from top of stack");
				Integer i = st.pop();
				System.out.println("popped ele" + i);
				break;
			case 3:
				System.out.println("Enter ele to search:");
				ele = sc.nextInt();
				pos = st.search(ele);
				if (pos == -1)
					System.out.println("element not found");
				else
					System.out.println("element found at pos" + pos);
				break;
			default:
				System.out.println("u reached out of limit");
				return;
			}
			System.out.println("Final stack" + st);
		}
	}

}
