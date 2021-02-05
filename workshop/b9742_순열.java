package algo.boj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b9742_순열 {
	
	static int tgtIdx, length, COUNT;
	static String str;
	static char[] src;
	static char[] tgt;
	static boolean[] select;
	static boolean found;
	static StringBuilder sb = new StringBuilder();
	static int cnt;
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("9742input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {

			str = br.readLine();
			if( str == null ) break;
			
			sb.setLength(0);
			COUNT = 0;
			found = false;
			
			StringTokenizer st = new StringTokenizer(str);
			
			src = st.nextToken().toCharArray();
			tgtIdx = Integer.parseInt(st.nextToken());
			length = src.length;

			tgt = new char[length];
			select = new boolean[length];
			
			
			perm(0);

			if(!found) {
				System.out.print(str+" = ");
				System.out.println("No permutation");
			}


		}
	}
	
	private static void perm(int idx) { 
		//기저조건
		
		if(idx == length) {
			
			//System.out.println(Arrays.toString(tgt));
			COUNT++;
			if(COUNT==tgtIdx) {
				found = true;
				sb.append(str).append(" = ").append(tgt);
				System.out.println(sb);
				return;
			}
			
		}
		for (int i = 0; i < length; i++) {
			if(select[i]) continue;
			tgt[idx] = src[i];
			select[i] = true;
			perm(idx+1);
			select[i] = false;
		}
		
	}

}
