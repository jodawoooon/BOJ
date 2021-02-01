package algo.boj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1244_boolean {
	static int T, G, S, N;
	static boolean[] arr;
	public static void main(String[] args) throws FileNotFoundException {
		//����ġ �Ѱ� ����
		//���л� ���� ���� ��� ����ġ ���� �ٲ�
		//���л� ���� ���� �߽����� �¿찡 ��Ī�̸鼭 ���� ���� ����ġ�� �����ϴ� ���� ����ġ ���� �ٲ�(�׻�Ȧ��)
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); //����ġ ����	
		arr = new boolean[T+1];
		for (int t = 1; t <= T; t++) {
			int a = sc.nextInt(); //����ġ�� ���� ����
			if(a==0) {
				arr[t] = false;
			}else {
				arr[t] = true;
			}
		}

		S = sc.nextInt(); //�л� ��
		
		for (int s = 0; s <S; s++) {
			G = sc.nextInt(); //����
			N = sc.nextInt(); //�ο����� �ڿ���
			if(G==1) { //���л��̸�
				for (int t = 1; t <= T; t++) {
					if(t%N==0 && t!=0) { //N�� ����̸�
						arr[t] = !arr[t];
					}
				}
			}else if(G==2) { //���л��̸�
					int cnt = 0;
					arr[N] = !arr[N]; //�ο����� �ڿ��� ����ġ ���� �ٲٱ�
					
					while(true) { //�¿� ��Ī �� ������
						cnt++;
						int tmp1 = N - 1*cnt;
						int tmp2 = N + 1*cnt;

						if(tmp1>=1 && tmp2<=T && arr[tmp1]==arr[tmp2]) { //�¿��Ī�̸�
							arr[tmp1] = !arr[tmp1];
							arr[tmp2] = !arr[tmp2];
						}else { //�¿��Ī�ƴϸ� Ż��
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
