package review;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ����Լ��������� {
	static int N;
	static String str = "";
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		sb.append(str+"��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		recursive(N);
		System.out.println(sb);
	}
	private static void recursive(int n) {
		String space = str;
		if(n==0) {
			sb.append(space+"\"����Լ��� ������?\"\n");
			sb.append(space+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			sb.append(space+"��� �亯�Ͽ���.\n");
			return;
		}
		
		sb.append(space+"\"����Լ��� ������?\"\n");
		sb.append(space+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
		sb.append(space+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
		sb.append(space+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
		str += "____";
		
		recursive(n-1);
		
		sb.append(space+"��� �亯�Ͽ���.\n");
		
		
	}
}
