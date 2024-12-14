package basic;

public class Assignment24 {
		
	void printChar(String str) {
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int sCount=0;
		int spCount=0;
			
		for(int i=0; i<=str.length()-1; i++) {
			char ch =str.charAt(i);
			if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch)){
				uCount++;
				System.out.println(ch);
                }
			    if(Character.isLowerCase(ch)){
				lCount++;
				System.out.println(ch);
			    }
			}
			else if(Character.isDigit(ch)){
				dCount++;
				System.out.println(ch);
			}
			else if(Character.isWhitespace(ch)){
				sCount++;
				System.out.println(ch);
			}else {
				spCount++;
				System.out.println(ch);
			}
		}	
		System.out.println("Uppercase :"+ uCount);
		System.out.println("Lowercase :"+ lCount);
		System.out.println("Digit :"+ dCount);
		System.out.println("Space :"+ sCount);
		System.out.println("SpecialCharacter :"+ spCount);
	}
		
	public static void main(String[] args) {
		Assignment24 assign23 =new Assignment24();
		assign23.printChar("Te4c_hno Credi3ts");
	}
}
