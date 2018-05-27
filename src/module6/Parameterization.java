package module6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Parameters("browser")
	
	@Test
	public void ParameterisingTest (String browser)
	{ if(browser.equals("Firefox")) {
		System.out.println("firefox is running");
	}
	
	else if(browser.equals("Chrome"))
	{System.out.println("Chrome is running");	
	
	
	}
	}

}
