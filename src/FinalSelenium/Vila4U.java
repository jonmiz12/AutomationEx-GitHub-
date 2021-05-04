package FinalSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jnr.ffi.Struct.int16_t;

public class Vila4U {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\נייד\\Desktop\\Tools\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vila4u.com/%D7%9B%D7%AA%D7%91%D7%95%D7%AA/%D7%97%D7%95%D7%A4%D7%A9%D7%94_%D7%9C%D7%A4%D7%99_%D7%AA%D7%A7%D7%A6%D7%99%D7%91");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement region = driver.findElement(By.xpath("//*[@id=\"siteSearch\"]"));
		
		List<WebElement> category = driver.findElements(By.xpath("//*[@id=\"searchBox\"]/div[2]/select[1]/option[position()>1]"));
		
		WebElement accessory = driver.findElement(By.xpath("//*[@id=\"searchBox\"]/div[2]/div[3]/span"));
		accessory.click();
		
		List<WebElement> accessories = driver.findElements(By.xpath("//div[@data-show=\"1\"]/label"));
		
		WebElement leftcursor = driver.findElement(By.xpath("//*[@id=\"priceRange\"]/a[2]"));
		WebElement rightcursor = driver.findElement(By.xpath("//*[@id=\"priceRange\"]/a[1]"));
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"searchBox\"]/div[3]/a"));
		
		List<WebElement> villaresults = new ArrayList<WebElement>();
		
		/*EX1*/
		
		region.sendKeys("וילות בצפון");
		
		/*EX2*/
		
		for(int i=0; i<category.size();i++) {
			if (category.get(i).getText().contains("וילה לזוגות")){
				category.get(i).click();
			}
		}
		
		/*EX3*/
		
		for(int i=0; i<accessories.size();i++) {
			try {
				if (accessories.get(i).getAttribute("innerHTML").contains("בריכה מחוממת") ||
						accessories.get(i).getAttribute("innerHTML").contains("פינת מנגל")) {
						System.out.println(accessories.get(i).getAttribute("innerHTML")+" - this is the label to be clicked");
						accessory.click();
						accessories.get(i).findElement(By.xpath("//preceding::input[1]")).click();
					}

			} catch (Exception e) {
				System.out.println(accessories.get(i).getAttribute("innerHTML")+" did not function");
			}

		}
		
		/*EX4*/
		
		action.dragAndDropBy(leftcursor, 90, 0).perform();
		action.dragAndDropBy(rightcursor, -4, 0).perform();
		
		/*EX5*/
		
		search.click();
		
		/*EX6*/
		
		villaresults = driver.findElements(By.xpath("//*[@id=\"boxWrapperResults\"]/div/div[4]/a"));
		
		System.out.println("The villas names results are :");
		for(int i=0; i<villaresults.size(); i++) {
			System.out.println(villaresults.get(i).getText());
		}
	}

}
