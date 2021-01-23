package boj.step6;

import java.util.Scanner;

public class b1065 {
	public static void main(String[] args) {
		//� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
		//���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
		//N�� �־����� ��, 1���� ũ�ų� ����, 
		//N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		System.out.println(search(N));

		//���������� �����ϴ� ���� ���̰� ��� ������ ����
		//An = A1 + (n-1)d 
		//1~99������ ��� ��������
		
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
