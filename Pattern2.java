package org.testyanta.assignments.designpattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
	    int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print("* ");
			}
		  System.out.println();
		}

	}

}
