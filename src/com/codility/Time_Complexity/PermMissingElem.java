package com.codility.Time_Complexity;

import java.util.HashMap;

public class PermMissingElem
{
	public static int solution(int[] A)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(Integer a : A)
		{
			map.put(a, 1);
		}
		
		
		for(int i=1; i<=A.length+1; i++)
		{
			if(!map.containsKey(i))
				return i;
		}
		return 0;
	}
}
