package com.codility.Prefix_Sums;


public class MinAvgTwoSlice
{
	public int solution(int[] A)
	{
		int minStart = A.length;
		double minResult = (A[0]+A[1])/(double)2;
		
		boolean min = true;
		
		for(int i=0; i<A.length-1; i++)
		{
			min = false;
			
			if(minResult>=(A[i]+A[i+1])/(double)2)
			{
				minResult = (A[i]+A[i+1])/(double)2;
				min = true;
			}
			
			if(min)
				minStart = i;
				
		}
		
		if(A.length>2)
		{
			for(int i=1; i<A.length-2; i++)
			{
				min = false;
				
				if(minResult>=(A[i]+A[i+1]+A[i+2])/(double)3)
				{
					minResult = (A[i]+A[i+1]+A[i+2])/(double)3;
					min = true;
				}
				
				if(min)
					minStart = i;
					
			}
		}
		
		
		return minStart;
	}
}
