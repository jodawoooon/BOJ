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

		int tmp = 0;
		int idx = 0;
		//���������� i=1����
		for (int i = 1; i < N; i++) {
			tmp = sort[i];
			idx = i;
			while(true) {
				if(idx<=0||tmp>=sort[idx-1]) break;
				
				//���������϶����� �ݺ�
				sort[idx] = sort[idx-1];
				idx--;
			}
			sort[idx] = tmp;
			
		}
		for (int i = 0; i < N; i++) {
			System.out.println(sort[i]);
		}
		
	}
}
