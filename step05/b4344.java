package com.java.step5;

import java.util.Scanner;

public class b4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트 케이스 개수

		
		for (int i = 0; i < T; i++) {
			int num = sc.nextInt();
			int sum = 0;
			int[] arr = new int[num];
			for (int j = 0; j < num; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			float avg = (float)sum/num;
			int cnt = 0;
			for (int j = 0; j < num; j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f", (float)cnt/num*100);
			System.out.println("%");
		}
	}

}
