package boj.step012����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class b10989�������ϱ�3 {
	static int N,ans;

	static int[] arr, sort;
	//ī�������� (���� ������ �۴ٸ�.)
	//ī��������  : �ߺ��Ǵ� ������ ������ ���� �����ϴ� ���.. 
	//������ �迭���� �ִ밪 ����. 0���� �ִ밪���� �� ���ڰ� ��� �����ϴ��� ī����. 
	// ī������ �������� ����ī����
	// ����ī������ ���ĵ� �迭�� �ε����� �ȴ�. �ڿ������� ���ʴ�� �ε������� ����� ����
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		sort = countingSort(arr);

			
		for (int n : sort) {
			bw.write(n+"\n");
		}
		bw.flush();
		bw.close();
	}
	
	private static int[] countingSort(int[] array) {
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, array[i]);
		}
		
		int[] ans = new int[N];
		int[] cnt = new int[max+1];
		
		for (int i : array) {
			cnt[i]++;
		}
		
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i-1];
		}
		
		for (int i = N-1; i >= 0; i--) {
			ans[--cnt[array[i]]] = array[i];
		}
		return ans;
	}
		
}
