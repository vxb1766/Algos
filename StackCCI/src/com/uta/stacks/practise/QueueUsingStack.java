package com.uta.stacks.practise;
import java.util.*;
public class QueueUsingStack {

	Stack<Integer> s1,s2;
	public QueueUsingStack() {
		// TODO Auto-generated constructor stub
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		
	}
	public void enque(int item){
		if(s2.isEmpty()){
			s1.push(item);
			s2.push(item);
		}else{
			s1.clear();
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
			s1.push(item);
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			
			
		}
		
	}
	
	public void display(){
		System.out.println(s2.toString());
	}
	
	public int deque(){
		return s2.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack q = new QueueUsingStack();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		System.out.println(q.deque());
		q.enque(40);
		q.enque(50);
		q.display();
		

	}

}
