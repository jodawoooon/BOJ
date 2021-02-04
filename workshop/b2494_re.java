package boj.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b2494_re {
	static int N;
	static int[] top;
	static Stack<int[]> stack = new Stack<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		//�������� ������ ���ÿ� �߻�. ���� ���� ������ ž���� ��ȣ ����
		//���� ž�� ���̰� ������ ž�� ���̺��� ���ų� ���ƾ� ���� ������.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		top = new int[N+1];
		for (int i = 1; i <= N; i++) {
			top[i] = Integer.parseInt(st.nextToken());
			//System.out.println(top[i]);
		}
		stack.push(new int[] {top[1], 1});
		System.out.print(0);
		//System.out.println(stack.peek()[0]+" "+stack.peek()[1]+" "+stack.size());
		
		for (int i = 2; i <= N; i++) {
			while(true) {
				if(stack.size()==0) {
					stack.push(new int[] {top[i], i});
					System.out.print(" "+0);
					break;
				}
				if(stack.peek()[0] >= top[i]) {
					//System.out.println(stack.toString());
					System.out.print(" "+stack.peek()[1]);
					stack.push(new int[] {top[i], i});
					break;
				}else {
					stack.pop();
				}
			}
			
		}
	
		
	}
}
