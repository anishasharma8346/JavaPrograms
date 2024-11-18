package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As_84_85 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//span[.='Grocery']"));
	Actions a1= new Actions(driver);
	a1.doubleClick(e1).perform();
	//Right Click
	WebElement e2= driver.findElement(By.xpath("(//input[@name='pincode'])"));
	a1.contextClick(e2).perform();

	}

}
