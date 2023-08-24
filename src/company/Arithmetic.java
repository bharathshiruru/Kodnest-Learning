package company;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println(subtractNumbers( num1, num2));
		System.out.println(multiplNumbers( num1, num2));
		System.out.println(divideNumber(num1, num2));
		System.out.println(findRemainder( num1, num2));
		
	}
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplNumbers(int num1,int num2)
	{
		return num1*num2;
	}
	public static double divideNumber(int num1,int num2)
	{
		return  num1/num2;
	}
	public static int findRemainder(int num1,int num2)
	{
		return num1%num2;
	}

}
