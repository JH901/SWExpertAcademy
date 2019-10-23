package D2;

import java.util.*;

public class num1945 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc  = scan.nextInt();
		
		int[][] results = new int[tc][5];
		for(int i=0; i<tc; i++) {
			int input = scan.nextInt();
			results[i][0] = count(input,2);
			results[i][1] = count(input,3);
			results[i][2] = count(input,5);
			results[i][3] = count(input,7);
			results[i][4] = count(input,11);
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i][0]+" "+results[i][1]+" "+results[i][2]+" "+results[i][3]+" "+results[i][4]);
		}

	}
	
	public static int count(int input, int num) {
		int count = 0;
		while(true) {
			if(input%num==0) {
				count++;
				input /= num;
			}else break;
		}
		return count;
	}

}
