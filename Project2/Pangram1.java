package string_practice;

public class Pangram1 {
	static int size =26;
	public static boolean allLetterPresent(String str,int len) {
		str=str.toLowerCase();
		boolean[] present=new boolean[size];
		for(int i=0;i<len;i++) {
			if(isLetter(str.charAt(i))) {
				int letter=str.charAt(i)-'a';
			present[i]=letter;
				
			}
		}
	}

	public static void main(String[] args) {
		String str="Abcdefghijklmnopqrstuvwxyz";
		int len=str.length();
		if(allLetterPresent(present)) {
			System.out.println("it is pangram");
		}
		else {
			System.out.println("it is not pangram");
		}

	}

}
