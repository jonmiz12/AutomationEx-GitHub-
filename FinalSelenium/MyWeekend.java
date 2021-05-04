package FinalSelenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyPairGeneratorSpi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.icu.impl.number.Parse;
import com.ibm.icu.text.DecimalFormat;

import jnr.ffi.Struct.int16_t;

public class MyWeekend {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\נייד\\Desktop\\Tools\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.weekend.co.il/%D7%A0%D7%A7%D7%95%D7%93%D7%AA_%D7%97%D7%9F/");
		
		MyWeekendElements w = new MyWeekendElements();
		w = PageFactory.initElements(driver, MyWeekendElements.class);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
//		List<WebElement> bigratings = driver.findElements(By.xpath("//p[@class=\"grades4\"]"));
//		List<WebElement> smallratings = driver.findElements(By.xpath("//div[@class=\"gradesshort\"]"));
		
		List<Double> Dratings = new ArrayList<Double>();
		String[] Sratings;
		Double ratingsSum = 0.0;
		Double ratingsAvg = 0.0;
		
		for (int i=0; i<w.bigratings.size(); i++) {
			Dratings.add(Double.parseDouble(w.bigratings.get(i).getText()));
		}
		
		for (int i=0; i<w.smallratings.size(); i++) {
			Sratings = w.smallratings.get(i).getText().split(" ");
			Dratings.add(Double.parseDouble(Sratings[0]));
			}
		
		for (int i=0; i<Dratings.size(); i++) {
			ratingsSum = ratingsSum + Dratings.get(i);
		}
		ratingsAvg = ratingsSum/Dratings.size();
		
		for (int i=0; i<Dratings.size(); i++) {
			System.out.println(Dratings.get(i));
		}
		
		System.out.println(ratingsAvg);
		

		System.out.println(df.format(ratingsAvg));
	}

}