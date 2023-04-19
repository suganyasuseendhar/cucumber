package gluecode;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BaseTest;

public class Hooks extends BaseTest{
	
	BaseTest base= new BaseTest();
	
	public String scenarioName="";
	
	@Before
	public void beforeScenario(Scenario scenario)
	{
		scenarioName=scenario.getName();
		base.launchBrowser();
		
	}
	
	@After
	public void afterScenario()
	{
		base.quitBrowser();
	}
	

}
