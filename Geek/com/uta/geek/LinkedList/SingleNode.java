package com.uta.geek.LinkedList;

public class SingleNode {
	int item;
	SingleNode link;
	
	SingleNode(int item){
		this.item = item;
	}
	
	public String toString(){
		return "Item:"+this.item;
	}
}
