package D1;

import java.util.*;

public class num1936 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		//1: 가위  	2:바위	3:보 
		int a = scan.nextInt();
		int b = scan.nextInt();
		char result= ' ';
		
		if(a==1) {
			if(b==2) result = 'B';
			else if(b==3) result = 'A';
		}else if(a==2) {
			if(b==3) result = 'B';
			else if(b==1) result = 'A';
		}else if(a==3){
			if(b==1) result = 'B';
			else if(b==2) result = 'A';
		}
		
		System.out.println(result);

	}

}
