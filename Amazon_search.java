package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.navigate().to("https://www.amazon.in/");
    WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
    e1.sendKeys("shoe");
    WebElement e2= driver.findElement(By.id("nav-search-submit-button"));
    e2.click();
    driver.close();

	

	}

}
