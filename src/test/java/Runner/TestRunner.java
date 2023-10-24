package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features="C:\\Users\\Vanak\\eclipse-workspace\\StarHealthPhase2Cucumber\\src\\test\\java\\features_package\\starHealth.feature",
		glue = {"Steps"},
				dryRun=false,
		plugin = { "html:target/Amazonreport.html",
				"pretty"  ,
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "timeline:test-output-thread/"	
				},	
				
				tags ="@all"
	
		
		)
		




public class TestRunner {

}
