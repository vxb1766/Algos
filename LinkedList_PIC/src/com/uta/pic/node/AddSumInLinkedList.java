package com.uta.pic.node;

public class AddSumInLinkedList {
	
	public static void main(String [] args){
		int [] a = {7,1,6};
		int [] b = {5,9,2};
		int num1 = 0,num2 = 0;
		int loopCounter = a.length>b.length?a.length:b.length;
		for(int i = 0 ; i < loopCounter ; i++){
			num1 = a[i]*(int) Math.pow(10, i)+num1;
			num2 = b[i]*(int) Math.pow(10, i)+num2;
		}
		System.out.println(num1+num2);
	}

}
