/*
 * This Is Effective Implementation of K stacks in an array.
 * This makes use of extra space of O(n) + o(k)
 * But This is a a very small cost when the stacks are being used for extremely large objects.
 */

package com.uta.stacks;

public class KStacksInAnArray {
	int[] array; /* This will hold all stack elements successfully pushed */
	int[] top;/* This will hold all the TOP of the stack values */
	int[] nextFree; /*
					 * THis array serves two purpose. Firstly, its used to hold
					 * the next element or position that is available and
					 * secondly, its also used to hold the previous top of the
					 * stack elements.
					 */
	int free;/* This variable holds the current Free index */
	final int STACK_SIZE;

	public KStacksInAnArray(int size, int k) {
		// TODO Auto-generated constructor stub
		STACK_SIZE = size;
		array = new int[STACK_SIZE];
		top = new int[k];
		nextFree = new int[STACK_SIZE];
		free = 0;

		for (int i = 0; i < STACK_SIZE - 1; i++) {
			nextFree[i] = i + 1;
		}
		nextFree[STACK_SIZE - 1] = -1;

		for (int i = 0; i < k; i++) {
			top[i] = -1;
		}

		free = 0;
		
	}

	boolean performTest(){
		if(STACK_SIZE < top.length){System.out.println("No of stacks is more than the input array elements !!!");return false;}
		
		return true;
	}
	public void push(int item, int stackNumber) {
		if(!performTest()){
			return ;
		}
		if (isFull()) {
			System.out.println("Overflow...");
			return;
		}
		int i = free;
		free = nextFree[i];
		nextFree[i] = top[stackNumber];
		top[stackNumber] = i;
		array[i] = item;
	}

	public int pop(int stackNumber) {
		if (isEmpty(stackNumber)) {
			System.out.println("Underflow of stack..." + (stackNumber + 1));
			return Integer.MAX_VALUE;
		} else {
			int i = top[stackNumber];
			top[stackNumber] = nextFree[i];
			nextFree[i] = free;
			free = i;
			return array[i];
		}

	}

	boolean isFull() {
		return (free == -1);
	}

	boolean isEmpty(int stackNumber) {
		return (top[stackNumber] == -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KStacksInAnArray k = new KStacksInAnArray(1, 2);
		k.push(10, 0);
		k.push(20, 0);
		k.push(30, 0);
		System.out.println(k.pop(0));
		k.push(30, 0);

	}

}
