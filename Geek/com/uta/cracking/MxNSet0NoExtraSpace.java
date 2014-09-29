package com.uta.cracking;
import java.util.HashSet;

/*
 * Version 3:This Version Uses just 0(1) space
 * We make use of the first row itself to keep track of columns that are 0
 * Logic : Have a boolean flag called isRowZero
 * Set it to true as each Row contains a 0
 * if the row contains a 0 mark the corresponding column in Row 1
 * For example is array[3][4] is 0 then :
 * When ur traversing row 0 isRowZero would set entire row to 0 but then set array[0][4] to 0.
 * So this way you know column 4 is 0.
 */
public class MxNSet0NoExtraSpace {

	public int[][] setZero(int[][] a) {
		boolean row0 = false;
		for (int i = 0; i < a.length; i++) {
			boolean isRowZero = false;
			for (int j = 0; j < a[i].length; j++) {
				if(i == 0 && a[i][j] == 0){
					row0 = true;
				}
				if ( i != 0 && a[i][j] == 0) {
					isRowZero = true;
					a[0][j] = 0;
				}
			}
			if (isRowZero) {
				a[i] = new int[a[i].length];
			}
		}

		for (int i = 0; i < a[0].length; i++) {
			if (a[0][i] == 0) {
				for (int j = 0; j < a.length; j++) {
					a[j][i] = 0;
				}
			}
		}
		if(row0){
			a[0] = new int[a[0].length];
		}
		return a;
	}

	public void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3, n = 5;
		int[][] a = { { 1, 2, 4, 4, 5 }, { 2, 1, 0, 4, 2 }, { 1, 2, 3, 1, 0 } };
		MxNSet0NoExtraSpace m1 = new MxNSet0NoExtraSpace();
		m1.display(a);
		m1.setZero(a);
		m1.display(a);
	}

}
