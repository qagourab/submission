package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.map.model.WebDriverProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
 
@CucumberOptions(
		features="src/test/resources/features",
		glue={"stepdefinations/"},
				format=
			{"pretty",
			"html:target/cucumber-reports/cucumber-pretty",
			"json:target/cucumber-reports/CucumberTestReport.json",
			"rerun:target/cucumber-reports/re-run.txt"}
		, tags ={"@web"}
		)
public class TestRunner {
	public static WebDriver driver;
	private TestNGCucumberRunner testRunner;
	
	@BeforeClass
	public void setUP()
	{
		
		driver = WebDriverProvider.getDriver();
		this.driver.get(WebDriverProvider.getURL());

		testRunner = new TestNGCucumberRunner(TestRunner.class);
		
	}
	@Test(description="MapTest",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		testRunner.finish();
	}
}
