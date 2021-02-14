package boj.step013��Ʈ��ŷ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b15650N��M2 {
	static int N,M;
	static int[] tgt;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		tgt = new int[M];
		
		//���⼭ �ߺ����� M���� ����
		
		comb(0, 1);
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	private static void comb(int idx, int start) throws IOException {
		if(idx==M) {
			//Arrays.sort(tgt);
			for (int n : tgt) {
				bw.write(String.valueOf(n)+" ");
			}bw.write("\n");
			return;
		}
		for(int i=start;i<=N;i++) {
			tgt[idx] = i;
			comb(idx+1, i+1);
		}
		
	}

}
