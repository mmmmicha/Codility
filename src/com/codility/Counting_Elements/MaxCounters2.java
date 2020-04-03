package com.codility.Counting_Elements;

import java.util.HashMap;
import java.util.Iterator;

public class MaxCounters2
{
	public static int[] solution(int N, int[] A)
	{
		int[] result = new int[N];
		
		int max = 0;
		
		HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		
		Iterator<Integer> reiter = null;
		
		int tempKey = 0;
		
		for(int i=1; i<=N; i++)
		{
			resultMap.put(i, 0);
		}
		
		for(Integer a : A)
		{
			
			if(a>N)
			{
				reiter = resultMap.keySet().iterator();
				
				while(reiter.hasNext())
				{
					tempKey = reiter.next();
					
					resultMap.put(tempKey, max);
				}
			}
			else
			{
				resultMap.put(a, resultMap.get(a)+1);
				
				if(resultMap.get(a) > max)
					max = resultMap.get(a);
				
				System.out.println("a : " + a + ", value : " + resultMap.get(a));
			}
			
			
		}
		
		reiter = resultMap.keySet().iterator();
		
		while(reiter.hasNext())
		{
			tempKey = reiter.next();
			
			result[tempKey-1] = resultMap.get(tempKey);
			
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		
		solution(5, A);
		
	}
}
