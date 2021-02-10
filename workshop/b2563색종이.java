package algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2563색종이 {
	static int T, X, Y, ans;
	static boolean[][] arr = new boolean[100][100];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine()); //T = 색종이의 수
		//가로, 세로 각각 10인 정사각형 색종이
		
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
			X = Integer.parseInt(st.nextToken()); //N = 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리
			Y = Integer.parseInt(st.nextToken()); //M = 색종이의 아래 변과 도화지의 아래 변 사이의 거리
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(!arr[X+i][Y+j]) {
						arr[X+i][Y+j] = true;
						ans++;
					}
					
				}
			}
			
			
			
		}
		
		System.out.println(ans);
	}
}
