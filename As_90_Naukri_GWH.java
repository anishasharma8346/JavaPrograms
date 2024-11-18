package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class As_90_Naukri_GWH {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("(//span[.='Google'])")).click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		Iterator <String> i1= s1.iterator();
		String parent=i1.next();
		String child = i1.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		driver.close();
		
	}

}
