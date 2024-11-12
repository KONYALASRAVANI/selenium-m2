package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(invocationCount = -2)//this will be considered
	public void demo1() {
		Reporter.log("demo1", true);
	}

	@Test
	public void demo2() {
		Reporter.log("demo2", true);//this will be considered
	}

	@Test(enabled=false)
	public void demo3() {
		Reporter.log("demo2", true);//but only two will be excecuted
	}


}
