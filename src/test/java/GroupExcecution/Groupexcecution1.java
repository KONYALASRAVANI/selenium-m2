package GroupExcecution;

import org.testng.annotations.Test;

public class Groupexcecution1 {
	
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("Test1-demo1-smoke");
	}
	
	@Test(groups="sanity")
	public void demo2()
	{
		System.out.println("Test1-demo2-sanity");
	}
	
	@Test(groups={"smoke","regression"})
	public void demo3()
	{
		System.out.println("Test3-demo3-smoke and regression");
	}
	
	

}
