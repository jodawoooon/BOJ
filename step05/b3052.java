package com.java.step5;
import java.util.Scanner;

public class b3052 {

	public static void main(String[] args) {
		// 3052 ������
		
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int[] arr = new int[10];
		for(int k=0;k<10;k++) {
			arr[k] = sc.nextInt()%42;
			
		}
		for(int i = 0;i<10;i++) {
			int same = 0;
			for(int j=i+1;j<10;j++) {
				if(arr[i]==arr[j]) {
					same++;
				} //�ߺ����� same�̸� ī��Ʈ

			}
			if(same==0) cnt++; //�ϳ��� same�� ������ cnt++�Ѵ�. (���� �ٸ� ���̶�� ��)
		}
		System.out.println(cnt);

	}

}
