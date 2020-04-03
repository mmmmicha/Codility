package com.codility.Time_Complexity;

public class TapeEquilibrium
{
	public static int solution(int[] A)
	{
		
		int sub1 = 0;
		int sub2 = 0;
		int sub3 = 0;
		
		int result = A.length/2 + 1;
		
		while(true)
		{
			
			sub1 = Math.abs(sum(A, 0, result) - sum(A, result, A.length));
			sub2 = Math.abs(sum(A, 0, result - 1) - sum(A, result - 1, A.length));
			sub3 = Math.abs(sum(A, 0, result + 1) - sum(A, result + 1, A.length));
			
			System.out.println(sub1);
			
			if(sub1 <= sub2 && sub1 <= sub3)
			{
				return sub1;
			}
			
			if(sub1 <= sub2)
			{
				result++;
			}
			else
			{
				result--;
			}
				
		}
		
	}
	
	public static int sum(int[] A, int start, int end)
	{
		int sum = 0;
		
		for(int a=start; a<end; a++)
		{
			sum += A[a];
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {3, 1, 2, 4, 3};
		
		System.out.println("정답 : " + solution(arr));
	}
}
