package swea.im;

import java.util.Scanner;

public class Solution_SWEA_2805_���۹���Ȯ�ϱ� {
	
	static int N, ans, arr[][], sum, cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		//N*Nũ���� ����. N�� �׻� Ȧ��
		//��Ȯ�� �פ��� ������ ũ�⿡ �� �´� ���簢�� ������ ���¸� ����
		
		//��ü sum���� �����ڸ��� ���°� ��������?
		//�ƴϸ� ����� ¥����
		//�� �Ʒ� �и��ؼ� for��
		
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			sum=0;
			arr = new int[N][N];
			int half = N/2;
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				char[] tmp = sc.next().toCharArray();
				for (int j = 0; j < N; j++) {
					arr[i][j]=tmp[j]-'0';
					if(j>=half-cnt&&j<=half+cnt) {
						sum+=arr[i][j];
					}
				}
				if(i<half) cnt++;
				else cnt--;
			}

			System.out.println("#"+t+" "+sum);
		}
	}
}
