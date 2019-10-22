package D1;

import java.util.*;

public class num2071 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		int[] results = new int[tc];
		
		for(int i=0; i<tc; i++) {
			int sum =0;
			for(int j=0; j<10; j++) {
				sum += scan.nextInt();
			}
			
			if(sum % 10 < 5) results[i] = sum/10;
			else results[i] = (sum/10) +1;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
