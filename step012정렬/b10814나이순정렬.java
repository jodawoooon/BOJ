package boj.step012����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class b10814���̼����� {
	static int N,ans;
	
	static String[][] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		
		//���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//���̰� ª�� �ͺ���
		//���̰� ������ ���� ������
		arr = new String[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (a,b) -> {
			return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));

	});
		
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(arr[i][0])+" "+arr[i][1]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}
	
		
}
