package D1;

import java.util.*;

public class num2072 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[] results = new int[tc];
		for(int i=0; i<tc; i++) {
			int sum =0;
			
			for(int j=0; j<10; j++) {
				int input = scan.nextInt();
				if(input%2 != 0) sum += input;
			}
			
			results[i] = sum;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
