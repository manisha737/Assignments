package org.testyanta.assignments.designpattern;

import java.util.Scanner;

public class Owner {

	Scanner sc=new Scanner(System.in);
	public double cash;
    void money() {
    	System.out.println("enter money to give servant");
    	cash=sc.nextDouble();
		System.out.println("owner gave"+" "+cash+"to servant");
		
	}

	public static void main(String[] args) {
		

	}


}
