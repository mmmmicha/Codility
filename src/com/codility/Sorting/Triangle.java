package com.codility.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Triangle
{
	public int solution(int[] A)
	{
		long sum = 0;

		Integer[] b = new Integer[A.length];

		for (int i = 0; i < A.length; i++)
			b[i] = A[i];

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(b));

		Collections.sort(arr);

		for (int i = 0; i < A.length - 2; i++)
		{
			sum = (long) arr.get(i) + (long) arr.get(i+1);
			if (sum > arr.get(i+2))
			{
				sum = (long) arr.get(i+1) + (long) arr.get(i+2);
				if (sum > arr.get(i))
				{
					sum = (long) arr.get(i+2) + (long) arr.get(i);
					if (sum > arr.get(i+1))
						return 1;
				}
			}
		}

		return 0;

	}
}
