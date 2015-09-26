package com.mypackage;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		int d = cl.get(Calendar.DATE);
		int m = cl.get(Calendar.MONTH);
		int y = cl.get(Calendar.YEAR);
		System.out.println("System date:" + ++m + "/" + d + "/" + y);
		int h = cl.get(Calendar.HOUR);
		int min = cl.get(Calendar.MINUTE);
		int sec = cl.get(Calendar.SECOND);
		System.out.println("System time is:" + h + ":" + min + ":" + sec);
	}

}
