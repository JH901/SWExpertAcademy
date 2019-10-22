package D1;

import java.util.*;

public class num2063 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int input = scan.nextInt();
			list.add(input);
		}
		
		list.sort(null);

		System.out.println(list.get((list.size()/2)));

	}

}
