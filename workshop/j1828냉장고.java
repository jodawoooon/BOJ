package com.ssafy.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j1828냉장고 {
//	화학물질 N개
//	각 Ci마다 최저 보관온도 xi와 최고 보관온도 yi가 정해져있다.
//	
//	즉 Ci는 온도 xi이상 yi 이하에 보관
//	이 물질들을 모두 보관하기 위해서는 여러 대의 냉장고가 필요
//	가장 적은수의 냉장고를 구해라
	static int N, cnt;
	static int[][] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    N = Integer.parseInt(br.readLine());
	    
	    arr = new int[N][2];
	    
	    for (int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[n][0] = Integer.parseInt(st.nextToken());
			arr[n][1] = Integer.parseInt(st.nextToken());
		}
	    
	    Arrays.sort(arr, (a,b) -> {
	    	if(a[1]==b[1]) {
	    		return Integer.compare(a[0], b[0]);
	    	}
	    	return Integer.compare(a[1], b[1]);
	    });
	    

	    int end = -270;

	    for(int i =0;i<N;i++) {
	    	if(arr[i][0]>end) {
	    		end=arr[i][1];
	    		cnt++;
	    	}
	    }
	    
	    bw.write(String.valueOf(cnt));
	    bw.flush();
	    bw.close();
	    br.close();
	}
}
