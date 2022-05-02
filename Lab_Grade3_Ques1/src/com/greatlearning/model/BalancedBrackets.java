package com.greatlearning.model;

import java.util.Stack;

public class BalancedBrackets{
	public boolean balanceCheck(String ex)
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<ex.length(); i++) {
			char el = ex.charAt(i);
		
		if (el == '(' || el == '[' || el == '{')
			stack.push(el);
		
		if (stack.isEmpty())
		{
			return false;
			
		}
		char check;
		
		switch (el) {
		case ')' :
			check = stack.pop();
			if (check != '(')
				return false;
			break;
			
		case '}' :
			check = stack.pop();
			if (check != '{')
				return false;
			break;
			
		case ']' :
			check = stack.pop();
			if (check != '[')
				return false;
			break;
		}
		}
		return stack.isEmpty();
	}
}