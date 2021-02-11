import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b16935배열돌리기3 {
	//크기가 N*M인 배열. 연산 R번 적용. 총 6가지 연산
	//1번 => 상하반전
	//2번 => 좌우반전
	//3번 => 오른쪽으로 90도 회전
	//4번 => 왼쪽으로 90도 회전
	//5번 => 부분배열로 나누어서 1번 그룹의 부분 배열을 2번 그룹 위치로, 2번을 3번으로, 3번을 4번으로, 4번을 1번으로 이동
	//6번 반대로 부분배열 이동
	static int N, M, R, com, newN, newM;
	static int[][] A, tmpArr;
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		
		A = new int[N][M]; //초기값 저장할 배열
		
		
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			for (int m = 0; m < M; m++) {
				A[n][m]=Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		
		for (int r = 0; r < R; r++) {
			com = Integer.parseInt(st.nextToken());//수행해야 하는 연산
			switch (com) {
			case 1: //상하반전
				//A[N-n-1][m]과 A[n][m]을 바꾼다
				newN = A.length;
				newM = A[0].length;
				for (int n = 0; n < newN/2; n++) { //절반까지만. n<N까지하면 위아래 아예 다바뀌어서 그대로임
					for (int m = 0; m < newM; m++) {
						int tmp = A[n][m];
						A[n][m] = A[newN-n-1][m];
						A[newN-n-1][m] = tmp;
					}
				}
				
				break;
			case 2: //좌우반전
				newN = A.length;
				newM = A[0].length;
				for (int n = 0; n < newN; n++) {
					for (int m = 0; m < newM/2; m++) {
						//n,M-m-1과 n,m을 바꾼다
						int tmp = A[n][m];
						A[n][m] = A[n][newM-m-1];
						A[n][newM-m-1] = tmp;
					}
				}
				break;
			case 3: //왼쪽90도회전
				newN = A.length; //회전하면서 M,N의 사이즈가 바뀌므로 command를 받아올때마다 newN, newM을 선언하여 새로운 행, 열의 크기를 저장한다
				newM = A[0].length;
				tmpArr = new int[newM][newN];
				for (int n = 0; n < newN; n++) {
					
					for (int m = 0; m < newM; m++) {
						//n,M-m-1과 n,m을 바꾼다
						tmpArr[m][newN-n-1] = A[n][m];
					}
				}
				A = tmpArr;
				
				break;
			case 4: //오른쪽90도회전
				newN = A.length;
				newM = A[0].length;
				tmpArr = new int[newM][newN];
				for (int m = 0; m < newM; m++) {
					
					for (int n = 0; n < newN; n++) {
						tmpArr[m][n] = A[n][newM-m-1];
					}
				}
				A = tmpArr;
				
				break;
			case 5:
				//배열을 4개 부분으로 나누어서 이동
				newN = A.length;
				newM = A[0].length;
				tmpArr = new int[newN][newM];
				for (int n = 0; n < newN; n++) {
					for (int m = 0; m < newM; m++) {
						if(n < newN/2 && m < newM/2) {//1->2
							tmpArr[n][m+newM/2] = A[n][m];
							
						}else if(n < newN/2 && m >= newM/2) {//2->3
							tmpArr[n+newN/2][m] = A[n][m];
							
						}else if(n >= newN/2 && m >= newM/2) {//3->4
							tmpArr[n][m-newM/2] = A[n][m];
							
						}else if(n >= newN/2 && m < newM/2) {//5->6
							tmpArr[n-newN/2][m] = A[n][m];
							
						}
					}
				}
				A = tmpArr;
				
				break;
			case 6:
				//5와 반대로 이동
				newN = A.length;
				newM = A[0].length;
				tmpArr = new int[newN][newM];
				for (int n = 0; n < newN; n++) {
					for (int m = 0; m < newM; m++) {
						if(n < newN/2 && m < newM/2) {//1->4
							tmpArr[n+newN/2][m] = A[n][m];
							
						}else if(n < newN/2 && m >= newM/2) {//2->1
							tmpArr[n][m-newM/2] = A[n][m];
							
							
						}else if(n >= newN/2 && m >= newM/2) {//3->2
							tmpArr[n-newN/2][m] = A[n][m];
							
						}else if(n >= newN/2 && m < newM/2) {//4->3
							tmpArr[n][m+newM/2] = A[n][m];
						}
					}
				}
				A = tmpArr;
				break;
			}
		}
		newN = A.length;
		newM = A[0].length;
		for (int n = 0; n < newN; n++) {
			for (int m = 0; m < newM; m++) {
				System.out.print(A[n][m]+" ");
			}System.out.println();
		}
		
		
	}
}
