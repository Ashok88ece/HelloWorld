package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement element = driver.findElement(By.id("subjectsInput"));
		boolean subject = element.isDisplayed();
		System.out.println(subject);
		
		

	}

}
