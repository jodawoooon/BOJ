package boj.step012����;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2750�������ϱ�_���� {
	static int N,ans;
	static int[] sort;
	//��������
	//������ �κа� �������� ���� �κ��� ���� ��, ������ ����� �������� ���� �κп��� ���ʴ�� ���� ���ϸ鼭 ���Ե� �ε����� ã�´�.

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		sort = new int[N];
		
		for (int i = 0; i < N; i++) {
			sort[i] = Integer.parseInt(br.readLine());
		}

		//��������
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1-i; j++) {
				if(sort[j]>sort[j+1]){
					int tmp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = tmp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(sort[i]);
		}
		
	}
}
