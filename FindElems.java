package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElems {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e1.sendKeys("Bangalore");
	Thread.sleep(3000);
	List<WebElement> l1=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int size=l1.size();
	System.out.println(size);
	//for(int i=0;i<size;i++) {
	WebElement e2=l1.get(size-1);
	String autosugg=e2.getText();
	System.out.println(autosugg);
	//}
driver.close();

	}

}
