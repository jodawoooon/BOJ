package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 10952 �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		�Է��� ���������� 0 �� ���� ���´�.		
		
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if((a==0)&&(b==0)) break;
			System.out.println(a+b);
		}
	}

}
