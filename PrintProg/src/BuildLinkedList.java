

public class BuildLinkedList {
	Node head;
	

	public BuildLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	
	public String toString(){
		Node current = head;
		String output = "";
		while(current != null){
			output += current.item + "\t";
			current = current.rlink;
		}
		return output + "\n";
	}

	public Node buildList(int[] items) {
		Node startNode = null;
		for (int index = 0; index < items.length; index++) {
			Node node = new Node(items[index]);

			if (startNode == null) {
				startNode = node;
			} else {
				Node current = startNode;
				while (current.rlink != null) {
					current = current.rlink;
				}
				current.rlink = node;
				node.llink = current;
			}
		}
		return startNode;
	}
	
	public static Node tail(Node head){
		Node current = head;
		while(current.rlink != null)
			current = current.rlink;
		return current;
	}
									//3,head,child
	public void attachListToChild(int position , Node parentAddress , Node childAddress){
		Node current = parentAddress;
		for(int index = 0 ; index< position-1 ; index++){
			current = current.rlink;
		}
		current.child = childAddress;
	}

	public static void flattenList(Node head){
		Node current = head;
		Node tail = tail(current);
		while(current != null){
			if(current.child != null){
				tail = moveTailPointer(current.child,tail);
			}
			current = current.rlink;
		}
	}
	private static Node moveTailPointer(Node nextLevelHead, Node previousLevelTail) {
		// TODO Auto-generated method stub
		previousLevelTail.rlink = nextLevelHead;
		nextLevelHead.llink = previousLevelTail;
		
		Node current = nextLevelHead;
		
		while( current.rlink != null){
			current = current.rlink;
		}
		return current;
	}
	
	private static Node unflatten(Node head){
		Node current = head;
		while(current != null){
			if(current.child != null){
				current.child.llink.rlink = null;
				current.child.llink = null;
			}
			current = current.rlink;
		}
		current = head;
		while(current.rlink != null)
			current = current.rlink;
		return current;
	}

	public static void main(String[] args) {
		BuildLinkedList l = new BuildLinkedList();
		Node child;
	
		int a[] = {1,2,3,4,5};
		l.head = l.buildList(a);
		
		int b[] = {11,12,13};
		child = l.buildList(b);
		
		l.attachListToChild(3, l.head, child);
		
		int c[] = {14,15,16};
		child = l.buildList(c);
		
		l.attachListToChild(4, l.head, child);
		flattenList(l.head);
		
		System.out.println(l.toString());
		unflatten(l.head);
		System.out.println(l.toString());
	}
}
