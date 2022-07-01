package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subTest {

	@Test
	void testSub() {
		{
			JUnit1 junit=new JUnit1();
			int result= junit.sub(20, 10);
			assertEquals(10,result);
		}

	}

}
