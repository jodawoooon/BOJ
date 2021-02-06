package boj.step017����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1874���ü��� {

/*	1���� n������ ���� ���ÿ� �־��ٰ� �̾� �þ�������ν�, �ϳ��� ������ ���� �� �ִ�. 
	�̶�, ���ÿ� push�ϴ� ������ �ݵ�� ���������� ��Ű���� �Ѵٰ� ����. 
	������ ������ �־����� �� ������ �̿��� �� ������ ���� �� �ִ��� ������, 
	�ִٸ� � ������ push�� pop ������ �����ؾ� �ϴ����� �˾Ƴ� �� �ִ�. 
	�̸� ����ϴ� ���α׷��� �ۼ��϶�.*/
	
	// 4 3 6 8 7 5 2 1
	// �������� push -> pop�� �ϴ��� ����� push�ߴ��� ����ؾ��Ѵ� . -> cnt ����
	
	//���� tmp�� cnt���� ũ��. (�Է¹������� ���� push���� ������)
	// stack�� tmp���� push�ϰ� stack�� top�� pop�Ѵ�.
	//���� tmp�� cnt���� �۴ٸ�, tmp�� �̹� stack�� ����ִ�.
	//stack.peek()�� �Ѵ� => tmp==peek�� �ƴϸ� ������ ����� ���� => NO
	//tmp==peek�̸� pop�Ѵ�.
	static int K;
	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int k = 0; k < K; k++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp>cnt) {
				for (int i = cnt+1; i <= tmp; i++) {
					stack.push(i);
					sb.append("+\n");
				}
				cnt = tmp;
				stack.pop();
				sb.append("-\n");
			}else if(stack.peek()==tmp){
				stack.pop();
				sb.append("-\n");
			}
			else if(stack.peek()!=tmp){
				System.out.println("NO");
				return;

			}
				

		}

		System.out.println(sb);
	}
}
