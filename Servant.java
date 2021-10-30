package org.testyanta.assignments.designpattern;

import java.util.Scanner;

public class Servant extends Owner {
	public double spent;
    Scanner sc=new Scanner(System.in);
    void buy() {
		System.out.println("enter how much the servant paid for buying stuffs");
		this.spent=sc.nextDouble();
		}
	void moneyLeft() {
		super.money();
		buy();
		double left=super.cash-spent;
		System.out.println("servant will return"+left);
		
	}
	
	public static void main(String[] args) {
	Servant serve=new Servant();
	serve.moneyLeft();
	}

}
