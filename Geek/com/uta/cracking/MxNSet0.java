package com.uta.cracking;
import java.util.HashSet;
/*
 * Version 1: blindly uses two hashset
 * Disadv: Space
 * use Boolean array instead
 * ADv : reduces the space requirements by 1/4th
*/
public class MxNSet0 {

	public int[][] setZero(int [][] a,int m,int n){
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> columns = new HashSet<Integer>();
		for(int i = 0 ; i < m ; i ++){
			for(int j = 0 ; j < n ; j++){
				if(a[i][j] == 0){
					rows.add(i);
					columns.add(j);
				}
			}
		}
		display(a,m,n);
		for(int eachRow : rows){
			a[eachRow] = new int[n];
		}
		for(int eachCol : columns){
			for(int i = 0 ; i < m ; i++){
				a[i][eachCol] = 0;
			}
		}
		display(a,m,n);
		return a;
	}
	
	public void display(int [][]a , int m , int n){
		for (int i = 0 ; i < m ; i++){
			for ( int j = 0 ; j < n ; j++){
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
		new MxNSet0().setZero(a,m,n);
	}

}
