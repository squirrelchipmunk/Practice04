package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int []randNum = new int[6];
		int num;
		boolean duplicate;
		
		randNum[0] = (int)(Math.random()*45)+1;		// 처음 1개 넣기
		for(int i=1;i<randNum.length;i++) {			// 2번째부터 넣기
			while(true) {
				duplicate=false;
				num = (int)(Math.random()*45)+1;		
				for(int j=0; j<i;j++) {				// (i-1)번째까지
					if(num==randNum[j]) {			// 중복이 있으면
						duplicate=true;					
						break;
					}
				}
				if(!duplicate) {						
					randNum[i] = num;					
					break;							// 다음 i번째 숫자
				}
			}
		}
		
		for(int i=0;i<randNum.length;i++) {
			System.out.print(randNum[i]+" ");
		}
		
	}

}
