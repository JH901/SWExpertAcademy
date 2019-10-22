package D1;

import java.util.*;

public class num2058 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int num = scan.nextInt();
		int result = 0;
		while(num>=10) {
			result += num%10;
			num /= 10;
		}
		result += num;
		
		System.out.println(result);
	}

}
