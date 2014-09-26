package com.uta.pic.node;

public class Node {
	int info;
	Node link;
	
	public Node(int info){
		this.info = info;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(); 
		sb.append(info);
		return sb.toString();
	}
	
}
