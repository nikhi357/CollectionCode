package com.mypackage;

import java.util.Scanner;
import java.util.Vector;

class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + "\t" + name);
	}
}

public class VectorListED {
	private static Scanner sc;

	public static void main(String[] args) {
		Vector<Emp> v = new Vector<Emp>();
		sc = new Scanner(System.in);
		System.out.println("enter size of emp do u want to store");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("enter ID:");
			int ID = sc.nextInt();
			System.out.println("enter Name");
			String Name = sc.next();
			Emp e = new Emp(ID, Name);
			v.add(e);
		}
		System.out.println("retriving all this information");
		for (int i = 0; i < n; i++) {
			Emp e = v.get(i);
			e.display();

		}
	}

}
