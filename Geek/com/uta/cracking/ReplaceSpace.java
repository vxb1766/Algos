package com.uta.cracking;

public class ReplaceSpace {
	
	public int countSpaces(String input){
		int countSpace = 0; 
		for(char eachChar : input.toCharArray()){
			if(eachChar == (char)32){
				countSpace++;
			}
		}
		System.out.println("No of spaces:"+countSpace);
		return countSpace;
	}
	
	public char[] getNewString(String inputString){
		int newLength = inputString.length()+(countSpaces(inputString)*2);
		char [] input = new char[newLength];
		for(int i = 0; i < inputString.length();i++){
			input[i]=inputString.charAt(i);
		}
		
		return input;
	}
	
	public char[] replaceString(String inputString){
		char [] input = getNewString(inputString); 
		int write;
		write = input.length-1;
		
		for(int i = inputString.length()-1 ; i >=0; i--){
			if(input[i] !=(char)32){
				input[write]=input[i];
				write--;
			}
			else{
				input[write] = '0';
				write--;
				input[write] = '2';
				write--;
				input[write] = '%';
				write--;
			}
		}
		
		
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReplaceSpace().replaceString("hat mat pat cat"));
	}

}
 