package com.uta.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int item){
		if(q2.isEmpty()){
			q2.add(item);
		}else{
			while(!q2.isEmpty()){
				q1.add(q2.remove());
			}
			q2.add(item);
			while(!q1.isEmpty()){
				q2.add(q1.remove());
			}
		}
	}
	
	public int pop(){
		return q2.remove();
	}
	
	public void display(){
		System.out.println(q2.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.display();
	}

}
