package com.boj.step3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 백준 2438 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		
		for(int i=0;i<n;i++) {
			s += "*";
			System.out.println(s);
		}
		
	}

}
