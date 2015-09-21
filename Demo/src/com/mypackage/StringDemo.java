package com.mypackage;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		char a[] = { 'r', 'a', 'j' };
		String s2 = new String(a);
		String s3 = new String(a, 0, 2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// Concatenation
		String x = s1.concat(s2);
		System.out.println(x);
		int l = x.length();
		System.out.println(l);
		// finding index of string at charecter level
		char y = x.charAt(3);
		System.out.println(y);

		boolean c = x.equalsIgnoreCase("helloraj");
		System.out.println(c);
		
		String sub=x.substring(0,x.indexOf("o"));
		System.out.println(sub);
		
		//string buffer
		
		StringBuffer sb=new StringBuffer(x);
		StringBuffer s5= sb.reverse();
		System.out.println(s5);
		String s6=s5.toString();
		System.out.println(s6);
		StringBuffer s7=s5.replace(0, 3,"raj");
		System.out.println(s7);
	}
}