package com.mypackage;

public class ExpDemo {
           public static void main(String[] args)
           {
        	   System.out.println("Open a file");
        	   try{
        	   int n=args.length;
        	   System.out.println("n=" +n);
        	   int a=45/n;
        	   System.out.println(a);
        	   }
        	   catch(Exception e)
        	   {
        	   System.out.println(e);
        	   System.out.println("Pls enter the values");
        	   }
        	   
           }
}
