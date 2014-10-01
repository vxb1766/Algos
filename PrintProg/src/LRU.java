import java.util.*;

public class LRU {
	int capacity;
	HashMap<Integer, Integer> cache;
	Queue<Integer> q;

	LRU(int capacity) {
		this.capacity = capacity;
		cache = new HashMap<Integer, Integer>();
		q = new LinkedList<>();

	}

	public void implementCache(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if(cache.containsKey(input[i]) || cache.size()>= this.capacity){
				cache.remove(q.remove());
			}
			cache.put(input[i], i);
			q.add(input[i]);
			display();
		}
	}
	
	public void display(){
		System.out.print("Cache contents are:");
		Iterator it = q.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 2, 2, 2, 1, 3, 7, 5, 4, 3 };
		new LRU(3).implementCache(input);
	}

}
