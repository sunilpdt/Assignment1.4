package com.typecast;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args){
		
		byte num1;
		short num2;
		int num3;
		long num4;
		float num5;
		double num6;
		
		System.out.println("Please enter a byte number");
		
		Scanner scanByte=new Scanner(System.in);
		num1=scanByte.nextByte();
		
		System.out.println("Please enter a short number");
		
		Scanner scanShort=new Scanner(System.in);
		num2=scanShort.nextShort();
		
		num3=num1+num2;
			
		System.out.println("Sum of "+num1+" and "+num2+" is "+num3);
		
		num4=num2+num3;
		
		System.out.println("Sum of "+num2+" and "+num3+" is "+num4);
		
		num5=num3+num4;
		
		System.out.println("Sum of "+num3+" and "+num4+" is "+num5);
		
		num6=num4+num5;
		
		System.out.println("Sum of "+num4+" and "+num5+" is "+num6);
		
		
		
	}
	
}
