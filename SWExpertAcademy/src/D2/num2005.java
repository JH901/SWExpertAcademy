package D2;

import java.util.*;

public class num2005 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		for(int i=0; i<tc; i++) {
			int n = scan.nextInt();
			System.out.println("#"+ (i+1));
			makePa(n);
		}
	}

	private static void makePa(int n) {
		int[][] pa = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(i == j || j == 0) pa[i][j] = 1;
				else {
					pa[i][j] = pa[i-1][j-1] + pa[i-1][j];
				}
				
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(pa[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
