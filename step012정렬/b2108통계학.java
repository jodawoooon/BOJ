package boj.step012����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class b2108����� {
	static int N,ans;

	static int[] arr, cnt;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());

		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		//������ : N���� ������ ���� N���� ���� ��. �Ҽ��� ù°�ڸ����� �ݿø��� ��
		double sum = 0;
		
		for (int n : arr) {
			sum += n;
		}
		double res = Math.round(sum/N);
		bw.write((int)res+"\n");
		
		//�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
		bw.write(arr[N/2]+"\n");
		
		//�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��. ������ ������ �ֺ� �� �� �ι�°�� ���� ��
		//�ԷµǴ� ������ ������ 4000�� ���� �ʴ´�. -4000~+4000
		
		cnt = new int[8001];
		ArrayList<Integer> list = new ArrayList<>();
		int max = 0;
		for (int n : arr) {
			cnt[4000+n]++;
		}
		
		for (int i = 0; i < cnt.length; i++) {
			if(max<cnt[i]) {
				max = cnt[i];
			}
		}
		//�� �ϳ����� �ִ°�
		if(max==1) { 
			if(arr.length==1) {
				bw.write(arr[0]+"\n");
			}else {
				bw.write(arr[1]+"\n"); //�������� ���ĵ� arr���� 2��° ���� print��
			}
			
		}else {
			for (int i = 0; i < cnt.length; i++) {
				if(max == cnt[i]) {
					list.add(i-4000);
				}
			}
			Collections.sort(list);
			if(list.size()==1) {
				bw.write(list.get(0)+"\n");
			}else {
				bw.write(list.get(1)+"\n"); //�������� ���ĵ� arr���� 2��° ���� print��
			}
			
		}


		//���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		bw.write(arr[N-1]-arr[0]+"\n");
		bw.flush();
		bw.close();
		br.close();

	}
	
		
}
