package algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1074Z {
	static int N, r, c, ans;
	static int[] dy = {0,0,1,1};
	static int[] dx = {0,1,0,1};
	//(0,0) (0,1) (1,0) (1,1) 순서대로 이동한다.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        
        int y = 0;
        int x = 0; //현재 위치. 
       //r,c를 비교하며 영역을 찾는다.
        
        // 2 3 1 이면 4*4 배열 방문
        // 0행부터 3행 ~ 0열부터 3열
        N = (int)Math.pow(2, N);
        while(true) {
        	if(N==1) break;
        	
        	N = N/2;
        	//0번영역이면 패스
        	if(r<N  && c>=N ) { //1번 영역
        		ans += N*N;
        		c -= N ;
        	}else if(r>=N  && c<N ) {//2번 영역
        		ans += N*N*2;
        		r -= N ;
        	}else if(r>=N  && c>=N ) {//3번 영역
        		ans += N*N*3;
        		r -= N ;
        		c -= N ;

        	}
        	
        	
        }
        System.out.println(ans);
        
    }

}
