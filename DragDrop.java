package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
	    WebElement e1= driver.findElement(By.xpath("(//img[@id='drag1'])"));
	    WebElement e2=driver.findElement(By.xpath("(//div[@id='div2'])"));
	    Thread.sleep(2000);
	    Actions a1 = new Actions(driver);
	    a1.dragAndDrop(e1, e2).perform();
	    Thread.sleep(2000);
	    WebElement e3= driver.findElement(By.id("drag1"));
	    WebElement e4= driver.findElement(By.id("container"));
         a1.dragAndDrop(e3, e4).perform();
	}

}
