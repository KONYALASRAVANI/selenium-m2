package GroupExcecution;

import org.testng.annotations.Test;

public class Groupexcecution2 {
	
	
		
		@Test(groups="smoke1")
		public void demo1()
		{
			System.out.println("Test1-demo1-smoke1");
		}
		
		@Test(groups="sanity1")
		public void demo2()
		{
			System.out.println("Test1-demo2-sanity1");
		}
		
		@Test(groups={"smoke","regression"})
		public void demo3()
		{
			System.out.println("Test3-demo3-smoke and regression");
		}
		
		

	}



