package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 2562 �ִ�
		
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String str = Integer.toString(A*B*C);
		for(int i=0;i<10;i++) {
			int cnt = 0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0')==i) {//�ƽ�Ű �ڵ� �̿�. ���ڸ� ���ڷ� ��ȯ�Ѵ�
					cnt++;
				}
			}System.out.println(cnt);
		}
		



		
	}

}
