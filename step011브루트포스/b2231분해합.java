package boj.step011���Ʈ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2231������ {
	static int N, ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		//N�� ������ = N�� N�� �̷�� �� �ڸ� ���� ��
		//245�� ������ = 245 + 2 + 4 + 5 = 256. 
		//N�� ���� ���������� ���ϱ�
		
		//256�� �����ڴ� ���������� �ִ�. 
		
		//���Ʈ���� ��� -> 1���� N���� ����
		//ã���� ����. ��ã���� 0���
		
		for (int i = 0; i < N; i++) {
			int num = i;
			int sum = 0;
			
			while(num!=0) {
				sum += num%10; //�� �ڸ����� ���Ѵ�
				num  /= 10;
			}
			
			if(sum + i == N) {
				ans = i;
				break;
			}
				
		}
		System.out.println(ans);
		
	}
}
