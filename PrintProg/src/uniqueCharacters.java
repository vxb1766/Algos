

import java.util.HashMap;
import java.util.HashSet;

public class uniqueCharacters {

	public boolean isUnique(String input){
		if(input.length() > 128)
			return false;
		
		boolean [] testInput = new boolean[128];
		for(char eachChar : input.toCharArray()){
			if(!testInput[eachChar - 'a']){
				testInput[eachChar - 'a'] = true;
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new uniqueCharacters().isUnique("veqwrtyuiopna"));
		System.out.println(5/2);
	}
}
