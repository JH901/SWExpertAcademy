package D1;

import java.util.*;

public class num1933 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=num; i++) {
			if(num%i ==0) list.add(i);
		}
		
		list.sort(null);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}

	}

}
