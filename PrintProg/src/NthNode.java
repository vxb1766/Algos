

public class NthNode {
	
	public SingleNode getNthNodeFromFront(int index, SingleNode head){
		if(index < 1) return null;
		while( index != 1){
			head = head.link;
			index--;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {10,20,30,40,50,60,70,80,90,100};
		SingleNode head = new BuildLinkedList().buildSingleLinkedList(input);
		new DisplayList().displayList(head);
		System.out.println(new NthNode().getNthNodeFromFront(0, head));
	}

}
