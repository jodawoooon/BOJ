package boj.step011���Ʈ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2798���� {
	static int N, M, ans;
	static int[] card;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		//M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ��
		card = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for (int n = 0; n < N; n++) {
			card[n] = Integer.parseInt(st2.nextToken());
		}
		
		comb(0,0,0);
		System.out.println(ans);
	}
	private static void comb(int idx, int start, int sum) {
		if(idx==3) {
			if(sum<=M) {
				ans = Math.max(ans, sum);
			}
			return;
		}
		for (int i = start; i < N; i++) {

			comb(idx+1, i+1, sum+card[i]);
		}
	}
}
