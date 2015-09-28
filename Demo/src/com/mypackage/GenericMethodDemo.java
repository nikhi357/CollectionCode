package com.mypackage;

class Gener {
	static <T> void display(T[] arr) {
		for (T t : arr)
			System.out.println(t);
	}
}

public class GenericMethodDemo {
	public static void main(String[] args) {
		Integer i[] = { 2, 3, 4, 5, 6 };
		String s[] = { "raja", "raani", "ravi" };
		Gener.display(i);
		Gener.display(s);
	}

}
