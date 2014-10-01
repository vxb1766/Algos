

public class Stack {
	private int top;
	private int[] array;
	private final int STACK_SIZE = 10;
	
	public Stack(){
		top = -1;
		array = new int[STACK_SIZE];
	}
	
	public void push(int item){
		if(top == STACK_SIZE -1){
			System.out.println("Stack FUll");
		}else{
			array[++top] = item;
		}
	}
	
	public int pop(){
		if(top == -1){
			System.out.println("Stack is empty");
			return Integer.MAX_VALUE;
		}else{
			return array[top--];
		}
	}
	
	public void display(){
		if(top == -1){
			System.out.println("Stack is empty");
		}else{
			for(int i = top ; i > -1 ; i--){
				System.out.print(array[i]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		
	}

}
