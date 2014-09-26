package com.uta.pic.node;

public class DisplayLinkedList {

	public void display(Node head){
		if(head == null){
			System.out.println("List is empty");
			return ;
		}
		Node current = head;
		while(current != null){
			System.out.println(current.info);
			current = current.link;
		}
	}
	
}
