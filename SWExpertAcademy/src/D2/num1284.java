package D2;

import java.util.*;

public class num1284 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[] results = new int[tc];
		
		for(int i=0; i<tc; i++) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			int r = scan.nextInt();
			int s = scan.nextInt();
			int w = scan.nextInt();
			
			int a = w*p;
			int b;
			if(w<=r) b = q;
			else b = q+((w-r)*s);
			
			if(a>b) results[i] = b;
			else results[i] = a;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
