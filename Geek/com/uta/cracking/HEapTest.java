package com.uta.cracking;
import java.util.Comparator;
import java.util.PriorityQueue;


public class HEapTest {

	public static void main(String [] args){
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(5);
		int k = 1;
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		};
		while(k != 1){
			p.poll();
			k--;
		}
		System.out.println(p.poll());
	}
}
