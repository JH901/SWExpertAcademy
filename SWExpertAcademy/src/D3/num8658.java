package D3;

import java.util.*;

public class num8658 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		scan.nextLine();
		
		int[][] results = new int[tc][2];
		for(int i = 0; i<tc; i++) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int j=0; j<10; j++) {
				String s = scan.next();
				int sum=0;
				if(s.length()==1) {
					sum = Integer.parseInt(s);
				}else {
					int num = Integer.parseInt(s);
					for(int k=0; k<s.length(); k++) {
						sum+=(num%10);
						num/=10;
					}
				}
				if(sum>max) max = sum;
				if(sum<min) min = sum;
			}
			
			results[i][0] = max;
			results[i][1] = min;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i][0]+" "+results[i][1]);
		}

	}

}
