package boj.step015�׸���˰���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b11047���� {
	static int N, K;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//���������� �ּ������� ����� �ʹٸ�. �ϴ� ���� ū �ݾ��� ������ �ִ��� ���� ����Ѵ�.
		
		int i = N-1;
		int cnt=0;
		while(true) {
			if(i<0) break;
			
			int tmp = K/arr[i];
			if(tmp!=0) {
				cnt += tmp;
				K -= tmp*arr[i];
			}
			i--;
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
		
	}
}
