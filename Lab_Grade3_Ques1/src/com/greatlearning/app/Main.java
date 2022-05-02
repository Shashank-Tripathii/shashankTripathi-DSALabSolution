package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.*;

public class Main{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BalancedBrackets b = new BalancedBrackets();
		System.out.println("Enter the String of brackets : ");
		String str = sc.nextLine();
		
		if(b.balanceCheck(str))
			System.out.println("The entered String has balanced brackets ");
		
		else 
			System.out.println("The entered Strings do not contain Balanced Brackets. ");
		sc.close();
	}
}