package com.java.step5;

import java.util.Scanner;

public class b1546 {
	public static void main(String[] args) {
		//1546 ���
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //���� �� ������ ���� <=1000
		int[] score = new int[N];
		for(int n=0;n<N;n++) {
			score[n] = sc.nextInt(); //���� ����
		}
		/*
		 * ���� ���� �� �ִ� = M
		 * ��� ������ ����/M*100
		 */
		
		int M = score[0];
		for (int i = 0; i < N; i++) {
			if(score[i]>M) {
				M = score[i];
			}
		}
		
		
		float sum = 0;
		for (int j = 0; j < N; j++) {
			sum += (float)score[j]/M*100;
			//score[j]/M�� �Ҽ��������� ��ȯ������� �Ѵ�. int�� �������ϸ� 0�� ����
		}

		System.out.println(sum/N);

		
	}

}
