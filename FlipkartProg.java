package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();

	}

}
