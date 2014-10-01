

public class TwoStacksInASingleArray {
	int[] array;
	final int STACK_SIZE = 10;
	int top1, top2;

	public TwoStacksInASingleArray() {
		array = new int[STACK_SIZE];
		top1 = -1;
		top2 = STACK_SIZE;
	}

	public void push1(int item) {
		if (top1+1 == top2) {
			System.out.println("Stack1 overflow");
		}else{
		array[++top1] = item;
	}
	}

	public void push2(int item) {
		if (top2-1 == top1) {
			System.out.println("Stack2 overflow");
		}else{
		array[--top2] = item;
	}
	}
	public int pop1() {
		if (top1 == -1) {
			System.out.println("Stack1 underflow");
			return Integer.MAX_VALUE;
		}
		return array[top1--];

	}

	public int pop2() {
		if (top2 == STACK_SIZE) {
			System.out.println("Stack2 underflow");
			return Integer.MAX_VALUE;
		}
		return array[top2++];

	}

	public void display1() {
		if (top1 == -1) {
			System.out.println("Stack1 underflow");
		}
		System.out.println("Stack1");
		for (int i = top1; i > -1; i--) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	
	public void display2() {
		if (top2 == STACK_SIZE) {
			System.out.println("Stack2 underflow");
		}
		System.out.println("Stack2");
		for (int i = top2; i < STACK_SIZE; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacksInASingleArray t = new TwoStacksInASingleArray();
		t.push1(10);
		t.push1(20);
		t.push1(30);
		t.push2(70);
		t.push2(65);
		t.push2(98);
		/*t.display2();*/
		t.push1(20);
		t.push1(30);
		t.push2(65);
		t.push2(98);
		t.display2();
		t.display1();
		t.push1(110);
		t.push2(110);
		
		
	}

}
