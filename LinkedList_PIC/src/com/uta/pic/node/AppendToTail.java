package com.uta.pic.node;
/*
 * Given an array of elements, this method is used to Build a Single linked List and append the array elements to the tail.
 * buildLinkedList Method return the head of the linked List
*/
public class AppendToTail {
	Node head,current;
	public Node buildLinkedList(int [] input){
		if(input.length == 0){
			return null;
		}
		head = new Node(input[0]);
		current = head;
		int i = 1;
		while(i < input.length && current != null ){
			Node temp = new Node(input[i++]);
			current.link = temp;
			current = current.link;
		}
		return head;
	}
	
	public static void main(String [] args){
		int []a = {1,2,3,4,3,4,5};
		Node head = new AppendToTail().buildLinkedList(a);
		new DisplayLinkedList().display(head);
	}
}
