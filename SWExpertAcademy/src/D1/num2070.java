package D1;
import java.util.*;

public class num2070 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		String[] results = new String[tc];
		for(int i=0; i<tc; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			if(n1>n2) results[i] = ">";
			else if(n1 == n2) results[i] = "=";
			else results[i] = "<";
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
