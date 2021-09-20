package com.gl.secondlab.java;

import java.util.Scanner;

public class Driver {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		int[] transaction=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the values of array");
			transaction[i]=sc.nextInt();
			
		}
		System.out.println("Enter the target");
		int target=sc.nextInt();
		PayMoney payMoney=new PayMoney();
		int no_of_days=payMoney.no_of_days(transaction, target);
		
		if(no_of_days==-1)
			System.out.println("Target is not achieved");
		else
			System.out.println("Target is achievable in"+no_of_days);
			
	}

}

