package com.uta.pic.node;

/*
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than of equal to x.
*/
public class PartitionLinkedListUsingPointers {

	public Node partitionLinkedList(Node head, int x) {
		if (head == null)
			return head;

		Node prev = null, current = head;
		while (current != null) {
			/*
			 * There are two cases. Case 1: The current Node is greater than X.
			 * Eg: x = 35 and current Node is 45. In this case just increment
			 * the pointers or in other words just insert towards the tail.
			 */

			if (current.info >= x || current == head) {
				prev = current;
				current = current.link;
			}
			/*
			 * Case 2: Current is less than the current Node This means you need
			 * to insert at the front.
			 */
			else {
				Node next = current.link;
				prev.link = next;
				current.link = head;
				head = current;
				current = next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 45, 65, 37,34,32,67,87,12,98,56,123, 12, 13, 74 };
		Node head = new AppendToTail().buildLinkedList(input);
		new DisplayLinkedList().display(head);
		System.out.println();
		new DisplayLinkedList().display(new PartitionLinkedListUsingPointers().partitionLinkedList(head, 35));
	}

}
