package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_BJ_2851_���۸����� {

	//�������� ����. 1~N. 1���� ���ް� ������. ��� ������ �ݺ�
	//�ѻ���� M�� ������ ����
	//���� M������ ���� ���� ����� ���� ������, ���� ���� ���� Ƚ���� Ȧ�����̸�
	//�ڱ��� ���� ��ġ���� �ð�������� L��° �ִ� �������, ¦�����̸� �ݽð� ��������...

	static int sum = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 10; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(sum+tmp<=100) sum+=tmp;
			else {
				if(sum+tmp-100<=Math.abs(100-sum)) {
					sum+=tmp;
				}
				break;
			}

		}
		System.out.println(sum);

	}
}
