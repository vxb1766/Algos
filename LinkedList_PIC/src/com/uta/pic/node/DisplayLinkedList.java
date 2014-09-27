package com.uta.pic.node;

public class DisplayLinkedList {

	public void display(Node head){
		if(head == null){
			System.out.println("List is empty");
			return ;
		}
		Node current = head;
		while(current != null){
			System.out.print(current.info +"\t");
			current = current.link;
		}
		System.out.println();
	}
	
}
