package D1;

import java.util.*;

public class num2050 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String str = scan.nextLine();
		str = str.toUpperCase();
		//65 - 90
		for(int i=0; i<str.length(); i++) {
			System.out.print(((int)str.charAt(i)-64)+" ");
		}

	}

}
