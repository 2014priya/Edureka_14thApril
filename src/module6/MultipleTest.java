package module6;

import org.testng.annotations.Test;

public class MultipleTest {
	
	@Test (priority =2)
	public void Walter() {
		System.out.println("OpenURL");
	}

	@Test (priority = 1,dependsOnMethods="Walter")
	public void Rajesh() {
		System.out.println("Perform Login");
	}
	
	@Test (priority =5,dependsOnMethods="Rajesh")
	public void Vignesh( ) {
		System.out.println("Perform Logout");
	}
	
	@Test (priority =0)
	public void Priya() {
		System.out.println("OpenanotherURL");
	}
	
}
