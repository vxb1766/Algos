//|v|e|e|n|a||b|a|l|a|
//|0|1|2|3|4|5|6|7|8|9|	
public class ReverseWords {
	String inputString;
	char[] inputCharacterArray;

	public ReverseWords(String input) {
		// TODO Auto-generated constructor stub
		this.inputString = input;
		inputCharacterArray = this.inputString.toCharArray();
	}

	public void reverse() {
		int start, end;
		end = inputCharacterArray.length - 1;
		start = end;
		while (start > -1) {
			while (start >-1 && inputCharacterArray[start] != (char) 32){
				start--;
			}
				
			reverseAgain(start + 1, end);
			end = start - 1;
			start = end;
		}

	StringBuilder st = new StringBuilder();
	for(int index = inputCharacterArray.length-1 ; index >-1 ; index--){
		st.append(inputCharacterArray[index]);
	}
	System.out.println(st.toString());
}
		

	private void reverseAgain(int start, int end) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= (end - start) / 2; i++) {
			char temp = inputCharacterArray[start + i];
			inputCharacterArray[start + i] = inputCharacterArray[end - i];
			inputCharacterArray[end - i] = temp;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ReverseWords("Do or do not, there is no try").reverse();

	}

}
