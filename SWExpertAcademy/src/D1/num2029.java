package D1;

import java.util.*;

public class num2029 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[][] results = new int[tc][2];
		for(int i=0; i<tc; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			results[i][0] = n1/n2;
			results[i][1] = n1%n2;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i][0]+" "+results[i][1]);
		}

	}

}
