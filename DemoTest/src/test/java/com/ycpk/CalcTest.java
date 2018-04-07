package com.ycpk;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest
{
	private static ICalc calculator;
	
	public CalcTest() {}
	
	@BeforeClass
	public static void calcTest()
	{
		calculator = new Calc();
	}
	
	@Test
	public void testSomme()
	{
		int result = calculator.somme(5, 2);
		assertEquals(7, result);
	}
	
	
	@Test
	public void testDivision() throws Exception
	{
		try
		{
			int result = calculator.division(10, 2);
			assertEquals(5, result);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(expected = Exception.class) //on prevois d(avoir une exception
	public void testDivisionException() throws Exception
	{
		calculator.division(9, 0);
		
	}
	
	

}
