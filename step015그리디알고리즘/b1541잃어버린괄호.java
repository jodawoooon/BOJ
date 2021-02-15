package boj.step015�׸���˰���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b1541�Ҿ������ȣ {
	static int sum;
	static boolean flag;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		flag = false;
		StringTokenizer subSt = new StringTokenizer(br.readLine(), "-");
		while(subSt.hasMoreTokens()) {
			
			int tmpSum = 0;
			
			StringTokenizer addSt = new StringTokenizer(subSt.nextToken(), "+");
			while(addSt.hasMoreTokens()) {
				tmpSum += Integer.parseInt(addSt.nextToken());
			}
			
			if(!flag) {
				sum = tmpSum;
				flag = true;
			}else {
				sum -= tmpSum;
			}
		}

		
		System.out.println(sum);
	}
}

