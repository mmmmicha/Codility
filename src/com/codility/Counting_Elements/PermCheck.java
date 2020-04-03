package com.codility.Counting_Elements;

import java.util.ArrayList;
import java.util.Collections;

// 5회때 성공
// 발문을 정확하게 읽는 습관을 지녀야함.
// 수열 : 1~N 까지의 수가 등장해야함
// 맨처음이 1 이 아니면 수열이 아님.
public class PermCheck
{
	public static int solution(int[] A)
	{
		
		ArrayList<Integer> setss = new ArrayList<Integer>();
		
		for(int b : A)
			setss.add((Integer)b);
		
		Collections.sort(setss);
		
		int count = 0;
		
		if(setss.get(0)!=1)
			return 0;
		
		if(A.length>=2)
		{
			for(int i=1; i<A.length; i++)
			{
				count = setss.get(i) - setss.get(i-1);
				
				System.out.println(count);
				
				if(count!=1)
					return 0;
			}
			
			return 1;
		}
		else
		{
			return 1;
		}
			
		
	}
	
	public static void main(String[] args)
	{
		int[] A = {3,4,1,5,7,2};
		
		solution(A);
	}
}
