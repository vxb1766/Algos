

public class DisplayList {

	public void displayList(SingleNode head){
		while(head != null){
			System.out.print(head.item +"\t");
			head = head.link;
		}
		System.out.println();
	}
}
