package com.demo03;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program03 {

	public static void main(String[] args) {
		int n;
		int d;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the numerator-");
			n=sc.nextInt();
			System.out.println("Enter the Denominator-");
            d=sc.nextInt();	
            int result=n/d;
            System.out.println("Result-"+result);
		}
		catch(InputMismatchException e) {
			System.out.println("Numbers are Required...");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Cannot be divided by 0");
		}
		
		System.out.println("Program Finised....");
	}

}
