package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sum=0;
		double inputNum;
		for(int i=0; i<5;i++) {
			inputNum = sc.nextDouble();
			sum+=inputNum;
		}
		
		System.out.println("평균은 "+sum/5.0+" 입니다.");
		
		sc.close();

	}

}
