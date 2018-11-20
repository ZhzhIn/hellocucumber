package hellocucumber.test;


import java.util.List;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Stepdef3rd {
	@Given("the following animals:")
	//将参数声明为a List<String>，但不要在表达式中定义任何捕获组：
	public void the_following_animals(List<String> animals) {
	}
	@Before
	public void doSomethingBefore() {
	}
	@After
	public void doSomethingAfter(Scenario scenario){
//		if (scenario.isFailed()) {
//		    byte[] screenshot = webDriver.getScreenshotAs(OutputType.BYTES);
//		    scenario.embed(screenshot, "image/png");
//		}
	}
	//注释场景
	@After("@browser and not @headless")
	public void doSomethingAfter(){
	}
}
