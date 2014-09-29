package com.uta.geek.LinkedList;

import java.util.HashMap;

public class IntersectionPoint {

	public boolean isIntersection(SingleNode head1,SingleNode head2){
	 	
		
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNode n1 = new SingleNode(3);
		SingleNode n2 = new SingleNode(6);
		SingleNode n3 = new SingleNode(9);
		SingleNode n4 = new SingleNode(15);
		SingleNode n5 = new SingleNode(30);
		SingleNode n6 = new SingleNode(10);
		
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
		n4.link = n5;
		n6.link = n4;
		new IntersectionPoint().isIntersection(n1, n6);
	}

}
