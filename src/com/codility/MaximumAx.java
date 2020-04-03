package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAx
{
	public int solution(int[] A)
	{
		
		Integer[] b = new Integer[A.length];
		
		for(int i=0; i<A.length; i++)
			b[i] = A[i];
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(b));
		
		Collections.sort(arr);
		
		if(arr.get(0)<=0)
		{
			if(arr.get(1)<=0)
			{
				if(arr.get(arr.size()-1)>=0)
				{
					return Math.max(arr.get(0)*arr.get(1)*arr.get(arr.size()-1),arr.get(arr.size()-1)*arr.get(arr.size()-2)*arr.get(arr.size()-3));
				}
				else
				{
					return arr.get(arr.size()-1)*arr.get(arr.size()-2)*arr.get(arr.size()-3);
				}
				
			}
			else
			{
				return arr.get(arr.size()-1)*arr.get(arr.size()-2)*arr.get(arr.size()-3);
			}
		}
		return arr.get(arr.size()-1)*arr.get(arr.size()-2)*arr.get(arr.size()-3);
	}
}
