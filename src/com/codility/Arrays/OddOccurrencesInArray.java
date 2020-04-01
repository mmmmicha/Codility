package com.codility.Arrays;

import java.util.HashMap;
import java.util.Iterator;

public class OddOccurrencesInArray
{
    public static int solution(int[] A) 
    {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for(Integer a : A)
        {
        	if(!count.containsKey(a))
        	{
        		count.put(a, 1);
        	}
        	else
        	{
        		count.put(a, count.get(a) + 1);
        	}
        		
        }
        
        Iterator<Integer> keyit = count.keySet().iterator();
        
        int com = 0;
        
        while(keyit.hasNext())
        {
        	com = keyit.next();
        	
        	if(count.get(com)%2!=0)
        		return com;
        }
        
        return 0;
    }
    
    public static void main(String[] args)
    {
    	int[] arr = {3, 4, 5, 3, 4};
    	
    	System.out.println("정답 : " + solution(arr)); 
    }
    
}
