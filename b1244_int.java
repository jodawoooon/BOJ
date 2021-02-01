package algo.boj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1244_int {
	static int T, G, S, N;
	static int[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		//스위치 켜고 끄기
		//남학생 받은 수의 배수 스위치 상태 바꿈
		//여학생 받은 수를 중심으로 좌우가 대칭이면서 가장 많은 스위치를 포함하는 구간 스위치 상태 바꿈(항상홀수)
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); //스위치 개수	
		arr = new int[T+1];
		for (int t = 1; t <= T; t++) {
			arr[t]= sc.nextInt(); //스위치의 상태 저장

		}


		S = sc.nextInt(); //학생 수
		
		for (int s = 0; s <S; s++) {
			G = sc.nextInt(); //성별
			N = sc.nextInt(); //부여받은 자연수
			if(G==1) { //남학생이면
				for (int t = 1; t <= T; t++) {
					if(t%N==0) { //N의 배수이면
						if(arr[t]==1) arr[t]=0;
						else arr[t]=1;
					}
				}
			}else if(G==2) { //여학생이면
					int cnt = 0;
					if(arr[N]==1) arr[N]=0;
					else arr[N]=1;
					
					while(true) { //좌우 대칭 일 때까지
						cnt++;
						int tmp1 = N - 1*cnt;
						int tmp2 = N + 1*cnt;

						if(tmp1>=1 && tmp2<=T && arr[tmp1]==arr[tmp2]) { //좌우대칭이면
							if(arr[tmp1]==1) arr[tmp1]=0;
							else arr[tmp1]=1;
							if(arr[tmp2]==1) arr[tmp2]=0;
							else arr[tmp2]=1;
						}else { //좌우대칭아니면 탈출
							break;
						}
						
					}
					

			}
		}
		
		for (int t = 1; t <= T; t++) {
			System.out.print(arr[t]+" ");
			if(t%20 == 0) System.out.println();
		}
		
	}

}
