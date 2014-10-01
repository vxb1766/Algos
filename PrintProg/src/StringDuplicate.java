

public class StringDuplicate {

	public String removeDuplicates(String input1){
		if(input1.isEmpty())return null;
		StringBuilder sb = new StringBuilder();
		int read = 0,write = 0;
		int checker = 0;int val;
		int result;
		for(int i = 0 ; i < input1.length();i++){
			val = input1.charAt(i)-'a';
			if((checker & (1 << val)) > 0){
				continue;
			}else{
				checker = checker | (1 << val);
				sb.append(input1.charAt(i));
			}
			
		}
		return sb.toString();
	}
	public static void main(String [] args){
		String result = new StringDuplicate().removeDuplicates("VVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVvvVv");
		
		if(!result.isEmpty()){
			System.out.println(result);
		}else{
			System.out.println("Empty String");
		}
	}
}
