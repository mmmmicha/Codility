package com.codility.Stackes_and_Queues;

import java.util.Stack;

public class Nesting
{
	public int solution(String S)
	{
		Stack<Character> s = new Stack<Character>();
		
		char c = 0;
		
		for(int i=0; i<S.length(); i++)
		{
			c = S.charAt(i);
			
			if(c=='(')
			{
				s.push(c);
			}
			else
			{
				if(s.isEmpty())
					return 0;
				
				if(c==')' && s.pop()!='(')
					return 0;
			}
			
		}
		
		if(!s.isEmpty())
			return 0;
		
		return 1;
	}
}
