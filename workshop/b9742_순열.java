package algo.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b9742_순열 {
	
	static int tgtIdx, length, COUNT;
	static char[] src;
	static char[] tgt;
	static boolean[] select;
	static boolean found;
	static StringBuilder sb = new StringBuilder();
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringTokenizer st;
		while(true) {
			cnt = 0;
			try {
				str = br.readLine();
				
			}catch (Exception e) {
				break;
			}
			
			sb.setLength(0);
			st = new StringTokenizer(str);

			src = st.nextToken().toCharArray();
			tgtIdx = Integer.parseInt(st.nextToken());
			length = src.length;

			tgt = new char[length];
			select = new boolean[length];
			
			
			perm(0);

			if(!found) {
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
				sb.append(tgt);
				System.out.println(sb);
			}
			return;
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
