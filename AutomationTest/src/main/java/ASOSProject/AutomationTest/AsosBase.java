package ASOSProject.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AsosBase {
	public static WebDriver driver;

	public void verifyWomen() {

		// System.out.println(driver.getCurrentUrl());
		// String s1 = driver.getCurrentUrl();
		String word = driver.getCurrentUrl();
		System.out.println(word);
		// indexOf return -1 if String does not contain specified word
		if (word.indexOf("women") != -1) {
			System.err.printf("Yes '%s' contains word 'women' %n", word);
		} else {
			System.err.printf("Sorry %s does not contains word 'women' %n ",
					word);
		}

	}

	public void closeBrowser() {
		driver.quit();
	}

	public void startBrowser() {
		driver = new FirefoxDriver();
		}

	public void isWomenSetionDisplayed() {
		driver.findElement(
				By.xpath("//*[@id='BodyTag']/div[5]/div/header/div[4]/nav/ul/li[2]/a/span"))
				.isDisplayed();

	}

	public void clickOnWomenTab() {
		driver.findElement(
				By.xpath("//*[@id='BodyTag']/div[5]/div/header/div[4]/nav/ul/li[2]/a/span"))
				.click();

	}

	public void testURL(String arg1) {

		driver.get(arg1);
	}

}
