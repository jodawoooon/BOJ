package com.java.step5;
import java.util.Scanner;
public class b10818 {

	public static void main(String[] args) {
		// 10818 N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
			
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<N;i++) {
		
			if(arr[i]>max){
                max = arr[i];

            }
			if(arr[i]<min){
                min = arr[i];

            }
		}
		System.out.println(min+" "+max);

	}

}
