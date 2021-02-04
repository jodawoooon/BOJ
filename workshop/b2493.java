package boj.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//for문을 여러개 돌리니까 시간초과로 실패
public class b2493 {
	static int N;
	static int[] top;
	static int[] res;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//왼쪽으로 레이저 동시에 발사. 가장 먼저 만나는 탑에서 신호 수신
		//왼쪽 탑의 높이가 오른쪽 탑의 높이보다 높거나 같아야 수신 가능함.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		top = new int[N+1];
		res = new int[N+1];
		for (int i = 0; i < N; i++) {
			top[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = N-1; i >= 0; i--) {
			
			if(i==0) {
				res[0] = 0;continue;
			}
			int tmp = i;
			while(true) {
				if(top[i]<=top[tmp-1]) {
					res[i] = tmp;
					break;
				}else {
					tmp--;
				}
				
				if(tmp==0){
					res[i] = 0;
					break;
				}
			}
	
		}
		
		for (int j = 0; j < N; j++) {
			System.out.print(res[j]+ " ");
		}
		
		
	}
}
