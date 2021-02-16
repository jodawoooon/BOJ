package algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b2839설탕배달 {
//	사탕가게에 설탕 N킬로 배달
//	3킬로와 5킬로가 있다
//	최대한 적은 봉지 가져가고싶다
//	봉지 몇개?
	static int N, sum;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());    
       
        //최소값을 가지려면 ? 5를 더 많이 사용
        while(true) {
        	if(N%5==0) {
        		sum += N/5;
        		break;
        	}
        	
        	N -= 3; //5로 나누어 떨어 질 때 까지 3을 뺀다.
        	sum++; //갯수 카운트
        	if(N<0) {
        		sum = -1;
        		break; //5로 나누어떨어지지 않으면 break;
        	}
        }

        System.out.println(sum);
        
        
    }
			
}
