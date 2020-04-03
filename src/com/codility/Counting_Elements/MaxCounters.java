package com.codility.Counting_Elements;

// 배열은 기본 0 초기화
public class MaxCounters
{
	public static int[] solution(int N, int[] A)
	{
		int[] result = new int[N];
		
		int max = 0;
		
		for(int j=0; j<A.length; j++)
		{
			if(A[j]>N)
			{
				for(int i=0; i<result.length; i++)
					result[i] = max;
			}
			else
			{
				result[A[j]-1]++;
				
				max = Math.max(max, result[A[j]-1]);
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		
		solution(5, A);
		
	}
}
