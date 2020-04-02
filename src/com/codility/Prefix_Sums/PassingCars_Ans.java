package com.codility.Prefix_Sums;

public class PassingCars_Ans
{
	public int solution(int[] A)
	{
		int result = 0;
		int sum = 0;
		
		for(int a : A)
		{
			if(a==0)
				sum++;
			else
				result += sum;
		}
		
		if(result > 1000000000 || result<0)
			return -1;
		
		return result;
	}
}
