package org.testyanta.assignments.designpattern;

public class ReversePaln {
	public static void main(String[] args) {
	
	String str= "my name is manisha";
	String array[]=str.split(" ");
	String str1="";
	for(int i=array.length-1;i>=0;i--) {
		String ar=array[i]+"";
	    for(int j=ar.length()-1;j>=0;j--) {
		       str1=str1+ar.charAt(j);
		       
		       
	 }

	    
}
	System.out.println(str1);
	
	}
}

