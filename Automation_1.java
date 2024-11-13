package automation;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Automation_1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	//	EdgeDriver d1= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
        driver.close();
	}

}
