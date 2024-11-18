package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As_88_AutoSugg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Delhi");
		Thread.sleep(3000);
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int length = l1.size();
		l1.get(length-9).click();
		/*System.out.println(length);
		for (int i = 0; i < length; i++) {
			WebElement a1 = l1.get(i);
			String autosugg = a1.getText();
			System.out.println(autosugg);
		}*/
		// driver.close();
	}

}
