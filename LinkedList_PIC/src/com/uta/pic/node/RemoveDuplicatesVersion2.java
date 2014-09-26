package com.uta.pic.node;
/*
 * Version 2: Without Additional Buffer
 * Space : O(1)
 * Time : O(n2)
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDuplicatesVersion2 {

	public Node removeDuplicates(Node head){
		Node current = head;
		Node prev = null;
		Node runner = null;
		while(current != null){
			runner = current.link;
			prev = runner;
			while(runner != null && runner.info != current.info){
				prev = runner;
				runner = runner.link;
			}
			if(runner != null && runner.info == current.info){
				prev.link = runner.link;
			}
			current = current.link;
		}
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {91,92,94,91,95,94};
		Node head = new AppendToTail().buildLinkedList(input);
		head = new RemoveDuplicatesVersion2().removeDuplicates(head);
		new DisplayLinkedList().display(head);
		
		/*The below Code is if u use Collections.
		 * In this case Start from last element because when you do a remove, the collection is resized and hence 
		 * you will automatically decrement 1. If u start from 0 the problem is:
		 * say input is 91,92,93,91,91
		 * Now when i = 4 you see there's a duplicate at position 1
		 * So if u remove i in the else case then i increments and become's 5 but the next i element again replaces the previous element
		 * so in the else: u need to remove and decrement i by 1 to overcome this problem.
		 * LinkedList<Integer> input = new LinkedList<Integer>();
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
