package com.uta.pic.node;

/*
 * Given only a pointer to a node to be deleted in a singly linked list, how do you delete it?
 * Logic: What you are basically doing is deleting n.next
*/
public class DeleteMiddleNode {
	
	public Node deleteNode(Node n){
		if(n == null || n.link == null){
			System.out.println("Cannot delete...");
			return null;
		}
		else{
			Node temp = n.link;
			n.info = temp.info;
			n.link = temp.link;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {91,92,93,94,95,96,97,98};
		Node head = new AppendToTail().buildLinkedList(input);
		head = new KthToLastElement().kthElement(head , 4);
		System.out.println("Before Deleting Node was:"+head.info);
		head = new DeleteMiddleNode().deleteNode(head);
		System.out.println("After Deleting Node is:"+head.info);
	}

}
