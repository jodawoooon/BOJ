package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 10818 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int max = 1;
		int min = 1000000;
		int[] arr = new int[N];

		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		for(int i=0;i<N;i++) {
			
		}
		
		System.out.println(min+" "+max);


		
	}

}
