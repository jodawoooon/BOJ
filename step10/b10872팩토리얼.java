package boj.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b10872���丮�� {
	static int sum;
	
	//10 * 9 * 8 * 7 ... n=
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		sum = factorial(N);
		System.out.println(sum);
	}

	private static int factorial(int n) {
		//��������
		
		if (n <= 1) return 1;
		else
			return n * factorial(n-1);
	}
}
