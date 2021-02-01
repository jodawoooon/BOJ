package algo.boj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1244_int {
	static int T, G, S, N;
	static int[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		//����ġ �Ѱ� ����
		//���л� ���� ���� ��� ����ġ ���� �ٲ�
		//���л� ���� ���� �߽����� �¿찡 ��Ī�̸鼭 ���� ���� ����ġ�� �����ϴ� ���� ����ġ ���� �ٲ�(�׻�Ȧ��)
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); //����ġ ����	
		arr = new int[T+1];
		for (int t = 1; t <= T; t++) {
			arr[t]= sc.nextInt(); //����ġ�� ���� ����

		}


		S = sc.nextInt(); //�л� ��
		
		for (int s = 0; s <S; s++) {
			G = sc.nextInt(); //����
			N = sc.nextInt(); //�ο����� �ڿ���
			if(G==1) { //���л��̸�
				for (int t = 1; t <= T; t++) {
					if(t%N==0) { //N�� ����̸�
						if(arr[t]==1) arr[t]=0;
						else arr[t]=1;
					}
				}
			}else if(G==2) { //���л��̸�
					int cnt = 0;
					if(arr[N]==1) arr[N]=0;
					else arr[N]=1;
					
					while(true) { //�¿� ��Ī �� ������
						cnt++;
						int tmp1 = N - 1*cnt;
						int tmp2 = N + 1*cnt;

						if(tmp1>=1 && tmp2<=T && arr[tmp1]==arr[tmp2]) { //�¿��Ī�̸�
							if(arr[tmp1]==1) arr[tmp1]=0;
							else arr[tmp1]=1;
							if(arr[tmp2]==1) arr[tmp2]=0;
							else arr[tmp2]=1;
						}else { //�¿��Ī�ƴϸ� Ż��
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
