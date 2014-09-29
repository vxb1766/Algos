package com.uta.geek.LinkedList;

public class DeleteGivenSinglePointer {

	public SingleNode deleteNodeGivenItsPointer(SingleNode Node, SingleNode head){
		SingleNode temp = Node.link;
		Node = temp;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {10,20,30,40,50,60,70,80,90,100};
		SingleNode head = new BuildLinkedList().buildSingleLinkedList(input);
		new DisplayList().displayList(head);
		new DisplayList().displayList(new DeleteGivenSinglePointer().deleteNodeGivenItsPointer(head.link.link.link,head));
				

	}

}
