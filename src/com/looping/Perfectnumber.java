package com.looping;

public class Perfectnumber {
	public boolean isperfect(int num) {
		int temp=num;
		int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			sum=sum+i;
		}
	}
	return sum==num;
	}

	public static void main(String[] args) {
     Perfectnumber obj=new Perfectnumber();
     int num=28;
     if(obj.isperfect(num)) { 
    	 System.out.println("it is a perfect number");
     }else {
    	 System.out.println("it is not a perfect number");
     }
     
	}

}
