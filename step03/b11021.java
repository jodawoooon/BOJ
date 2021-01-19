package com.boj.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		
		// ���� 11021 �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
