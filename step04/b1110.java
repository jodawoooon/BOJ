package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1110 N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int temp = n;
		
		while(true) {
			count++;
			
			int a = n/10;		
			int b = n%10;
			int result = b*10 + ((a+b)%10);
			//(a+b)%10 -> 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 
			if(result==temp){
				System.out.println(count);
				break;
			}
			
			n = result;
			
		}


		
	}

}
