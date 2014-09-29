package com.uta.tries;

import java.util.PriorityQueue;

public class Tries {

	Node root;

	public Tries() {
		root = new Node(' ');
	}

	// input = "victor"
	public void insert(String input) {
		Node current = root;
		for(int i = 0 ; i < input.length();i++){
			Node child = current.subNode(input.charAt(i));
			if(child == null){
				current.children.add(new Node(input.charAt(i)));
				current = current.subNode(input.charAt(i));
			}
			else{
				current = child;
			}
			if(i == input.length() -1){
				current.marker = true;
			}
		}

	}
	
	public boolean search(String input){
		Node current = root;
		for(int i = 0 ; i < input.length(); i++){
			current = current.subNode(input.charAt(i));
			if(current == null){
				return false;
			}
			if((i == input.length() - 1) && current.marker){
				return true;
			}
			
			
		}
		return false;
	}
	
	public static void main(String [] args){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Tries t = new Tries();
		t.insert("victor");
		t.insert("vick");
		System.out.println(t.search("vicktor"));
	}

}
