package hellocucumber.test;
/**
 * author:zhzhi_yin
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//使用插件pretty,html:target
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberTest {
}