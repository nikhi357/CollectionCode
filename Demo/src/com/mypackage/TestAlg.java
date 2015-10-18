package com.mypackage;

public class TestAlg {
	public static void main(String[] args) {
		int p = 6;
		for (int i = 0; i < p; i++)
			for (int j = i+1; j < i + 2; j++) {
				System.out.println(i + " " + j);
			}
	}

}
