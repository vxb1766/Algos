package com.uta.stacks;

public class QueueUsingStack {
	java.util.Stack<Integer> stack1;
	java.util.Stack<Integer> stack2;
	
	public QueueUsingStack() {
		// TODO Auto-generated constructor stub
		stack1 = new java.util.Stack<Integer>();
		stack2 = new java.util.Stack<Integer>();
	}
	
	public void enque(int item){
		
		if(stack2.isEmpty()){
			stack2.push(item);
			
		}else{
			stack1.clear();
			while(!stack2.isEmpty()){
				stack1.push(stack2.pop());
					
			}
			stack1.push(item);
			stack2.clear();
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			
		}
	}
	
	public int deque(){
		return stack2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack q = new QueueUsingStack();
		q.enque(25);q.enque(41);q.enque(32);
		System.out.println(q.deque());
		q.enque(30);
	}

}
