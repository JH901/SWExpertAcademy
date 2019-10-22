package D1;

import java.util.*;

public class num2056 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		scan.nextLine();
		
		String[] results = new String[tc];
		for(int i=0; i<tc; i++) {
			String date = scan.nextLine();
			
			String y = date.substring(0,4);
			String m = date.substring(4, 6);
			String d = date.substring(6, 8);
			
			int year = Integer.parseInt(y);
			int month = Integer.parseInt(m);
			int day = Integer.parseInt(d);
			
			if(month < 1 || month > 12 || day == 0 || day > 31) results[i] = "-1";
			else if(month == 2 && day >28) results[i] = "-1";
			else if((month == 4 || month == 6 || month == 9 || month == 11) && day >30) results[i] = "-1";
			else results[i] = y+"/"+m+"/"+d;			
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

}
