package D2;

import java.util.*;

public class num1970 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[][] results = new int[tc][8];
		for(int i=0; i<tc; i++) {
			int pay = scan.nextInt();
			
			results[i][0] = pay/50000;
			pay-=(pay/50000)*50000;
			results[i][1] = pay/10000;
			pay-=(pay/10000)*10000;
			results[i][2] = pay/5000;
			pay-=(pay/5000)*5000;
			results[i][3] = pay/1000;
			pay-=(pay/1000)*1000;
			results[i][4] = pay/500;
			pay-=(pay/500)*500;
			results[i][5] = pay/100;
			pay-=(pay/100)*100;
			results[i][6] = pay/50;
			pay-=(pay/50)*50;
			results[i][7] = pay/10;
			pay-=(pay/10)*10;
			
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1));
			System.out.println(results[i][0]+" "+results[i][1]+" "+results[i][2]+" "+results[i][3]+" "+results[i][4]+" "+results[i][5]+" "+results[i][6]+" "+results[i][7]);
		}

	}

}
