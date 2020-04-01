package com.codility.Arrays;

class CyclicRotation
{
	public static int[] solution(int[] A, int K)
	{
		// write your code in Java SE 8
		int[] temp = new int[A.length];

		for (int i = 1; i <= K; i++)
		{
			for (int j = 0; j < temp.length; j++)
			{
				if (j == temp.length - 1)
					temp[0] = A[j];
				else
					temp[j + 1] = A[j];

				// System.out.println("(" + i + ") 회전 (" + j +") 번째 : A=" + A[j] + ", temp=" +
				// temp[j]);
			}

			A = temp;

			temp = new int[A.length];
		}

		return A;
	}
	/*
	 * public static void main(String[] args) { int[] arr = {3,4,5,6,7};
	 * 
	 * System.out.println("결과 : " + solution(arr, 3)); }
	 */
}
