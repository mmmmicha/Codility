package com.codility.Sorting;

import java.util.HashMap;

public class Distinct
{
	public int solution(int[] A)
	{
		HashMap<Integer, Integer> dis = new HashMap<Integer, Integer>();
		
		for(Integer a : A)
		{
			if(!dis.containsKey(a))
			{
				dis.put(a, 1);
			}
		}
			
		return dis.size();
	}
}
