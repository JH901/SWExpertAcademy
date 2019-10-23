package D2;

import java.util.*;

public class num1986 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[] results = new int[tc];
		for(int i=0; i<tc; i++) {
			int input = scan.nextInt();
			int sum = 0;
			for(int j=1; j<=input; j++) {
				if(j%2 == 0) sum+=j;
				else sum-=j;
			}
			results[i] = sum;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
