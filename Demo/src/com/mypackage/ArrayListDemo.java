package com.mypackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("raja");
		arl.add("ram");
		arl.add("rajan");
		arl.add("veera");
		System.out.println("array list:" + arl);
		arl.remove(2);
		System.out.println("array list" + arl);
		System.out.println("size of an array" + arl.size());
		// Retrieve an elements using the iterator
		Iterator<String> it = arl.iterator();
		/*
		 * while (it.hasNext()) { System.out.println(it.next());
		 * 
		 * }
		 */
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str);
			System.out.print("\t");
		}

	}

}
