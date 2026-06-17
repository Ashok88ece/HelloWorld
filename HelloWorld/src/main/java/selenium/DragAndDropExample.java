package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");

   String pageTitle = driver.getTitle();
   
   System.out.println("Page Tite is :"+pageTitle);

        //driver.quit();
    }
}