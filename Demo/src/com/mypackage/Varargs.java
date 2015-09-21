package com.mypackage;

class Sample
{
	 public void sum(int...x)
	 {
		 int tot=0;
		 for (int i = 0; i < x.length; i++) 
			tot+=x[i];
		System.out.println(tot);
	 }
}


public class Varargs {

	public static void main(String[] args) {
		Sample s=new Sample();
		s.sum(2,4,4,5);
		s.sum(4,5,6,7,7,8);
		int a[]={1,4,5,6,6,7,8,9,9,5,4,3,3};
		s.sum(a);
	}

}
