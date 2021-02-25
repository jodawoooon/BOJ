package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_BJ_1244_����ġ�Ѱ���� {

	static int N,K,ans,sum;
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		N = Integer.parseInt(br.readLine());
 
		arr = new int[N+1];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int n = 1; n <= N; n++) {
			arr[n] = Integer.parseInt(st.nextToken());
		}
		
		int stNum = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < stNum; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int gender = Integer.parseInt(st.nextToken());//����
			int getNum = Integer.parseInt(st.nextToken());//������
			
			//1 ���� 0 ����
			//���л��̶��
			//����ġ ��ȣ�� �ڱⰡ ���� ���� ����̸�. �� ����ġ ���� �ٲ۴�
			if(gender==1) {
				for (int n = 1; n <= N; n++) {
					if(n%getNum==0) {
						if(arr[n]==1) arr[n]=0;
						else arr[n]=1;
					}
				}
				
			}else {
				//���л��̶�� ���� ���� ���� ��ȣ ����ġ�� �߽�����
				//�¿찡 ��Ī�̸� ���帹�� ����ġ�� �����ϴ� ���� ���� ��� �ٲ�
	
				int cnt = 0;
				while(true) {
					int n1 = getNum+1*cnt;
					int n2 = getNum-1*cnt;
					
					if(n1>N||n2<0) break;
					
					if(arr[n1]==arr[n2]) {
						if(arr[n1]==1) {
							arr[n1]=0;
							arr[n2]=0;
						}else {
							arr[n1]=1;
							arr[n2]=1;
						}
						cnt++;
					}else {
						break;
					}
				}
			}
			
		}
		
		for (int i = 1; i <=N; i++) {
			if(i%20==0)System.out.println(arr[i]);
			else System.out.print(arr[i]+" ");
			
		}
		
	}
}
