package Steps;



import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksTagSteps {

	@Before(order=0)
	public void openBrowser()
	{
		
		System.out.println("opening the website");
		
    	
	}
	
	@After(order=0)
	public void CloseBrowser()
	{
	System.out.println("closing the browser");
	}
}
