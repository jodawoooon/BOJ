package algo.boj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1244_boolean {
	static int T, G, S, N;
	static boolean[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		//스위치 켜고 끄기
		//남학생 받은 수의 배수 스위치 상태 바꿈
		//여학생 받은 수를 중심으로 좌우가 대칭이면서 가장 많은 스위치를 포함하는 구간 스위치 상태 바꿈(항상홀수)
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); //스위치 개수	
		arr = new boolean[T+1];
		for (int t = 1; t <= T; t++) {
			int a = sc.nextInt(); //스위치의 상태 저장
			if(a==0) {
				arr[t] = false;
			}else {
				arr[t] = true;
			}
		}

		S = sc.nextInt(); //학생 수
		
		for (int s = 0; s <S; s++) {
			G = sc.nextInt(); //성별
			N = sc.nextInt(); //부여받은 자연수
			if(G==1) { //남학생이면
				for (int t = 1; t <= T; t++) {
					if(t%N==0 && t!=0) { //N의 배수이면
						arr[t] = !arr[t];
					}
				}
			}else if(G==2) { //여학생이면
					int cnt = 0;
					arr[N] = !arr[N]; //부여받은 자연수 스위치 상태 바꾸기
					
					while(true) { //좌우 대칭 일 때까지
						cnt++;
						int tmp1 = N - 1*cnt;
						int tmp2 = N + 1*cnt;

						if(tmp1>=1 && tmp2<=T && arr[tmp1]==arr[tmp2]) { //좌우대칭이면
							arr[tmp1] = !arr[tmp1];
							arr[tmp2] = !arr[tmp2];
						}else { //좌우대칭아니면 탈출
							break;
						}
						
					}
					

			}
		}
		
		for (int t = 1; t <= T; t++) {
			if(arr[t]) {
				System.out.print(1 + " ");
			}else {
				System.out.print(0 + " ");
			}
			if(t%20 == 0) System.out.println();
		}
		
	}

}
