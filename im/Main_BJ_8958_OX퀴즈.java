package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_BJ_8958_OX���� {

	//�������� ����. 1~N. 1���� ���ް� ������. ��� ������ �ݺ�
	//�ѻ���� M�� ������ ����
	//���� M������ ���� ���� ����� ���� ������, ���� ���� ���� Ƚ���� Ȧ�����̸�
	//�ڱ��� ���� ��ġ���� �ð�������� L��° �ִ� �������, ¦�����̸� �ݽð� ��������...

	static int T, ans, sum;
	static char tmp;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			sum = 0;
			ans = 0;
			String str = br.readLine();
			
			for (int s = 0; s < str.length(); s++) {
				
				if(str.charAt(s)=='O') {
					ans++;
					sum += ans;
				}else {
					ans = 0;
				}
			}
			System.out.println(sum);
		}
		
		

	}
}
