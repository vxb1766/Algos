

import java.util.LinkedList;

public class ReverseLinkedList {
	private SingleNode root;
	
	
	public SingleNode getRoot(){
		return root;
	}
	
	public void setRoot(SingleNode root){
		this.root = root;
	}
	
	public SingleNode reverseList(SingleNode head){
		SingleNode prev,current,next;
		prev = null;
		current = head;
		while(current !=null){
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleNode n1 = new SingleNode(10);
		SingleNode n2 = new SingleNode(20);
		SingleNode n3 = new SingleNode(30);
		SingleNode n4 = new SingleNode(40);
		SingleNode n5 = new SingleNode(50);
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
		n4.link = n5;
		System.out.println("Before reversing:");
		new DisplayList().displayList(n1);
		ReverseLinkedList r = new ReverseLinkedList();
		new DisplayList().displayList(r.reverseList(n1));
		}
}
