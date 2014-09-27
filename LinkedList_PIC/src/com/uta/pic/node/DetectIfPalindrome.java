/*
 * Given a singly linked list of characters, 
 * write a function that returns true if the given list is palindrome, else false.
*/
package com.uta.pic.node;

public class DetectIfPalindrome {
	
	public Node reverseLinkedList(Node head , Node tail){
		Node prev, current, next;
		prev = null;
		current = head;
		while( current != null ){
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
			
		}
		return  prev;
	}
	
	public boolean checkForPalindrome(Node head1, Node head2){
		while(head1.link != null){
			if(head1.info == head2.info){
				head1 = head1.link;
				head2 = head2.link;
			}else{
				return false;
			}
				
		}
		return true;
	}

	public boolean isPalindrome(Node head){
		if(head == null) return false;
		Node slow,fast;boolean isEven = true;
		slow = fast = head;
		Node head2 = null;
		while(fast != null){
			/*
			 * This means we have odd number of nodes.
			 * and fast is pointing to last node.
			 * In this case slow will exactly point to middle element i.e 3 in 1,2,3,4,5
			 * But you need to split the elemnts as 1,2 and 4,5 
			 * so donot increment slow in this case
			*/
			if(fast.link == null){
				isEven = false;
				break;
			}
			if(fast.link.link == null){
				isEven = true;
				break;
			}
			slow = slow.link;
			fast = fast.link.link;
		}
		if(isEven){
			slow.link = reverseLinkedList(slow.link, fast.link);
			head2 = slow.link;
			
		}
		else{
			slow.link = reverseLinkedList(slow.link, fast);
			head2 = slow.link;
		}
		fast = head2;
		while(fast != null){
			if(head.info == head2.info){
				head = head.link ; 
				head2 = head2.link;
			}
			else{
				return false;
			}
			fast = fast.link;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {};
		Node head = new AppendToTail().buildLinkedList(input);
		new DisplayLinkedList().display(head);
		System.out.println(new DetectIfPalindrome().isPalindrome(head));
	}

}
