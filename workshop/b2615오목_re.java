package com.ssafy.day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2615오목_re {
	//바둑판의 상태를 입력받아서 승부를 판단하는 프로그램
	// 3가지 경우 : 검은색 승 , 흰색 승, 승부결정 X
	
	//dr, dc 정하는게 제일 중요하다.
	static int [] dr = {1,1,0,-1}; //순서가중요
	static int [] dc = {0,1,1 ,1};
	static int[][] board;

	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ans = 0;
		board = new int[20][20];
		
		//오목판 셋팅
		for (int i = 1; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 1; j < 20; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		boolean flag = false;
		for (int r = 1; r < 20; r++) {
			for (int c = 1; c < 20; c++) {
				if(board[r][c]!=0) {
					//4방 탐색
					for (int d = 0; d < 4; d++) {
						int nr = r+dr[d];
						int nc = c+dc[d];
						int cnt = 1;
						//오목인지 확인
						//새로운 돌이 오목판 안에 있고 같은 색이면
						while(check(nr,nc)&&board[nr][nc]==board[r][c]) {
							nr+=dr[d];
							nc+=dc[d];
							cnt++;
						}
						if(cnt==5) {//오목이면
							int bCnt =0;
							nr+=(dr[d]*-1);
							nc+=(dc[d]*-1);
							while(check(nr,nc)&&board[nr][nc]==board[r][c]) {
								nr+=(dr[d]*-1);
								nc+=(dc[d]*-1);
								bCnt++;
							}
							if(bCnt>5) {
								continue;
							}
							System.out.println(board[r][c]);
							System.out.println(r+" "+c);
							flag = true;
						}
					}
				}
			}
		}
		if(!flag) {
			System.out.println(0);
		}
	


	}
	private static boolean check(int nr, int nc) {
		if(nr>=1&&nr<20&&nc>=1&&nc<20) return true;
		else return false;
	}
	
}
