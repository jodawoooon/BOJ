package boj.step017스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class b1874스택수열 {

/*	1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
	이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
	임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 
	있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 
	이를 계산하는 프로그램을 작성하라.*/
	
	// 4 3 6 8 7 5 2 1
	// 
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
			}else if(stack.peek()!=tmp){
				System.out.println("NO");
				return;

			}
				stack.pop();
				sb.append("-\n");

		}

		System.out.println(sb);
	}
}
