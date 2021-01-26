package boj.step7;

import java.util.Scanner;

public class b1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		//��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
		//�ִ� ���� ���ĺ� ���ϱ�
		// �ƽ�Ű �ڵ� ?
		
		int[] arr = new int[26];//�������� ������ 26����
		
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i) >= 65 && S.charAt(i) <=90) {//�빮�� 65~90
				arr[S.charAt(i)-'A']++;
			}else {//�ҹ���
				arr[S.charAt(i)-'a']++; //�ҹ��� 97~122
			}
		}
		
		int max = -1;
		char C = '?';
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				C = (char)(i+'A');
			}else if(arr[i] == max) {
				C = '?';
			}
		}
		
		System.out.println(C);

	}

}
