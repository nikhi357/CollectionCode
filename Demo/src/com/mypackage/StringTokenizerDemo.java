package com.mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokenizerDemo {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the pattern to separate with delimiter");
		String str=br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		Pattern p=Pattern.compile("19[0-9]2");
		System.out.println(st.countTokens());
		int count = 1;
		boolean b=false;
		while (st.hasMoreTokens()) {
			String str1= st.nextToken();
			Matcher m=p.matcher(str1);
			 b=m.matches();
			if(b==true)
			{
				int x=Integer.parseInt(str1);
				int y=(x+10);
				System.out.println("token number" +count+ " "  +y);
			}
			else
		  System.out.println("The token:"  +count+ " "+str1);	
			count++;
		}

	}

}
