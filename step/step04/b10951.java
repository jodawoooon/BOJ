package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 10951 �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)	
//		EOF => hasNext
		
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			System.out.println(a+b);
		}
	}

}
