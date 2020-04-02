package com.codility.Prefix_Sums;

public class CountDiv
{
	public static int solution(int A, int B, int K)
	{
		int count = 0;
		
		int midStart = 0;
		
		for(int i=A; i<=B; i++)
		{
			if(i%K==0)
			{
				count++;
				midStart = i+K;
				break;
			}
		}
		
		if(count>=1)
		{
			count += (B-midStart)/K;
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(solution(3,200394,2));
	}
}
