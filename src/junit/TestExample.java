package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestExample {

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("this is my @BeforeAll method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("this is my @AfterAll method");
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		System.out.println("this is my @BeforeEach method");
	}

	@AfterEach
	void tearDown() throws Exception
	{
		System.out.println("this is my @AfterEach");
	}

	@Test
	void test() {
		TestExample1 obj= new TestExample1();
		int result=obj.addNumber(10,20);
		assertEquals(30,result);
		System.out.println("this is my actual result");
		}

}
