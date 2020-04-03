package com.codility.Counting_Elements;

import java.util.HashMap;

public class FrogRiverOne
{
	public static int solution(int X, int[] A)
	{
		
		HashMap<Integer, Integer> stack = new HashMap<Integer, Integer>();
		
		for(int i=0; i<A.length; i++)
		{
			stack.put(A[i], 1);
			
			if(stack.size()==X)
				return i;
			
		}
		return -1;
	}
	
}
