package Testing;

import org.testng.annotations.Test;

public class Dependonmethods2 {
	@Test
	public void CreateCustomerTest()
	{
		System.out.println("customer created");
	}
	@Test(dependsOnMethods="CreateCustomerTest")
	public void ModifyCustomerTest()
	{
		System.out.println("customer modified");

	}
	@Test(dependsOnMethods={("CreateCustomerTest"),("ModifyCustomerTest")})
	public void DeleteCustomerTest()
	{
		System.out.println("customer deleted");

	}
	

}
