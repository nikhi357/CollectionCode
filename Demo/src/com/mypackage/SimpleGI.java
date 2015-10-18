package com.mypackage;

public class SimpleGI<T, E> implements SimGI<T, E> {
	T t;
	E e;

	SimpleGI(T t, E e) {
		this.t = t;
		this.e = e;
	}

	public void add() {
		String s1 = t.toString();
		int x = Integer.parseInt(s1); 
		String s2 = e.toString();
		int y = Integer.parseInt(s2);
		System.out.println("Sum of two values u entered is:" + (x + y));
	}

	public static void main(String[] args) {
		SimpleGI<Integer, String> s = new SimpleGI<Integer, String>(143, "123");
		s.add();
	}
}
