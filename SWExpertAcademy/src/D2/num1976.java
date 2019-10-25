package D2;

import java.util.*;

public class num1976 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[][] results = new int[tc][2];
		for(int i=0; i<tc; i++) {
			int bH = scan.nextInt();
			int bM = scan.nextInt();
			
			int aH = scan.nextInt();
			int aM = scan.nextInt();
			
			int m = bM+aM;
			int h = bH+aH;
			if(m>59) {
				h +=1;
				m -=60;
			}
			
			if(h > 12) h-=12;
			
			results[i][0] = h;
			results[i][1] = m;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i][0]+" "+results[i][1]);
		}

	}

}
