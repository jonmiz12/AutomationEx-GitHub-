package FinalSelenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.antlr.grammar.v3.ANTLRParser.throwsSpec_return;
import org.apache.commons.collections.map.StaticBucketMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.python.antlr.PythonParser.else_clause_return;

public class NetoGreenJunitPOF {
	
	static WebDriver driver;
	static NetoGreenJunit pof = new NetoGreenJunit();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\נייד\\Desktop\\Tools\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx");
		pof = PageFactory.initElements(driver, NetoGreenJunit.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	public void SearchTest()throws Exception {
		
		//EX1
		
		pof.searchbox.sendKeys("לחם");
		pof.searchbutton.click();
		Thread.sleep(1000);
		System.out.println("EX1");
		
		if(pof.firstresult.getText().contains("לחם")) {
			System.out.println("search successfull");
		}
		else {
			System.out.println("search failed");
		}
		System.out.println("");
		
		//EX2
		
		pof.searchbox.clear();
		pof.searchbox.sendKeys("498465");
		pof.searchbutton.click();
		Thread.sleep(5000);
		System.out.println("EX2");
		
		if (pof.firstresult.getText().contains("לא נמצאו מזונות, נסה שנית.")) {
			System.out.println("No results were show for this search - '"+pof.firstresult.getText()+"'");
		}
		else {
			System.out.println("The first result was :");
			System.out.println(pof.firstresult.getText());
		}
		System.out.println("");
		
		//EX3
		
		pof.searchbox.clear();
		pof.searchbox.sendKeys("לחם");
		pof.searchbutton.click();
		assertNotNull(pof.fourthresult);http://download.eclipse.org/technology/m2e/milestones/1.0
		System.out.println("EX3");

		for (int i=0; i<pof.resultList.size(); i++) {
			if (pof.resultList.get(i).getText().contains("לחם זיתים")){
				pof.resultList.get(i).click();
				break;
			}
		}
		System.out.println("");
		
		// no alert was showing during manual testing
		
		//EX4
		
		System.out.println("EX4");
		pof.quantity.sendKeys("abcdef");
		if(pof.quantity.getText().equals("abcdef")) {
			System.out.println("The caracters remained inside the quantity box");
		}
		else {
			System.out.println("The characters were erased from the qantity box");
		}
		
		System.out.println("");
		
	}
	
	@Test
	public void test()throws Exception {
		
	}

}
