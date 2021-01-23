package boj.step6;

import java.util.Scanner;

public class b1065 {
	public static void main(String[] args) {
		//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
		//등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
		//N이 주어졌을 때, 1보다 크거나 같고, 
		//N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		System.out.println(search(N));

		//등차수열은 연속하는 항의 차이가 모두 일정한 수열
		//An = A1 + (n-1)d 
		//1~99까지는 모두 등차수열
		
		System.out.println();
	}
	
	static int search(int n) {
		int count = 0;
		if(n<100) {
			count = n;
		}else if (n<=1000) {
			count = 99;
			for (int i = 100; i <= n; i++) {
				if(i==1000) {
					continue;
				}
				int i1 = i %10;
				int i2 = (i/10)%10;
				int i3 = (i/100)%10;
				
				if(i3-i2 == i2-i1){
					count++;
				}
			}
		}
		return count;
	}

}
