package boj.step012����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b11650��ǥ�����ϱ�_re {
	static int N,ans;

	static int[][] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
//		Arrays.sort(arr, (a,b) -> {
//				if(a[0]!=b[0]) return a[0]-b[0];
//				else return a[1]-b[1];
//		});
//		
		Arrays.sort(arr, (a,b) -> {
			if(a[0]!=b[0]) return Integer.compare(a[0], b[0]);
			else return Integer.compare(a[1], b[1]);
	});
		
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(arr[i][0])+" "+String.valueOf(arr[i][1])+"\n");
		}
		bw.flush();
		bw.close();
		br.close();

	}
	
		
}
