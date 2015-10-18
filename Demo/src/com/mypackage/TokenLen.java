package com.mypackage;

import java.util.StringTokenizer;

public class TokenLen {
	public static void main(String[] args) {
		String str = "Hello my world";
		StringTokenizer st1 = new StringTokenizer(str);
		while (st1.hasMoreTokens()) {
			String st2 = st1.nextToken();
			int len = st2.length();
			System.out.println(st2 + " The length is:" + len);
		}
	}

}
