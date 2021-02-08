package review;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����ġ�Ѱ���� {
	static int N, S;
	static int[] arr;
	public static void main(String[] args) throws Exception {

		//����ġ���� �Է¹ް� �л��� �̾Ƽ� �ڿ����� �ش�
		//���л� -> ����ġ ��ȣ�� �ڱⰡ ���� ���� ����̸�, �� ����ġ�� ���¸� �ٲ۴�.(1->0, 0->1)
		//���л� -> ����ġ ��ȣ�� �߽����� �¿찡 ��Ī�̸鼭 ���� ���� ����ġ�� �����ϴ� ������ ã�Ƽ�
		//�� ������ ����ġ�� ��� �ٲ�(�׻�Ȧ��)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		S = Integer.parseInt(br.readLine());
		for (int s = 0; s < S; s++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			int G = Integer.parseInt(st2.nextToken());
			int gNum = Integer.parseInt(st2.nextToken());
			if(G==1) {
				//���л��϶�
				for (int i = 1; i <= N; i++) {
					if(i%gNum==0) {
						if(arr[i]==1) arr[i]=0;
						else arr[i]=1;
					}
				}
			}else {
				//���л��϶�
				int cnt = 0;

				while(true) {
					
					int ni1 = gNum - 1*cnt;
					int ni2 = gNum + 1*cnt;
					
					if(ni1>=1 && ni2<=N &&arr[ni1]==arr[ni2]) {
						if(arr[ni1]==1) {
							arr[ni1]=0;
							arr[ni2]=0;
						}
						else {
							arr[ni1]=1;
							arr[ni2]=1;
						}
						cnt++;
					}else {
						break;
					}
					
				}
			}
		}
		
		for (int i = 1; i <= N; i++) {
			if(i%20==0) System.out.println(arr[i]);
			else System.out.print(arr[i]+" ");
			
		}
		
	}
}
