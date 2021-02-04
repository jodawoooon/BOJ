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
		//왼쪽으로 레이저 동시에 발사. 가장 먼저 만나는 탑에서 신호 수신
		//왼쪽 탑의 높이가 오른쪽 탑의 높이보다 높거나 같아야 수신 가능함.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); //N = 탑의 수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		top = new int[N+1]; // 탑의 높이를 저장할 배열 top
		
		for (int i = 1; i <= N; i++) {
			top[i] = Integer.parseInt(st.nextToken()); //입력받아서 top 배열에 높이 저장
			//System.out.println(top[i]);
		}
		
		//첫 번째 탑은 레이저를 수신할 탑이 없으므로 항상 0이다. 따로 처리한다.
		stack.push(new int[] {top[1], 1}); //stack에 첫 번째 top의 높이와 인덱스 정보를 저장한다
		System.out.print(0); //인덱스 0 출력
		
		//System.out.println(stack.peek()[0]+" "+stack.peek()[1]+" "+stack.size());
		
		
		for (int i = 2; i <= N; i++) {
			
			while(true) {
				
				if(stack.size()==0) { 
					//stack에서 모두 pop되면 -> 레이저를 수신하는 탑이 존재하지 않으면
					stack.push(new int[] {top[i], i}); //자신의 값은 push하고
					System.out.print(" "+0); //0을 출력하고 break
					break;
				}
				
				if(stack.peek()[0] >= top[i]) {
					//stack에서 peek한 것은 왼쪽 탑과 같다.
					//왼쪽 탑의 높이가, 자신의 높이보다 같거나 높으면 레이저를 수신하므로
					System.out.print(" "+stack.peek()[1]); // 왼쪽탑의 인덱스를 출력하고
					stack.push(new int[] {top[i], i}); //자신의 값은 push한다.
					break; //break;
					
				}else { //왼쪽탑의 높이가, 자신의 높이보다 작으면
					stack.pop(); //pop하고 그 다음 탑의 값과 비교한다.
				}
			}
			
		}
	
		
	}
}
