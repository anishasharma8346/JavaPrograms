package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class As_86_Absolute_xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Admin/Desktop/grotechminds.html");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(/html/body/input[1])")).sendKeys("Anisha");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("school");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("drinkprime");
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("anishasharma456");
		//driver.findElement(By.xpath("/html/body/input[5]")).click();
		driver.findElement(By.xpath("/html/body/form/label[3]")).click();
		//Select the check box I have a boy
		WebElement e5 = driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
		e5.click();
		WebElement e6 = driver.findElement(By.xpath("(/html/body/form)[2]/input[2]"));
		e6.click();
		WebElement e7 = driver.findElement(By.xpath("(/html/body/form)[2]/input[3]"));
		e7.click();
		Thread.sleep(1000);
	    //driver.findElement(By.partialLinkText("Click to know")).click();
		WebElement e8=driver.findElement(By.id("Relegion"));
		Select s1= new Select(e8);
		s1.selectByIndex(1);
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		Thread.sleep(1000);
		driver.close();

		
		
		
       
	}

}
