package com.mypackage;

public class ExpCreDemo extends Exception {
	private static final long serialVersionUID = 1L;
	private static int accno[] = { 1001, 1002, 1003 };
	private static String name[] = { "sreeu", "Raja", "vara" };
	private static double bal[] = { 4500.00, 6000.00, 1999.00 };

	ExpCreDemo() {
	}

	ExpCreDemo(String str) {
		super(str);
	}

	public static void main(String[] args) {
		try {
			System.out.println("accno" + "\t" + "name" + "\t" + "bal");
			for (int i = 0; i < 3; i++) {
				System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
				if (bal[i] < 2000) {
					ExpCreDemo me = new ExpCreDemo("balance is too low");
					throw me;
				}

			}

		} catch (ExpCreDemo me) {
			System.out.println(me);
		}
	}
}
