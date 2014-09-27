package com.uta.pic.node;

import java.util.*;

/*
 * Given two numbers represented by two lists, write a function that returns sum list. The sum list is list representation of addition of two input numbers.

 Example 1

 Input:
 First List: 5->6->3  // represents number 365
 Second List: 8->4->2 //  represents number 248
 Output
 Resultant list: 3->1->6  // represents number 613
 */
public class AddSumInLinkedList {
	int index;
	LinkedList<Integer> result;
	int length1, length2;

	public AddSumInLinkedList() {
		// TODO Auto-generated constructor stub
		result = new LinkedList<Integer>();
		index = 0;
	}

	/* First List: 5->6->3 represents number 365 */
	public void sumForReverseLinkedList(LinkedList<Integer> list1,
			LinkedList<Integer> list2) {
		int loopcounter = list1.size() > list2.size() ? list1.size() : list2
				.size();
		LinkedList<Integer> result = new LinkedList<Integer>();
		int carry = 0;
		int insert = 0;
		for (int i = 0; i < loopcounter; i++) {
			if (i < list1.size() && i < list2.size()) {
				insert = list1.get(i) + list2.get(i);

			} else {
				if (i >= list1.size()) {
					insert = list2.get(i);
				}
				if (i >= list2.size()) {
					insert = list1.get(i);
				}
			}

			if (insert + carry > 9) {
				result.add((insert + carry) % 10);
				carry = ((insert + carry) - result.get(i)) / 10;

			} else {
				result.add((insert + carry) % 10);
				carry = 0;

			}
		}
		if (carry != 0) {
			result.add(carry);
		}

	}

	public Node padZero(Node head, int k) {
		while (k > 0) {
			Node temp = new Node(0);
			temp.link = head;
			head = temp;
			k--;
		}

		return head;
	}

	public LinkedList<Integer> addForwardLinkedList(Node head1, Node head2) {
		getLength(head1, head2);

		if (length1 != length2) {
			int k;
			if (length1 > length2) {
				k = length1 - length2;
				head2 = padZero(head2, k);
			} else {
				k = length2 - length1;
				head1 = padZero(head1, k);
			}
		}

		int carry = addForward(head1, head2);
		if (carry != 0) {
			result.addFirst(carry);
		}
		return result;
	}

	public void getLength(Node head1, Node head2) {

		while (head1 != null) {
			length1++;
			head1 = head1.link;
		}
		while (head2 != null) {
			length2++;
			head2 = head2.link;
		}

	}

	public int addForward(Node head1, Node head2) {

		if (head1 == null && head2 == null) {
			return 0;
		}
		int carry = addForward(head1.link, head2.link);
		int sum = head1.info + head2.info;
		if (carry + sum > 9) {
			result.addFirst((carry + sum) % 10);
			carry = (carry + sum) / 10;
		} else {
			result.addFirst((carry + sum) % 10);
			carry = 0;
		}

		return carry;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(5);
		list1.add(6);
		list1.add(9);
		list1.add(9);
		list2.add(8);
		list2.add(4);

		new AddSumInLinkedList().sumForReverseLinkedList(list1, list2);
		int[] l1 = { 6, 4, 8, 9 };
		int[] l2 = { 5, 1 };

		Node head1 = new AppendToTail().buildLinkedList(l1);
		Node head2 = new AppendToTail().buildLinkedList(l2);
		System.out.println((new AddSumInLinkedList().addForwardLinkedList(
				head1, head2)).toString());

	}

}
