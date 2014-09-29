package com.uta.geek.LinkedList;

public class BuildLinkedList {
	SingleNode head = null,temp;
	public SingleNode buildSingleLinkedList(int []input){
		for( int eachItem : input){
			temp = new SingleNode(eachItem);
			temp.link = head;
			head = temp;
		}
		
		return head;
	}
}
