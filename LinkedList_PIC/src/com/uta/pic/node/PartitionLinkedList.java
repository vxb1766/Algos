package com.uta.pic.node;

import java.util.LinkedList;

public class PartitionLinkedList {

	public void display(int[] a) {
		for (int eachInt : a) {
			System.out.print(eachInt + "\t");
		}
		System.out.println();
	}

	public int partition(int[] a) {
		int pivot, i, j;
		pivot = a[0];
		i = 1;
		j = a.length - 1;
		while (i <= j) {
			while (i < a.length - 1 && a[i] < pivot)
				i++;

			while (j > 0 && a[j] > pivot)
				j--;

			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} else {
				int temp = a[j];
				a[j] = a[0];
				a[0] = temp;
			}

		}
		display(a);
		return a[j];
	}
/*
 * Need To Work on Partition
*/	
	public Node partition(Node head, int x){
		LinkedList<Node> less = new LinkedList<Node>();
		LinkedList<Node> greater = new LinkedList<Node>();
		Node current = head;
		while(current != null){
			if ( current.info > x){
				greater.add(current);
			}
			else{
				less.add(current);
			}
		}
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 45, 23, 63, 12, 32, 78, 64, 90 };
		System.out.println("Partition around: "
				+ new PartitionLinkedList().partition(a));
		int[] input = { 45, 23, 63, 12, 32, 78, 64, 90 };
		Node head = new AppendToTail().buildLinkedList(input);
		head = new PartitionLinkedList().partition(head,63);
		new DisplayLinkedList().display(head);
	}

}
