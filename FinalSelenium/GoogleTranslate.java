package FinalSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTranslate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\נייד\\Desktop\\Tools\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://translate.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement beforebox = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/span/span/div/textarea"));
		beforebox.sendKeys("שלום, שמי יהונתן");
		
		Thread.sleep(4000);

		WebElement LanButton = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[5]/button"));
		List<WebElement> languages = new ArrayList<WebElement>();
		languages = driver.findElements(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[3]/c-wiz/div[2]/div/div[3]/div/div[2]/div[position()<7]"));
		
		for(int i=1; i<6; i++) {
			try {
				LanButton.click();
				languages.get(i).click();
				driver.findElement(By.xpath("//button[@aria-label='האזנה לתרגום']//span[2]")).click();
			} catch (Exception e) {
				System.out.println("The "+i+" language cannot be played");
			}

		}

	}

}
