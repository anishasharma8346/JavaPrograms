package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_prog {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys("anisha.sahrma223@gmail.com");
	driver.close();
	}

}
