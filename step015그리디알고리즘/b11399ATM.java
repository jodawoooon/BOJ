package boj.step015�׸���˰���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b11399ATM {
	static int N, K;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//���������� �ּ������� ����� �ʹٸ�. �ϴ� ���� ū �ݾ��� ������ �ִ��� ���� ����Ѵ�.
		//�� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Arrays.sort(arr);
		int sum = arr[0];
		for (int i = 1; i < N; i++) {
			arr[i] = arr[i-1]+ arr[i];
			sum += arr[i];
		}
		
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		br.close();
		
	}
}
