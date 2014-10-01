

import java.awt.im.InputSubset;
import java.util.Hashtable;

public class RemoveCharacters {

	public String remove(String input, String toDelete){
		int src=0, dest = 0;
		char [] inputArray = input.toCharArray();
		Hashtable<Character, Boolean> hashtable = new Hashtable<>();
		for(char eachCharacter : toDelete.toCharArray()){
			hashtable.put(eachCharacter, true);
		}
		for(int index = 0 ;index < inputArray.length ; index++){
			if(hashtable.get(inputArray[index]) == null){
				inputArray[dest++] = inputArray[src++];
			}
			else{
				src++;
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for(int index =  0 ; index < dest ; index++){
			stringBuilder.append(inputArray[index]);
		}
		
		return stringBuilder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RemoveCharacters().remove("veena balasubramanya","a"));
		
	}

}
