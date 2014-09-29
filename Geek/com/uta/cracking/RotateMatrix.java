package com.uta.cracking;

public class RotateMatrix {
	String[][] matrix;

	public void populateMatrix(int n) {
		matrix = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = "a"+i+j;
			}
		}
	}
	
	public void display(){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	
	public void swap(int first , int last){
		for(int i = first ; i <= last ; i++){
			String temp = matrix[first][i];
			matrix[first][i] = matrix[i][last];
			matrix[i][last] = temp;
		}
	}
	
	public void myrotate(){
		int offset = 0;
		int n = matrix.length;
		for(int i = 0; i < n/2 ; i++){
			for(int j = i ; j < n-1-i ; j++){
				System.out.print(i+"->"+j+"\t");
				System.out.println();
				//save top
				String top = matrix[i][j];
				
				//top<- left
				matrix[i][j] = matrix[n-1-j][i];
				
				// left <- bottom
				matrix[n-1-j][i]= matrix[n-1-j][n-1-i];
				
				//bottom <- right
				matrix[n-1-j][n-1-i] = matrix[i][n-1-j];
				
				//right <- top
				matrix[i][n-1-j] = top;
				
				display();
			}
			System.out.println();
		}
	}
	public void rotate() {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				String temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
				display();
			}
		}
	}
	
	public void  test(){
		int first ;
		int last = matrix.length - 1;
		int decrementIncrement = 0;
		for(int layers = 0 ; layers < (matrix.length -1)/2 ; layers++){
			first = layers + decrementIncrement;
			last = ( matrix.length -1 ) - decrementIncrement;
			swap(first,last);
			display();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		RotateMatrix r = new RotateMatrix();
		r.populateMatrix(n);
		r.display();
		r.myrotate();
	}

}
