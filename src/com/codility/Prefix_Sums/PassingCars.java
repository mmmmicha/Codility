package com.codility.Prefix_Sums;

import java.util.HashMap;
import java.util.Iterator;

class CarsDTO
{
	public int myCount;
	public int otherCount;
	
	
	public int getMyCount()
	{
		return myCount;
	}
	public void setMyCount(int myCount)
	{
		this.myCount = myCount;
	}
	public int getOtherCount()
	{
		return otherCount;
	}
	public void setOtherCount(int otherCount)
	{
		this.otherCount = otherCount;
	}
	
	
}

public class PassingCars
{
	public static int solution(int[] A)
	{
		HashMap<Integer, CarsDTO> resultMap = new HashMap<Integer, CarsDTO>();
		
		int result = 0;
		int stackCount = 0;
		int myCount = 0;
		int otherCount = 0;
		
		CarsDTO dto = null;
		
		for(int i=0; i<A.length; i++)
		{
			
			if(A[i]!=0)
			{
				dto = new CarsDTO();
				
				dto.setMyCount(myCount);
				dto.setOtherCount(otherCount++);
				
				if(stackCount==0)
					resultMap.put(i, dto);
				
				stackCount++;
				continue;
			}
			
			if(stackCount!=0)
			{
				myCount = 0;
				stackCount=0;
			}
			
			myCount++;
		}
		
		Iterator<Integer> resultIter = resultMap.keySet().iterator();
		
		int tempKey = 0;
		
		while(resultIter.hasNext())
		{
			tempKey = resultIter.next();
			System.out.println("tempKey : " + tempKey);
			result += (otherCount - resultMap.get(tempKey).getOtherCount()) * tempKey;
			System.out.println("result : " + result);
		}
		
		if(result >= 1000000000)
			return -1;
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] A = {0,1,0,1,1};
		
		solution(A);
		
	}
}
