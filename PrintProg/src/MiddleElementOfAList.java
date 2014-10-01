

public class MiddleElementOfAList {

	public SingleNode getMiddleElement(SingleNode head){
		SingleNode fast,slow;
		fast = slow = head;
		while(fast.link != null){
			slow = slow.link;
			if(fast.link.link != null)
				fast = fast.link.link;
			else 
				break;
		}
		return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5};
		SingleNode head = new BuildLinkedList().buildSingleLinkedList(input);
		new DisplayList().displayList(head);
		System.out.println(new MiddleElementOfAList().getMiddleElement(head));
	}

}
