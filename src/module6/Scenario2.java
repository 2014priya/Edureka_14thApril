package module6;

import org.testng.annotations.Test;

public class Scenario2 {

	@Test (groups = "Homepage")
	public void TC1 (){
		System.out.println("Homepage1");
		
	
	}
	
	@Test (groups ="ContactUs")
	public void TC2() {
		System.out.println("ContactUs1");
	}
	
	@Test (groups ="ContactUs")
	public void TC4() {
		System.out.println("ContactUs2");
	}
	
	
	@Test (groups ="Services")
	public void TC5() {
		System.out.println("Services1");

	}
	
@Test (groups ="Homepage")
public void TC3()
{System.out.println("Homepage2");

}

@Test (groups ="Services")
public void TC6() {
	System.out.println("Services2");

}
}