package D2;

import java.util.*;

public class num1979 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int tc = scan.nextInt();
		
		int[] results = new int[tc];
		for(int i=0; i<tc; i++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[][] map = new int[n][n];
			
			for(int j=0; j<n; j++) {
				for(int l=0; l<n; l++) {
					map[j][l] = scan.nextInt();
				}
			}
			results[i] = findWay(map,k);
		}
		
		for(int i=0; i<tc; i++) {
			System.out.println("#"+(i+1)+" "+results[i]);
		}

	}

	public static int findWay(int[][] map, int k) {
		int count = 0;
		
		//가로
		for(int i=0; i<map.length; i++) {
			int c=0;
			for(int j=0; j<map[0].length; j++) {
				if(c == k && map[i][j]==0) count++;
				
				if(map[i][j]==1) c++;
				else c = 0;
			}
			if(c == k) count++;
		}
		
		//세로
		for(int i=0; i<map[0].length; i++) {
			int c=0;
			for(int j=0; j<map.length; j++) {
				if(c == k && map[j][i]==0) count++;
				
				if(map[j][i]==1) c++;
				else c = 0;
			}
			if(c == k) count++;
		}
		
		return count;
	}
}
