package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_BJ_2559_���� {

	static int N,K,ans,sum;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
 
		arr = new int[N+1];
		
		K = Integer.parseInt(st.nextToken());
		ans = Integer.MIN_VALUE;
		int sum = 0;
		
		st = new StringTokenizer(br.readLine()," ");
		for (int n = 0; n < N; n++) {
			arr[n] = Integer.parseInt(st.nextToken());
		}
		//�ټ����� ��� �Űܰ��鼭 �������� �ʰ�
		//ó���� 5���� �����ϰ�, �� ������ 5�� �����ϰ� �Ǿտ��� ���� ������� �� ���ִ�
		for (int i = 0; i < K; i++) {
			sum += arr[i];
		}

		for (int k = 0; k < N-K+1; k++) {
			ans = Math.max(sum, ans);
			sum += arr[k+K];
			sum -= arr[k];
			
		}


		System.out.println(ans);
	}
}
