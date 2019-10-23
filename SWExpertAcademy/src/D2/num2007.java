package D2;

import java.util.*;

public class num2007 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		scan.nextLine();
		int[] results = new int[tc];
		
		for(int i=0; i<tc; i++) {
			String str = scan.nextLine();
			String word = findWord(str);
			results[i] = word.length();
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

	static String findWord(String str) {
		String s = str;
		String word = "";
		for(int i=1; i<str.length();i++) {
			word = str.substring(0,i);
			s = str.substring(i);
			if(s.startsWith(word)) {
				break;
			}
		}
		return word;
	}

}
