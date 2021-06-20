import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_page1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\H kumar\\Downloads\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			Select ss=new Select(driver.findElement(By.name("country")));
			java.util.List<WebElement> s=ss.getOptions();
			int a=s.size();
			System.out.println(a);
			for(int i=0;i<a;i++)
			{
				String h=s.get(i).getText();
				if(h.contains("OCEAN")) {
				System.out.println(h);
				}
			ss.selectByVisibleText("INDIA");
			}
			driver.quit();
	}

	}


