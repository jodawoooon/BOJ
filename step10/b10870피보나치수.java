package boj.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b10870�Ǻ���ġ�� {
	static int[] f = new int[21];
	public static void main(String[] args) throws Exception {
		//0��° = 0, 1��°, 1
		//2��° = Fn + Fn-1 +Fn-2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		f[0] = 0;
		f[1] = 1;
		
		System.out.println(fibo(n));
	}
	
	private static int fibo(int n) {
		
		if(n>=2 && f[n] == 0) {
			f[n] = fibo(n-1)+fibo(n-2);
		}
		return f[n];
	}
}
