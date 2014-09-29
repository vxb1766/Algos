package com.uta.stacks;

public class GetMinUsingTwoStacks extends java.util.Stack<Integer> {

	java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
	java.util.Stack<Integer> minStack = new java.util.Stack<Integer>();

	public void push(int item) {
		if (stack.isEmpty()) {
			stack.push(item);
			minStack.push(item);
		} else {
			stack.push(item);
			minStack.push(Math.min(item, stack.peek()));
		}
	

	}
	
	public Integer pop(){
		minStack.pop();
		return stack.pop();
	}
	
	public Integer getMin(){
		return minStack.peek();
	}
	
	public void display(){
		System.out.println(stack.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMinUsingTwoStacks g = new GetMinUsingTwoStacks();
		g.push(30);
		g.push(20);
		g.push(10);
		g.display();
		System.out.println(g.getMin());
		System.out.println(g.pop());
		g.display();
		System.out.println(g.getMin());
		

	}

}
