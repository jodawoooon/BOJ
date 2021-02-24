package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_10250_ACMȣ�� {
	//�մ� �����. W�� ���� ������ (�������� H�� ������)
	static int T,W,H,N,ans;
	static boolean[][] hotel;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			hotel = new boolean[W][H];
			N = Integer.parseInt(st.nextToken());
			

			StringBuilder sb = new StringBuilder();
			loop:
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(N==1) {
						sb.append(j+1);
						if(i+1>9) {
							sb.append(i+1);
						}else {
							sb.append("0").append(i+1);
						}

						System.out.println(sb);
						break loop;
					}
					
					N--;
				}
			}

			
		}
		
		
		
	}
}
