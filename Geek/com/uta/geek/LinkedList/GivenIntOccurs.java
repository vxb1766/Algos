package com.uta.geek.LinkedList;

public class GivenIntOccurs {

	public int getRepetation(SingleNode head, int numberToCheck){
		
		if(head.item == numberToCheck){
			head.item = 1;
		}else{
			head.item = 0;
		}
		SingleNode temp = head.link;
		while(temp != null){
			if(temp.item == numberToCheck){
				head.item++;
			}
			temp = temp.link;
		}
		return head.item;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {110,10,10,80,70,60,10,40,30,20,10};
		SingleNode head = new BuildLinkedList().buildSingleLinkedList(input);
		new DisplayList().displayList(head);
		System.out.println("Given Number repeats:"+ new GivenIntOccurs().getRepetation(head, 80)+" time(s)");

	}

}
