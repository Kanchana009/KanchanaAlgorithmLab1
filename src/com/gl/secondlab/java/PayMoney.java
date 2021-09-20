package com.gl.secondlab.java;

public class PayMoney {
public int no_of_days(int[] transaction,int target) {
	for(int i=0;i<transaction.length;i++) {
		if(transaction[i]==target||target<transaction[i])
			
			return i+1;
		
		else {
			target=target-transaction[i];
		}
		
	}
	
	return-1;
}
}
