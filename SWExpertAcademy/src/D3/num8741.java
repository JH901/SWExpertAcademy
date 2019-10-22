package D3;
import java.util.*;

public class num8741 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		scan.nextLine();
		
		String[] results = new String[tc];
		for(int i=0; i<tc; i++) {
			String input = scan.nextLine();
			
			String[] splitInput = input.split(" ");
			String result = "";
			for(int j=0; j<splitInput.length; j++) {
				result += splitInput[j].toUpperCase().charAt(0);
			}
			results[i] = result;
		}
		
		for(int i=0; i<tc; i++){
			System.out.println("#"+(i+1)+" "+results[i]);
		}
	}

}