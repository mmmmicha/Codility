package com.codility.Counting_Elements;

import java.util.ArrayList;
import java.util.Collections;

public class MissingInteger
{
	public static int solution(int[] A)
	{
		ArrayList<Integer> setss = new ArrayList<Integer>();
		
		for(Integer a : A)
		{
			if(a>0)
				setss.add(a);
				
		}
		
		if(setss.size()==0)
			return 1;
		else if(setss.size()==1)
		{
			if(setss.get(0)>1)
				return 1;
			else
				return 2;
		}
			
		
		Collections.sort(setss);
		
		if(setss.get(0)>1)
			return 1;
		
		int count = 0;
		
		for(int i=1; i<setss.size(); i++)
		{
			count = setss.get(i) - setss.get(i-1);
			
			if(count>1)
				return setss.get(i-1)+1;
		}
		
		return setss.get(setss.size()-1)+1;
	}
	
	public static void main(String[] args)
	{
		int[] A = {2,4,5,1,2,3,4,55,6,3,2,1,2,3,4,44,5,7,4,5};
		
		System.out.println("정답 : " + solution(A));
		
	}
}
