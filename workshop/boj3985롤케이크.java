package com.ssafy.day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj3985롤케이크 {
//	길이 L미터의 롤케이크 만듬
//	N명에게 케이크를 나눠준다
//	롤 케이크를 펼쳐서 1미터 단위로 자른다. 1번~L번
//	1번~N번의 방청객은 종이에 자신이 원하는 조각을 적어서 낸다
//	이때 두 수 P와 K를 적어서 내며 P번부터 K번 조각을 원한다는 뜻이디ㅏ
//	1번 방청객부터 순서대로 펼쳐 해당하는 조각을 준다
//	이때 이미 번호가 적혀있는 조각은 넘어간다
//	가장 많은 케이크 조각을 받을것을 기대한 방청객의 번호와
//	실제로 가장많은 케이크 받은애 번호 출력
	
	
	static int L, N, expectMax, expectMaxIdx,realMax, realMaxIdx;
	static int[][] arr;
	static boolean[] check;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    L = Integer.parseInt(br.readLine());
	    N = Integer.parseInt(br.readLine());
	    realMax = 0;
	    expectMax = 0;
	    check = new boolean[L+1];
	    arr = new int[N][2];
	    for (int n = 0; n < N; n++) {
	    	
	    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[n][0] = Integer.parseInt(st.nextToken());
			arr[n][1] = Integer.parseInt(st.nextToken());
			
			if(expectMax < arr[n][1]-arr[n][0]) {
				expectMax = arr[n][1]-arr[n][0];
				expectMaxIdx = n+1;
			}
			
		}
	    

	    for (int n = 0; n < N; n++) {
	    	int cnt = 0;
			for (int i = arr[n][0]; i <= arr[n][1]; i++) {
				if(!check[i]) {
					check[i] = true;
					cnt++;
				}
				
				
			}

			if(cnt > realMax ) {
				realMax = cnt;
				realMaxIdx = n+1;
			}
		}
	    
	    
	    bw.write(String.valueOf(expectMaxIdx)+"\n");
	    bw.write(String.valueOf(realMaxIdx)+"\n");
	    bw.flush();
	    bw.close();
	    br.close();
	    
	}
}
