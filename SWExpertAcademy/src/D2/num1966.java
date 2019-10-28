package D2;

import java.util.*;

public class num1966 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		for(int i=0; i<tc; i++) {
			int n = scan.nextInt();
			List<Integer> list = new ArrayList<>();
			
			for(int j=0; j<n; j++) {
				int num = scan.nextInt();
				list.add(num);
			}
			list.sort(null);
			
			System.out.print("#"+(i+1));
			for(int j=0; j<n; j++) {
				System.out.print(" "+list.get(j));
			}
			System.out.println();
			
		}

	}

}
