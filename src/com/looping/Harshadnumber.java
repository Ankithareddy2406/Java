package com.looping;

public class Harshadnumber {
	public boolean isharshad(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		return temp%sum==0;
	}

	public static void main(String[] args) {
		Harshadnumber obj=new Harshadnumber();
		int num=18;
		if(obj.isharshad(num)) {
		System.out.println("it is a harshad number");
		} else {
			System.out.println("it is not an harshad number");
		}

}
}
