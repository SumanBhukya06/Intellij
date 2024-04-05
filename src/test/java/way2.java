import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class way2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String url="http://localhost:2004/v30145.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		
		driver.findElement(By.xpath("(//label[@class='leftbarButtonGroup btn btn-primary'])[6]")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Test Lab']")).click();
		
		//driver.close();

	}

}
