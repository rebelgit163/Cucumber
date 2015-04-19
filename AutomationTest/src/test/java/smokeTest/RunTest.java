package smokeTest;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features=".", format="json:target/cucumber.json")
public class RunTest {

}
