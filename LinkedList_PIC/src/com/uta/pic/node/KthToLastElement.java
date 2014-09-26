package com.uta.pic.node;

public class KthToLastElement {
	
	public Node kthElement(Node head , int k){
		Node first = head,last = head;
		while(last != null && k!=1){
			last = last.link;
			k--;
		}
		if(k != 1){
			System.out.println("invalid k");
			return null;
		}
		while(last.link != null){
			last = last.link;
			first = first.link;
		}
		
		return first;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {91,92,93,94,95,96,97,98};
		Node head = new AppendToTail().buildLinkedList(input);
		head = new KthToLastElement().kthElement(head , 12);
		new DisplayLinkedList().display(head);
		
	}

}
