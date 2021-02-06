package boj.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b11729�ϳ���ž {
	static int N, K, cnt;
	static StringBuilder sb = new StringBuilder();
	//�ϳ��� ž.
	//���� ���� N  
	//n-1���� ������ ���� ->�ӽ� // n�� ������ ���� -> ����, n-1���� ���� �ӽ� -> ���� 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		hanoi(N, 1, 2, 3);
		System.out.println(cnt);
		System.out.println(sb);
	}
	private static void hanoi(int n, int from, int temp, int to) {
		if(n==0) {
			return;
		}
		
		hanoi(n-1, from, to, temp);
		cnt++;
		sb.append(from+" "+to+"\n");
		
		hanoi(n-1, temp, from, to);
	}
}
