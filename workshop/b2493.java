package boj.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b2493 {
	static int N;
	static int[] top;
	static Stack<int[]> stack = new Stack<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		//�������� ������ ���ÿ� �߻�. ���� ���� ������ ž���� ��ȣ ����
		//���� ž�� ���̰� ������ ž�� ���̺��� ���ų� ���ƾ� ���� ������.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); //N = ž�� ��
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		top = new int[N+1]; // ž�� ���̸� ������ �迭 top
		
		for (int i = 1; i <= N; i++) {
			top[i] = Integer.parseInt(st.nextToken()); //�Է¹޾Ƽ� top �迭�� ���� ����
			//System.out.println(top[i]);
		}
		
		//ù ��° ž�� �������� ������ ž�� �����Ƿ� �׻� 0�̴�. ���� ó���Ѵ�.
		stack.push(new int[] {top[1], 1}); //stack�� ù ��° top�� ���̿� �ε��� ������ �����Ѵ�
		System.out.print(0); //�ε��� 0 ���
		
		//System.out.println(stack.peek()[0]+" "+stack.peek()[1]+" "+stack.size());
		
		
		for (int i = 2; i <= N; i++) {
			
			while(true) {
				
				if(stack.size()==0) { 
					//stack���� ��� pop�Ǹ� -> �������� �����ϴ� ž�� �������� ������
					stack.push(new int[] {top[i], i}); //�ڽ��� ���� push�ϰ�
					System.out.print(" "+0); //0�� ����ϰ� break
					break;
				}
				
				if(stack.peek()[0] >= top[i]) {
					//stack���� peek�� ���� ���� ž�� ����.
					//���� ž�� ���̰�, �ڽ��� ���̺��� ���ų� ������ �������� �����ϹǷ�
					System.out.print(" "+stack.peek()[1]); // ����ž�� �ε����� ����ϰ�
					stack.push(new int[] {top[i], i}); //�ڽ��� ���� push�Ѵ�.
					break; //break;
					
				}else { //����ž�� ���̰�, �ڽ��� ���̺��� ������
					stack.pop(); //pop�ϰ� �� ���� ž�� ���� ���Ѵ�.
				}
			}
			
		}
	
		
	}
}
