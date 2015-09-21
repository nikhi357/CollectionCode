package com.mypackage;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		String s[] = { "raja", "rana", "vara" };
		for (String i : s) {
			v.add(i);
		}

		System.out.println("list" + v);
		System.out.println("using list iterator");
		ListIterator<String> li = v.listIterator();
		System.out.println("Elements in forward direction");
		while (li.hasNext()) {
			String str = li.next();
			System.out.print(str);
			System.out.print("\t");
		}
		System.out.println("\n");
		System.out.println("elements in reverse direction");
		while (li.hasPrevious()) {
			String str1 = li.previous();
			System.out.print(str1);
			System.out.print("\t");
		}

	}

}
