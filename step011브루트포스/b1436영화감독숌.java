package boj.step011���Ʈ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1436��ȭ������ {
	static int N,ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		
		//������ ���ڶ� � ���� 6�� ��� 3�� �̻� �������� ���� ��.
		// ���� ���� ������ ���� 666. �״��� 1666, 2666, 3666 .....
		//N��° ������ ����?
		int tmp = 666;
		int cnt = 1;
		while(true) {
			if(cnt==N) break;
			tmp++;
			if(String.valueOf(tmp).contains("666")) {
				cnt++;
			}
		}
		ans = tmp;
	
		System.out.println(ans);

	}
	
	

}
