package com.boj.step4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 2562 최댓값
		
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String str = Integer.toString(A*B*C);
		for(int i=0;i<10;i++) {
			int cnt = 0;
			for(int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0')==i) {//아스키 코드 이용. 문자를 숫자로 변환한다
					cnt++;
				}
			}System.out.println(cnt);
		}
		



		
	}

}
