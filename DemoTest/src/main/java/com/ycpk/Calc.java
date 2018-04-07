package com.ycpk;

public class Calc implements ICalc {

	public int somme(int a, int b) 
	{
		return a+b;
	}

	public int division(int a, int b) throws Exception 
	{
		if (b == 0)
		{
			throw new Exception("Division par 0 :o");
		}
			
		return a/b;
	}

}
