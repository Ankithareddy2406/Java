package com.looping;

public class Uglynumber {
	public boolean isUgly(int num) {
		if(num<=0) {
			return false;
			}
		while(num%2==0) {
			num=num/2;
		}
		while(num%3==0) {
			num=num/3;
		}
		while(num%5==0) {
			num=num/5;
		}
		return num==1;
	}

	public static void main(String[] args) {
		Uglynumber obj=new Uglynumber();
		int num=30;
		if(obj.isUgly(num)) {
			System.out.println("is ugly number");
		}else {
			System.out.println("is not an ugly number");
		}
		

	}

}
