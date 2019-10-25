package D2;

import java.util.*;

public class num1974 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[] results = new int[tc];
		for(int i=0; i<tc; i++) {
			int[][] stoku = new int[9][9];
			for(int n=0; n<9; n++) {
				for(int m=0; m<9; m++) {
					stoku[n][m] = scan.nextInt();
				}
			}
			
			results[i] = checkRule(stoku);
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

	private static int checkRule(int[][] stoku) {
		int check = 1; //	1:true 	0:false
		
		//가로
		for(int i=0; i<9; i++) {
			int[] number = new int[9];
			for(int j=0; j<9; j++) {
				int n = stoku[i][j]-1;
				if(number[n]!=0) return 0;
				else number[n] = 1;
			}
		}
		
		//세로
		for(int i=0; i<9; i++) {
			int[] number = new int[9];
			for(int j=0; j<9; j++) {
				int n = stoku[j][i]-1;
				if(number[n]!=0) return 0;
				else number[n] = 1;
			}
		}
		
		
		
		if(!checkCell(stoku,0,3,0,3)) return 0;
		if(!checkCell(stoku,0,3,3,6)) return 0;
		if(!checkCell(stoku,0,3,6,9)) return 0;
		if(!checkCell(stoku,3,6,0,3)) return 0;
		if(!checkCell(stoku,3,6,3,6)) return 0;
		if(!checkCell(stoku,3,6,6,9)) return 0;
		if(!checkCell(stoku,6,9,0,3)) return 0;
		if(!checkCell(stoku,6,9,3,6)) return 0;
		if(!checkCell(stoku,6,9,6,9)) return 0;
		
		
		return check;
	}

	private static boolean checkCell(int[][] stoku, int is, int ie, int js, int je) {
		int[] number = new int[9];
		for(int i = is; i<ie; i++) {
			for(int j = js; j<je; j++) {
				int n = stoku[j][i]-1;
				if(number[n]!=0) return false;
				else number[n] = 1;
			}
			
		}
		return true;
	}
	

}
