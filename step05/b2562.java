package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 2562 �ִ�
		
		
		Scanner sc = new Scanner(System.in);
		
		int max = 1;
		int max_index = 0;

		for(int i=0;i<9;++i) {
			int x = sc.nextInt();
			if(x>max) {
				max = x;
				max_index = i+1; //x�� max�϶� index���̹Ƿ� ��ȣ�ȿ� ������Ѵ�.
			}
		}
		
		System.out.println(max);
		System.out.println(max_index);

		
	}

}
