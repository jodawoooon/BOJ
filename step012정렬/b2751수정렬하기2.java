package boj.step012����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class b2751�������ϱ�2 {
	static int N,ans;
	static ArrayList<Integer> sort;
	//��������
	//������ �κа� �������� ���� �κ��� ���� ��, ������ ����� �������� ���� �κп��� ���ʴ�� ���� ���ϸ鼭 ���Ե� �ε����� ã�´�.

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		sort = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			sort.add(Integer.parseInt(br.readLine()));
			
		}
		
		Collections.sort(sort);
		
		for (int i = 0; i < N; i++) {
			bw.write(sort.get(i)+"\n");
			
		}
		bw.flush();
		bw.close();
	}
}
