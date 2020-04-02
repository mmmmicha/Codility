package com.codility.Prefix_Sums;

import java.util.HashMap;
import java.util.Iterator;

class CarsDTO1
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

public class PassingCars2
{
	public static int solution(int[] A)
	{
		int result = 0;
		
		int myCount = 0;
		boolean myBoolean = true;
		
		int otherCount = 0;
		boolean otherBoolean = true;
		
		HashMap<Integer, CarsDTO1> carsMap = new HashMap<Integer, CarsDTO1>();
		
		CarsDTO1 dto = null;
		
		for(int i=0; i<A.length; i++)
		{
			if(A[i]==0)
			{
				if(myBoolean)
				{
					myBoolean = false;
					otherBoolean = true;
					myCount = 0;
					myCount++;
				}
				else
				{
					myCount++;
				}
			}
			else
			{
				if(otherBoolean && myCount != 0)
				{
					dto = new CarsDTO1();
					
					dto.setMyCount(myCount);
					dto.setOtherCount(otherCount);
					
					carsMap.put(i, dto);
					
					otherBoolean = false;
					myBoolean = true;
					
					otherCount++;
				}
				else
				{
					otherCount++;
				}
			}
		}
		
		Iterator<Integer> resultIter = carsMap.keySet().iterator();
		
		int tempKey = 0;
		
		while(resultIter.hasNext())
		{
			tempKey = resultIter.next();
			System.out.println("tempKey : " + tempKey);
			result += (otherCount - carsMap.get(tempKey).getOtherCount()) * carsMap.get(tempKey).getMyCount();
			System.out.println("myCount : " + carsMap.get(tempKey).getMyCount() + ", otherCount : " + carsMap.get(tempKey).getOtherCount() + ", last otherCount : " + otherCount);
			System.out.println("result : " + result);
		}
		
		if(result > 1000000000)
			return -1;
		
		
		return result;
	}
	
	public static void main(String[] args)
	{
		int[] A = {0, 1, 0, 1, 1};
		
		solution(A);
		
	}
}
