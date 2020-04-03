package com.codility.Stackes_and_Queues;

import java.util.Stack;

class FishSelf
{
	public int size = 0;
	public int direction = 0;
	public int getSize()
	{
		return size;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	public int getDirection()
	{
		return direction;
	}
	public void setDirection(int direction)
	{
		this.direction = direction;
	}
	
}

public class Fish
{
	public static int solution(int[] A, int[] B)
	{
		Stack<FishSelf> s = new Stack<FishSelf>();
		
		FishSelf f = new FishSelf();
		
		f.setSize(A[0]);
		f.setDirection(B[0]);
		s.push(f);
		
		int preDirection = B[0];
		int preSize = A[0];
		
		System.out.println("preDirection : " + preDirection + ", preSize : " + preSize);
		
		for(int i=1; i<A.length; i++)
		{
			if(preDirection == B[i])
			{
				f = new FishSelf();
				
				preDirection = B[i];
				preSize = A[i];
				
				f.setDirection(preDirection);
				f.setSize(preSize);
				
				s.push(f);
			}
			else if(preDirection == 0)
			{
				f = new FishSelf();
				
				preDirection = B[i];
				preSize = A[i];
				
				f.setDirection(preDirection);
				f.setSize(preSize);
				
				s.push(f);
			}
			else
			{
				System.out.println("요놈");
				if(preSize<A[i])
				{
					s.pop();
					
					if(s.size()!=0)
					{
						preSize = s.lastElement().getSize();
						preDirection = s.lastElement().getDirection();
						i--;
						continue;
					}
					
					f = new FishSelf();
					
					preDirection = B[i];
					preSize = A[i];
					
					f.setDirection(preDirection);
					f.setSize(preSize);
					
					s.push(f);
				}
				
			}
			
			//System.out.println("preDirection : " + preDirection + ", preSize : " + preSize);
		}
		
		return s.size();
	}
	
	public static void main(String[] args)
	{
		int[] A = {4,3,2,1,5};
		int[] B = {0,1,0,0,0};
		
		solution(A,B);
		
	}
}
