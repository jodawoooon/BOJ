package boj.step018ť_��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b18258ť2_if�� {
	static int N;
	static StringBuilder sb = new StringBuilder();
	static Queue<Integer> queue = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		int last = 0;
		for (int n = 0; n < N; n++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String order = st.nextToken();
			if(order.equals("push")) {
				last = Integer.parseInt(st.nextToken());
				queue.offer(last);
				continue;
			}else if(!queue.isEmpty()&&order.equals("pop")) {
				sb.append(queue.poll()+"\n");
				continue;
				
			}else if(order.equals("size")) {
				sb.append(queue.size()+"\n");
				continue;
				
			}else if(order.equals("empty")) {
				if(queue.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				continue;
				
			}else if(order.equals("front")&&!queue.isEmpty()) {
				sb.append(queue.peek()+"\n");
				continue;
				
			}else if(order.equals("back")&&!queue.isEmpty()) {
				sb.append(last+"\n");
				continue;
				
			}else if(queue.isEmpty()) {
				sb.append("-1\n");
			}
			
			//queue��  arrayȭ �ؼ� �����͸� �����ϱ� �ð��ʰ��� ����. push�ϸ鼭 Int�� �����Ϳ� ���� �־� ����ϴٰ�
			//back ��ɾ ������ �� ���� ������ push���� append ���ָ� ��
			//Stringbuilder�Ƚᵵ �ð��ʰ���
			
			//switch�� �Ⱦ��� if�����°� �� ������
		}
		System.out.println(sb);
	}
}
