package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCat {
	@Test
	void test() {
		ConCat obj1= new ConCat();
		String result=obj1.ConCat("hello","world");
		assertEquals("helloworld",result);
		System.out.println("this is my actual result");
		}

	private String ConCat(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
