package com.codility.Time_Complexity;

public class TapeEquilibrium2
{
	public static int solution(int[] A)
	{

		int front = 0;
		int back = 0;
		for (int i = 0; i < A.length; i++)
		{
			back += A[i];
		}

		int minDiff = Integer.MAX_VALUE;
		for (int i = 1; i < A.length; i++)
		{
			front += A[i - 1];
			back -= A[i - 1];
			minDiff = Math.min(minDiff, Math.abs(front - back));
		}

		return minDiff;

	}

	public static void main(String[] args)
	{
		int[] arr =
		{
				3, 1, 2, 4, 3
		};

		System.out.println("정답 : " + solution(arr));
	}
}
