

public class MinInStack extends java.util.Stack <Node> {
	java.util.Stack<Node> st;
	
	
	public MinInStack() {
		// TODO Auto-generated constructor stub
		st = new java.util.Stack <Node>();
		
	}
	
	public void push(int item){
		st.push(new Node(item,getMiniMum(item)));
				
	}
	
	public int getMiniMum(int item){
		if(st.isEmpty())
			return item;
		else
			return Math.min(st.peek().minValue, item);
		
	}
	
	
	public Node pop(){
		return st.pop();
	}
	
	
	public int min(){
		return st.peek().minValue;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinInStack m = new MinInStack();
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(5);
		System.out.println(m.min());
		System.out.println(m.pop().item);
		System.out.println(m.min());
	}
}

