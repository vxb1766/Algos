package com.uta.stacks;

public class SortStack extends java.util.Stack{
	Stack dummyStack = new Stack();
	
	public void  sort(Stack input){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(69);st.push(77);st.push(30);st.push(75);st.push(15);
		new SortStack().sort(st);
	}

}
