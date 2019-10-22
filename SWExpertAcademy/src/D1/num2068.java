package D1;

import java.util.*;

public class num2068 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[] results = new int[tc];
		for(int i=0; i<tc; i++) {
			int top = 0;
			for(int j=0; j<10; j++) {
				int input = scan.nextInt();
				if(top<input) top = input;
			}
			results[i] = top;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
