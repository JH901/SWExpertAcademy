package D1;

import java.util.*;

public class num2019 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] results = new int[num+1];
		
		for(int i=0; i<=num; i++) {
			results[i] = (int)Math.pow(2, i);
		}
		
		for(int i=0; i<=num; i++) {
			System.out.print(results[i]+" ");
		}

	}

}
