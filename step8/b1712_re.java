package boj.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1712_re {
	static int BEP = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		//System.out.println(A+" "+B+" "+C);
		
		//���ڷ� ����
		// Cn > A + Bn
		// (C-B)n > a
		// n > a/(c-b)
		//(c-b)<=0�̸� ���ͺб����� ����
		if(C<=B) {
			BEP = -1;
		}else {
			BEP = A/(C-B)+1;
		}
		
		System.out.println(BEP);
		
	}
}
