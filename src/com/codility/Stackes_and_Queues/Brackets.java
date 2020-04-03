package com.codility.Stackes_and_Queues;

import java.util.Stack;

public class Brackets
{
	public int solution(String S)
	{
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++)
		{
			char c = S.charAt(i);

			if (c == '(' || c == '{' || c == '[')
			{
				stack.push(c);
			}
			else
			{
				if (stack.isEmpty())
				{
					return 0;
				}

				char lastC = stack.pop();

				if (c == ')' && lastC != '(')
				{
					return 0;
				}

				if (c == '}' && lastC != '{')
				{
					return 0;
				}

				if (c == ']' && lastC != '[')
				{
					return 0;
				}
			}
		}

		if (!stack.isEmpty())
		{
			return 0;
		}

		return 1;

	}
}
