package boj.im;

import java.util.*;


public class Main_BJ_2999_����̸��� {
	//��ȣ �˰���
	//R<=C, R*C=N�� R,C�� ����. ��������� max��
	//�״� R*C ���
	//ù��°������ C������ �޼����� �ű��, �������� �ι�° ��.. ����°��..
	//��� �Ű�ٸ�. ù��° ���� ù��° ����� ���ʴ�� �����鼭 �ٽ� �����´�...
	
	static int N, R, C;
	static char[][] arr;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		N = str.length();
		//�������� ��ȣ �̸����� �־����� ��, �̸� �ص��ϴ� ���α׷��� �ۼ��Ͻÿ�.-> ���� �ݴ�� �����޳�
		//��ȣȭ�� �ƴ϶� ��ȣȭ�̴�.
		
		for (int r = 1; r <= 100; r++) {
			for (int c = 1; c <= 100; c++) {
				if(r<=c&&r*c==N) {
					if(R<r) {
						R=r;
						C=c;
					}
				}
			}
		}
		
		//R*C ��� �����
		arr = new char[R][C];
		int idx = 0;
		//�ݴ�� �����ϱ�
		//���� ù��° ���� ù��° ����� R��° ����� ����
		
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < R; j++) {
				arr[j][i] = str.charAt(idx++);
			}
		}

		for(char[] c:arr) {
			System.out.println(Arrays.toString(c));
		}

		
		//ù��° ���� ù��° ����� R��°����� ���ʴ�� �б�
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				System.out.print(arr[r][c]);
			}
		}
	}
}
