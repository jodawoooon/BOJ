package algo.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b2961도영이가만든맛있는음식 {
	
//	도영이 재료 N개
//	신맛 S, 쓴맛 B
//	여러 재료를 이용해서 요리할 때
//	신맛은 사용한 재료의 신맛의 곱, 쓴맛은 합
//	신맛과 쓴맛의 차이를 작게 만들어야 한다.
//	재료는 적어도 하나 사용.
//	신맛과 쓴맛의 차이가 가장 작은 요리를 만들자.
	
	static int N, tgtIdx, min;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    N = Integer.parseInt(br.readLine()); //재료의 개수
	    min = Integer.MAX_VALUE;
	    arr = new int[N][2];
	    
	    for (int n = 0; n < N; n++) {
	    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	        arr[n][0] = Integer.parseInt(st.nextToken());
	        arr[n][1] = Integer.parseInt(st.nextToken());   
		}
	    
	    //재료를 하나이상 사용해야함.
	    
	    for (int i = 1; i <= N; i++) {
	    	tgtIdx = i;
			comb(0, 0, 1, 0);
		}
	    bw.write(String.valueOf(min));
	    bw.flush();
	    bw.close();
	    br.close();
	}

	private static void comb(int idx, int start, int t1, int t2) {
		if(idx==tgtIdx) {
			min = Math.min(min, Math.abs(t1-t2));
			return;
		}
		
		for (int i = start; i < N; i++) {
			comb(idx+1, i+1, t1*arr[i][0], (t2+arr[i][1]));
		}
		
	}
	
}
