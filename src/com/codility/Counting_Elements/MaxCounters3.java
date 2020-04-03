package com.codility.Counting_Elements;

// 배열은 기본 0 초기화
// 너무 어려웠음.. 확실히 논리 이해할 것.
public class MaxCounters3
{
	public static int[] solution(int N, int[] A)
	{
		int[] result = new int[N];
		
		int max = 0;
		
		int temp = 0;
		
		for(int j=0; j<A.length; j++)
		{
			if(A[j]>N)
			{
				max = temp;
				continue;
			}
			
			if(result[A[j]-1]<max)
				result[A[j]-1] = max;
				
			result[A[j]-1]++;
			
			temp = Math.max(temp, result[A[j]-1]);
		}
		
		for(int i=0; i<result.length; i++)
		{
			if(result[i]<max)
				result[i] = max;
			
			System.out.println(result[i]);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		
		solution(5, A);
		
	}
}
