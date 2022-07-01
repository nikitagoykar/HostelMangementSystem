package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

class addTest {
	@Before
	public void display()
	{
		System.out.println("this is method @Before");
	}
	@Test
	 public void addtest() 
	{
		System.out.println("this is method @Test");
	}
	@After
	public void display1()
	{
		System.out.println("this is method @After");
	}
}
