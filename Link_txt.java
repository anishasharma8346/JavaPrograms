package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_txt {

	public static void main(String[] args) throws InterruptedException {
	
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.linkText("Customer Service"));
    e1.click();
    //Thread.sleep(3000);
    driver.close();
    
    
	}

}
