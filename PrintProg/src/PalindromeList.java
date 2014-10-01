

public class PalindromeList {

	public boolean isIdenticalList(SingleNode head1, SingleNode head2) {
		SingleNode current1 = head1, current2 = head2;

		while (current1 != null && current2 != null) {
			if (current1.item == current2.item) {
				current1 = current1.link;
				current2 = current2.link;
			} else {
				return false;
			}
		}
		return true;
	}

	public void getMiddleElement(SingleNode head) {
		boolean isEven = false;
		SingleNode fast, slow, prev;
		fast = slow = head;
		prev = null;

		while (fast.link != null) {
			prev = slow;
			slow = slow.link;
			if (fast.link.link != null)
				fast = fast.link.link;
			else {
				isEven = true;
				break;
			}

		}

		if (isEven) {
			fast = fast.link;
		}
		else{
			slow = slow.link;
		}
		prev.link = null;
		head = reverseList(head);
		if (isIdenticalList(head, slow)) {
			System.out.println("Palindrome...");
		} else {
			System.out.println("Not a palindrome...");
		}


	}

	public SingleNode reverseList(SingleNode head) {
		SingleNode prev, current, next;
		prev = null;
		current = head;
		while (current != null) {
			if (current.link != null)
				next = current.link;
			else
				next = null;
			current.link = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNode n1 = new SingleNode(1);
		SingleNode n2 = new SingleNode(2);
		SingleNode n3 = new SingleNode(3);
		SingleNode n4 = new SingleNode(4);
		SingleNode n5 = new SingleNode(5);
		SingleNode n6 = new SingleNode(4);
		SingleNode n7 = new SingleNode(3);
		SingleNode n8 = new SingleNode(2);
		SingleNode n9 = new SingleNode(1);
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
		n4.link = n5;
		n5.link = n6;
		n6.link = n7;
		n7.link = n8;
		n8.link = n9;
		new PalindromeList().getMiddleElement(n1);

	}

}
