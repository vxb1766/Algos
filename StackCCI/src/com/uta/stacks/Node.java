package com.uta.stacks;

public class Node {
	int item;
	int minValue;

	Node(int item, int minValue) {
		this.item = item;
		this.minValue = minValue;
	}
	
	public String toString(){
		return "Item:"+item+" MinValue:"+minValue;
	}
	

}
