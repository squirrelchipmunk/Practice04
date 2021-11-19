package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		int count=0;
		int sum =0;
		
		int []data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		for(int num : data) {
			if(num%3==0) {
				count++;
				sum += num;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+count);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+sum);
		
		
	}

}
