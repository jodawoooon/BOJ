package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BJ_2578_���� {
	static int cnt, num;
	static boolean checkUp, checkDown;
	static boolean checkI[], checkJ[];
	static int arr[][] = new int[5][5];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��ȸ�ڰ� �θ��� ���� ���ʷ� �����.
		//���� ������ ������ ��� �������� ���� �ߴ´�
		//�� 3���̻� �׾����� ����
		
		checkI = new boolean[5];
		checkJ = new boolean[5];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cnt = 0;
		num=0;
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < 5; j++) {
				cnt++;
				int tmp = Integer.parseInt(st.nextToken());
				bingo(tmp);
				lineCheck();
				
				
				if(num>=3) {
					System.out.println(cnt);
					return;
				}
				
			}
		}
	
	}
	
	private static void bingo(int tmp) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(arr[i][j]==tmp) {
					arr[i][j]=1;
				}
			}
		}
		
	}

	private static void lineCheck() {
		for (int i = 0; i < 5; i++) {
			if(!checkI[i]) {
				int cnt = 0;
				for (int j = 0; j < 5; j++) {
					if(arr[i][j]==1) {
						
						cnt++;
					}
					if(cnt==5) {
						checkI[i] = true;
						num++;
					}
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {	
			int cnt = 0;
			if(!checkJ[i]) {
				for (int j = 0; j < 5; j++) {
					if(arr[j][i]==1) {
						
						cnt++;
					}
					if(cnt==5) {
						checkJ[i] = true;
						num++;
					}
				}
			}
			
			

		}
		if(!checkDown) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if(arr[i][i]==1) cnt++;
				if(cnt==5) {
					checkDown = true;
					num++;
				}
			}
		}
		
		if(!checkUp) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if(arr[i][4-i]==1) cnt++;
				if(cnt==5) {
					checkUp= true;
					num++;
				}
			}
		}

	}
}
