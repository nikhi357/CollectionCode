package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ListSim {
	 public static void main(String[] args) {
	    String str="78266   raja     Developer  xxxxxxx       gender";
	    Integer enc[]={3,4};
	    StringTokenizer st=new StringTokenizer(str);
	    List<Integer> lt=new ArrayList<Integer>();
        Collections.addAll(lt,enc);
        Integer counter=0;
        while (st.hasMoreTokens()) {
        	   String s=st.nextToken();
             			if(lt.contains(counter))
             			{
             			   	System.out.println(s);
             			   	System.out.println(counter);
             			}
             			counter++;
		}
	 }        
}
