

public class DeleteLinkedList {

	private SingleNode root;
	
	public SingleNode getRoot() {
		return root;
	}
	public void setRoot(SingleNode root) {
		this.root = root;
	}
	
	public SingleNode deleteList(){
		SingleNode next;
		
		while(root != null){
			next = root.link;
			root = null;
			root = next;
		}
		return this.root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {110,10,10,80,70,60,10,40,30,20,10};
		SingleNode head = new BuildLinkedList().buildSingleLinkedList(input);
		DeleteLinkedList d = new DeleteLinkedList();
		d.setRoot(head);
		new DisplayList().displayList(head);
		System.out.println(d.deleteList());
		
	}

}
