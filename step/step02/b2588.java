package step02;

import java.util.Scanner;

public class b2588 {

	public static void main(String[] args) {
//		알람시계		"45분 일찍 알람 설정하기"
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45) {
			System.out.println(h+" "+(m-45));
		}else {
			if(h!=0) {
				System.out.println(h-1+" "+(m-45+60));
			}else {
				System.out.println(23+" "+(m-45+60));
			}
		}
		
	}

}
