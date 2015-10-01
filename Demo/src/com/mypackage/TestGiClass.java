package com.mypackage;

public class TestGiClass<T> implements TestGi<T> {
	private T x;
	public T get()
	{
		return this.x;
	}
	public void set(T x)
	{
		this.x=x;
	}
	public static void main(String[] args) {
	  TestGiClass<String>  s1=new TestGiClass<>();
	  s1.set("Raja");
	  TestGiClass<String>  s2=new TestGiClass<>();
	  s2.set("raja");
	  boolean x=s1.get().equalsIgnoreCase(s2.get());
	  if(x==true)
	  {
		  System.out.println("Both are same");
	  }
	  else
	  {
		  System.out.println("Both are not same");
	  }

	}
}
