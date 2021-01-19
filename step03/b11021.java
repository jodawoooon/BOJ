package com.boj.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		
		// 백준 11021 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());


		
		for(int i=0;i<n;i++) {
			String str = bf.readLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
			

		}
		bw.flush();
        bw.close();
        bf.close();
		
	}

}
