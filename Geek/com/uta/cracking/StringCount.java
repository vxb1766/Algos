package com.uta.cracking;

public class StringCount {

	public String countCharacters(String input){
		StringBuilder sb = new StringBuilder();
		if(input.length() == 0){
			return null;
		}
		int start = 0 , end = 0 ;
		while((end < input.length() && start < input.length())){
			while((end < input.length() && start < input.length()) && input.charAt(start) == input.charAt(end)){
				end++;
			}
			sb.append(input.charAt(start));
			sb.append(end-start);
			start = end;
		}
		if(sb.length() < input.length())
			return sb.toString();
		else
			return input;
	}
	public static void main(String [] args){
		System.out.println(new StringCount().countCharacters("abcdAAAAAAAAAAAAAAAAABCD"));
	}
}
