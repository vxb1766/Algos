
import java.util.HashSet;
/*
 * Version 2:use Boolean array to keep track of rows and columns that are 0
 * ADv : reduces the space requirements by 1/4th
*/
public class MxNSet0UsingBoolean {

	public int[][] setZero(int [][] a){
		boolean [] rows = new boolean[a.length];
		boolean []  columns = new boolean[a[0].length];
		for(int i = 0 ; i < a.length ; i ++){
			for(int j = 0 ; j < a[i].length ; j++){
				if(a[i][j] == 0){
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		for(int i = 0 ; i < rows.length ; i++){
			if(rows[i]){
				a[i] = new int[a[0].length];
			}
		}
		
		for(int i = 0 ; i < columns.length ; i++){
			if(columns[i]){
				for(int j = 0 ; j < a.length ;  j++){
					a[j][i] = 0;
				}
			}
		}
		return a;
	}
	
	public void display(int [][]a){
		for (int i = 0 ; i < a.length ; i++){
			for ( int j = 0 ; j < a[0].length ; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3,n = 5;
		int [][]a = {{1,2,3,4,5},{2,1,0,4,2},{1,2,3,1,2}};
		MxNSet0UsingBoolean m1 =  new MxNSet0UsingBoolean();
		m1.display(a);
		m1.setZero(a);
		m1.display(a);
	}

}
