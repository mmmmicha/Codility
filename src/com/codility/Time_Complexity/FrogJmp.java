package com.codility.Time_Complexity;

public class FrogJmp
{
	public static int solution(int X, int Y, int D)
	{
		int result = 0;
		
		result = ((Y-X)/D);
		
		if(X==Y)
			return 0;
		else if(result == 0)
			return 1;
		else if((Y-X)%D==0)
			return result;
		else
			return result + 1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("결과 : " + solution(10, 100, 30)); 
	}
}
