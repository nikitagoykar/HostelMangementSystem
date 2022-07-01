package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divTest {

	@Test
	void divtest() {
		JUnit1 junit=new JUnit1();
		int result= junit.div(20, 10);
		assertEquals(2,result);
	}

}
