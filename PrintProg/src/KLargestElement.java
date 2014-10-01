

public class KLargestElement {

	/*
	 * Build Min Heap for N elements. So if n = 4, A min Heap for the first 4
	 * elements is built. The rest of the array stays untouched.
	 */

	public int findMin(int[] a) {
		return a[0];
	}

	/*
	 * k = 4 n = 6 Now consider elements : 4,5,6
	 */
	public int[] findKLargest(int[] a, int k) {
		for (int i = k; i < a.length; i++) {
			if (a[i] > findMin(a)) {
				a[0] = a[i];
				buildMinHeap(a, k);
			}
		}
		return a;
	}

	public int[] buildMinHeap(int[] a, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--) {
			int p = i;
			int item = a[i];
			int c = 2 * p + 1;

			while (c <= n - 1) {
				if (c + 1 <= n - 1 && a[c + 1] < a[c]) {
					c = c + 1;
				}
				if (item > a[c]) {
					a[p] = a[c];
					p = c;
					c = 2 * p + 1;
				} else {
					break;
				}
			}
			a[p] = item;
		}
		return a;
	}

	public void display(int[] a, int k) {
		for (int i = 0; i < k; i++) {
			System.out.println(a[i]);
		}
	}

	public void start(int[] a, int k) {
		if( k > a.length || a.length == 0){
			System.out.println("Invalid Case...");
			return ;
			
		}
		
		a = buildMinHeap(a, k);
		a = findKLargest(a, k);
		display(a, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1,-2 ,-3,-4,0};
		int k = 4;
		new KLargestElement().start(a, k);
	}

}
