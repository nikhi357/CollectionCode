package com.mypackage;

public class Giimp<T> implements Simple<T> {
	T obj;

	Giimp(T obj) {
		this.obj = obj;
	}

	public T getObj(T obj) {
		return obj;
	}

	public void display() {
       System.out.println(this.obj);
	}
    public static void main(String[] args) {
		Giimp<Integer> i=new Giimp<Integer>(34);
		i.display();
		Giimp<String> s=new Giimp<String>("Raja");
		s.display();
		Giimp<Double> d;
		d=new Giimp<Double>(88.88);
		d.display();
	}
}
