package GroupExcecution;

import org.testng.annotations.Test;

public class Groupexcecution3 {
	
		@Test(groups="smoke3")
		public void demo1()
		{
			System.out.println("Test1-demo1-smoke3");
		}
		
		@Test(groups="sanity3")
		public void demo2()
		{
			System.out.println("Test1-demo2-sanity3");
		}
		
		@Test(groups={"smoke","regression"})
		public void demo3()
		{
			System.out.println("Test3-demo3-smoke and regression");
		}
		
		

	}



