package com.mypackage;


public class TestPatent {
	public static void main(String[] args) {
		String mytext = "99      32     41 9  ";
		mytext = mytext.replaceAll("( )+", " ");
		System.out.println(mytext);
		String str[]=mytext.split(" ");
		if(Integer.parseInt(str[2])>40)
		{
			System.out.println("Max Temp");
		}
		if(Integer.parseInt(str[3])<10)
		{
			System.out.println("Cold Temp");
		}
	}
}

