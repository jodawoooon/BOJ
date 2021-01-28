package boj.step7;

import java.util.Scanner;

public class b5622 {
	public static void main(String[] args) {
		//´ÙÀÌ¾ó
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int time = 0;
		for (int i = 0; i < word.length(); i++) {
			time += (word.charAt(i)-'A')/3 + 3;
			if(word.charAt(i) == 'S' || word.charAt(i) == 'V' || word.charAt(i) == 'Y' || word.charAt(i) == 'Z' ) {
				time--;
			}
		}
		System.out.println(time);
	}

}
