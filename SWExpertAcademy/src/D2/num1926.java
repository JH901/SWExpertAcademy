package D2;

import java.util.*;

public class num1926 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			String number = String.valueOf(i);
			boolean checkNum = true;
			for(int j=0; j<number.length();j++) {
				int num = Integer.parseInt(""+number.charAt(j));
				if(num != 0 && num%3 == 0) {
					System.out.print("-");
					checkNum = false;
				}
			}
			if(checkNum)System.out.print(i);
			System.out.print(" ");
		}

	}

}
