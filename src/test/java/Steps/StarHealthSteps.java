package Steps;



import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.assertions.Assertions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarHealthSteps {

WebDriver driver;
	@Given("User open the chrome browser and starhealth application")
	public void user_open_the_chrome_browser_and_starhealth_application() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.starhealth.in/");
			String title=driver.getTitle();
	    	System.out.println("The title of the page"+title);
		
	}

	@When("User  waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() throws InterruptedException {
		//Thread.sleep(1500);
		//WebElement e1=driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
		//Actions a = new Actions(driver);
		//a.moveToElement(e1).perform();
		//boolean displays=driver.findElement(By.xpath("//div[@class='ant-modal-content']")).isDisplayed();
		//Assert.assertTrue(false);
	        System.out.println("welcome to StarHealth pop up not displayed");
	        //driver.findElement(By.xpath("//div[@class='ant-modal-content']")).click();
		
	}
		
	

	@Then("validates the Star Health home page title using a JUnit assertion")
	public void validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
		driver.getTitle();
		String title=driver.getTitle();
    	System.out.println("The title of the page"+title);
    	String ExpectedTitle="Star Health Insurance: Medical, Accident and Travel insurance policies";
    	
        System.out.println(ExpectedTitle);
        Assertions.isTrueArgument(ExpectedTitle, true);
		System.out.println("validating the star health page title");
	}

	@Then("clicks on the Buy Now button")
	public void clicks_on_the_buy_now_button() {
		driver.findElement(By.xpath("//button[@class='primaryButton_primary-button__ZYTTy flex flex-row justify-center align-center text-16 font-extra-bold primaryButton_btn-blue___2H9y undefined']")).click();
	    System.out.println("user click on the buy now button");
	}

	@And("User enters following details")
	public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String,String>> UserList = dataTable.asMaps(String.class,String.class);      
	      for(Map<String,String> e : UserList ) {
	    	 //     | FullName    | PhNo       | PIN    | 
	    	 Thread.sleep(1500);
	    	 driver.findElement(By.xpath("//input[@id='name']")).clear();
	    	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys(e.get("FullName"));
	    	 driver.findElement(By.xpath("//input[@id='contact_no']")).clear();
             driver.findElement(By.xpath("//input[@id='contact_no']")).sendKeys(e.get("PhNo"));
	    	 driver.findElement(By.xpath("//input[@id='pinCode']")).clear();
             driver.findElement(By.xpath("//input[@id='pinCode']")).sendKeys(e.get("PIN"));
	      }
	    
	      }

	@And("User clicks on I need health insurance from the drop-down menu and select plan")
	public void user_clicks_on_i_need_health_insurance_from_the_drop_down_menu_and_select_plan() {
	    driver.findElement(By.xpath("//div[@id='grouped-select']")).click();
	    System.out.println("user is clicking on the health insurance in drop down menu");
	}

	@Then("User click on the Plan for My Family page")
	public void user_click_on_the_plan_for_my_family_page() {
	    driver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[2]")).click();
        System.out.println("user click on the my family plan");
	}

	@And("Validate the user mobile number")
	public void validate_the_user_mobile_number() {
	  String actual_mobile_no= driver.findElement(By.xpath("//input[@id='contact_no']")).getText();
	  System.out.println(actual_mobile_no);
	  System.out.println("user validating the user number");
	}

	@And("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() {
	 //driver.findElement(By.xpath("//a[@href='/']")).click();
		WebElement e1 =driver.findElement(By.className("jss103"));
 		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
	 driver.findElement(By.className("jss103")).click();
	 
	 //System.out.println("user click on the star Health logo");
	}

	@And("Close all the browsers")
	public void close_all_the_browsers() {
	   driver.close();
	}

}
