/*
 * Problem : Finding the Start of a Loop in a Circular Linked List
 * Not this problem is slightly different from detect if there's a loop.
 * Here you are also finding out where the loop is.
*/
package com.uta.pic.node;
public class LoopInCircularList {
	
	public Node getLoopStartingNode(Node head){
		if(head == null)return head;
		
		Node slow,fast;
		slow = fast = head;
		
		while((slow != fast) || (slow == head && fast == head)){
			if (slow == null || fast == null || fast.link == null || slow.link == null){
				return null;
			}
			slow = slow.link;
			fast = fast.link.link;
		}
		/*
		 * Out of the loop means slow == fast
		*/
		
		slow = head;
		while(slow != fast){
			slow = slow.link;
			fast = fast.link;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1,head2;
		int [] input = {91,92,93,94,95,96,97,98};
		 head1 = new AppendToTail().buildLinkedList(input);
		head2 = new KthToLastElement().kthElement(head1 , 1);
		head2.link = head1.link.link.link;
		head2 = new LoopInCircularList().getLoopStartingNode(head1);
		if(head2 != null)
			System.out.println(head2.toString());
		else
			System.out.println("Not a circular Linked List");
	}

}
