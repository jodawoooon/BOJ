package com.boj.step6;

public class b4673 {
	static int[] selfNum = new int[10100];
	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			d(i);
		}
		
		for (int i = 1; i <= 10000; i++) {
			if(selfNum[i]==0) {
				System.out.println(i);
			}
			
		}
	}
	static void d(int n) {
		int sum = n;
		while(n>0) {
			sum += n % 10; //�� �ڸ� ���� ���Ѵ�.
			n = n /10; //�ڸ����� �ٿ�������.
		}
		selfNum[sum]++; //�ش� �ε����� ++
	}

}
