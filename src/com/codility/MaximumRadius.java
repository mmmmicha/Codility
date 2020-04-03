package com.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MaximumRadius
{
	public static int solution(int[] A)
	{
		HashMap<Integer, Integer> has = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++)
		{

			has.put(i, A[i]);
		}

		Iterator<Integer> in = sortByValue(has).iterator();
		
		int tempKey = 0;
		
		int maxValue = A.length-1;
		
		int count = A.length-1;
		
		int result = 0;
		
		while (in.hasNext())
		{
			tempKey = in.next();
			//System.out.println("key : " + tempKey + ", value : " + has.get(tempKey));
			
			if(tempKey + has.get(tempKey) >= maxValue)
			{
				result += count;	// 본인 빼기
				count--;
			}
			else
			{
				count = tempKey + has.get(tempKey);
				result += count;
			}
				
			
			
		}

		return 0;
	}

	public static List sortByValue(Map map)
	{
		List<Integer> list = new ArrayList<Integer>();

		list.addAll(map.keySet());

		Collections.sort(list, new Comparator()
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				return ((Integer) map.get(o2)).compareTo((Integer) map.get(o1));
			}
		});

		return list;
	}

	public static void main(String[] args)
	{
		int[] A =
		{
				1, 5, 2, 1, 4, 0
		};

		solution(A);
	}
}
