package com.uta.tries;

import java.util.*;

public class Node {
	char content;
	boolean marker;
	LinkedList<Node> children;
	
	public Node(char content){
		this.content = content;
		this.children = new LinkedList<Node>(); 
		
	}
	
	public String toString(){
		return this.content+"";
	}
	
	public Node subNode(char content){
		for(Node eachNode: this.children){
			if(eachNode.content == content){
				return eachNode;
			}
		}
		return null;
	}
}
