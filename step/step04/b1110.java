package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1110 N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int temp = n;
		
		while(true) {
			count++;
			
			int a = n/10;		
			int b = n%10;
			int result = b*10 + ((a+b)%10);
			//(a+b)%10 -> ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� 
			if(result==temp){
				System.out.println(count);
				break;
			}
			
			n = result;
			
		}


		
	}

}
