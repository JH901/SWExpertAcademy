package D1;

import java.util.*;

public class num2043 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int p = scan.nextInt();
		int k = scan.nextInt();
		int changeK = k;
		
		int count=1;
		for(int i=0; i<p-k; i++) {
			count++;
			if(p==changeK) break;
			changeK++;
		}
		
		System.out.println(count);
		

	}

}
