package com.uta.pic.node;
/*
 * Version 1: Use HashSet to keep track of elements.
 * Space : O(n)
 * Time : O(n)
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicates {

	public Node removeDuplicates(Node head){
		HashSet<Integer> set = new HashSet<Integer>();
		Node current = head;
		Node prev = null;
		while(current != null){
			if(!set.contains(current.info)){
				set.add(current.info);
				prev = current;
				current = current.link;
				
			}else{
				current = current.link;
				prev.link = current;
			}
			
		}
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {91,92,93,93,93,94,94,95,96,97,91};
		Node head = new AppendToTail().buildLinkedList(input);
		head = new RemoveDuplicates().removeDuplicates(head);
		new DisplayLinkedList().display(head);
		/*LinkedList<Integer> input = new LinkedList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		input.add(91);
		input.add(92);
		input.add(93);
		input.add(91);
		input.add(91);
		System.out.println(input.toString());
		boolean[] removeElement = new boolean[input.size()];
		for (int i = 0; i < input.size(); i++) {
			if (!set.contains(input.get(i))) {
				set.add(input.get(i));
				
			} else {
				removeElement[i] = true;
			}
		}
		for(int i = removeElement.length-1 ; i >= 0 ; i--){
			if(removeElement[i]){
				input.remove(i);
			}
			
		}
		
		for(int i = input.size()-1 ; i>= 0; i--){
			if (!set.contains(input.get(i))) {
				set.add(input.get(i));
				
			} else {
				input.remove(i);
				
			}
		}
		System.out.println(input.toString());
	*/	
	}

}
