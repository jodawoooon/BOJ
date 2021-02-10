package algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2563������ {
	static int T, X, Y, ans;
	static boolean[][] arr = new boolean[100][100];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine()); //T = �������� ��
		//����, ���� ���� 10�� ���簢�� ������
		
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
			X = Integer.parseInt(st.nextToken()); //N = �������� ���� ���� ��ȭ���� ���� �� ������ �Ÿ�
			Y = Integer.parseInt(st.nextToken()); //M = �������� �Ʒ� ���� ��ȭ���� �Ʒ� �� ������ �Ÿ�
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if(!arr[X+i][Y+j]) {
						arr[X+i][Y+j] = true;
						ans++;
					}
					
				}
			}
			
			
			
		}
		
		System.out.println(ans);
	}
}
