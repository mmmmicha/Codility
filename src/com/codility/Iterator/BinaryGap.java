package com.codility.Iterator;

public class BinaryGap
{
	public static int solution(int N)
	{
		int maxCount = 0;
		int count = 0;
		int oneCount = 0;
		
		while(N != 1)
		{
			if(N%2==0 && oneCount>0)
				count++;
			else if(N%2!=0)
			{
				oneCount++;
				maxCount=Math.max(maxCount, count);
				count = 0;
			}
			
			N=N/2;
			
			//System.out.println("oneCount : " + oneCount + ", N : " + N + ", maxCount : " + maxCount);
		}
		
		maxCount = Math.max(maxCount, count);
		
		//System.out.println("oneCount : " + oneCount + ", N : " + N + ", maxCount : " + maxCount);
		
		return maxCount;
		
	}
	
	public static void main(String[] args)
	{
		solution(1041);
		
	}
}
