package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mulTest {

	@Test
	void multest() 
	{
		JUnit1 junit=new JUnit1();
		int result= junit.mul(20, 10);
		assertEquals(200,result);
	}

}
