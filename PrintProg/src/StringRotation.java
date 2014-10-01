


public class StringRotation {
	
	public boolean isRotationUsingXor(String input1, String input2){
		int result = 0;
		for(int i = 0 ; i < input1.length() ; i++){
			result ^= input1.charAt(i) ^ input2.charAt(i);
		}
		if( result == 0 ) return true;
		return false;
	}

	public boolean isRotation(String input1, String input2) {
		boolean isRotated = false;
		int index1 = 0, index2 = 0, count = input1.length();

		if (input1.length() != input2.length())
			return false;

		while (count != 0) {

			if (index1 == input1.length() && !isRotated) {
				isRotated = true;
				index1 = 0;
			}

			if( index1 >= input1.length() || index2 >= input2.length()){
				break;
			}
			if (input1.charAt(index1) == input2.charAt(index2)) {
				index1++;
				index2++;
				count--;
			}

			else {
				if (isRotated) {
					break;
				}
				if (index1 == input1.length() - 1 && !isRotated) {
					isRotated = true;
				}
				if (index1 < input1.length()) {
					index2 = 0;
					count = input1.length();

				}
				/* To handle the duplicates. This is the special case.
				 * This occurs when input1 contains two duplicate elements placed side-by-side as "ll" in "hello" while 
				 * they may not be side-by-side in input2 such as "lohel" but are still valid rotations. 
				 Eg: "hello" "lohel"
				*/
				if (input1.charAt(index1) == input2.charAt(index2)) {
					index1--;
				}
				index1++;
			}
		}
		if (count == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new StringRotation().isRotation("harry potter",
				"terharry pot"));
		System.out.println(new StringRotation().isRotation("bottle", "txybzw"));
		System.out.println(new StringRotation().isRotation("hello", "lohell"));
		System.out.println(new StringRotation().isRotation("hello", "hello"));
		System.out.println(new StringRotation().isRotation("hello", "lohe"));
		
	}

}
