package com.boj.step3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ���� 2438 ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>=(n-i-1)) {
					System.out.print("*");
				}else {System.out.print(" ");}
			}System.out.println();
		}
		
	}

}

//0.4
// 1.3 1.4
