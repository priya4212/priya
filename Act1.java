package FlowControl;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("the given number is positive");
			
		}
		else if(n<0)
		{
			System.out.println("the given number is negative");
		}
		else
		{
			System.out.println("the given number is Zero");
		}
		
	}
