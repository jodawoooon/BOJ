package boj.im;

import java.util.Scanner;

public class Main_BJ_1592_�����̿�ģ���� {

	//�������� ����. 1~N. 1���� ���ް� ������. ��� ������ �ݺ�
	//�ѻ���� M�� ������ ����
	//���� M������ ���� ���� ����� ���� ������, ���� ���� ���� Ƚ���� Ȧ�����̸�
	//�ڱ��� ���� ��ġ���� �ð�������� L��° �ִ� �������, ¦�����̸� �ݽð� ��������...
	
	static int N, M, L, cnt;
	static int[] arr;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		arr = new int[N];
		
		int idx = 0;
		while(true) {
			arr[idx]++;
			
			//��������
			for (int i : arr) {
				if(i==M) {
					System.out.println(cnt);
					return;
				}
			}
		
			if(arr[idx]%2==1) {//��������Ƚ���� Ȧ�����̸�, �ð����
				//0 2 4 => (1,3,5)Ȧ			
				idx = (idx+N-L)%N;
				
			}else{
				idx = (idx+L)%N;
				//1 3 => (2,4) ¦
			}
			
			cnt++;
			
		}
		

	}
}
