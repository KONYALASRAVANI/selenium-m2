package Assertions;

import org.testng.annotations.Test;

public class WhyNotIFElse {
	@Test
	public void demo() {
		String s1="Hi";
		String s2="hi";
		if(s1.equals(s2) )
			System.out.println("pass");
		else
			System.out.println("Fail");
		
	}

}
