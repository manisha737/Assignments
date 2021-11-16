package org.testyanta.assignments.designpattern;

public class ReversePaln {
	public static void main(String[] args) {
	
	String str= "my name is manisha";
	String array[]=str.split(" ");
	String str1="";
	String str2="";
	String s=" ";
	System.out.println("====reverse the word=====");
	for(int i=array.length-1;i>=0;i--) {
		 str1=str1+" "+array[i];
	}
	System.out.println(str1);
	System.out.println("==========reverse the string==========");
	for(int i=str.length()-1;i>=0;i--) {
		str2=str2+str.charAt(i);
	}
	String s2[]=str2.split(" ");
	for(int i=s2.length-1;i>=0;i--) {
		 s=s+" "+s2[i];
	}
	System.out.println(s);
	}
}

