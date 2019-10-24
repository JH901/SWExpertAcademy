package D2;

import java.util.*;

public class num1989 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		scan.nextLine();
		int[] results = new int[tc];
		for(int i=0; i<tc; i++) {
			String input = scan.nextLine();
			int end = input.length()-1;
			boolean check = true;
			for(int j=0; j<input.length()/2; j++) {
				if(input.charAt(j) != input.charAt(end)) {
					System.out.println(input.charAt(j)+"/"+input.charAt(end));
					check = false;
					break;
				}
				end--;
			}
			
			if(check) results[i] = 1;
			else results[i] = 0;
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}
	}

}
