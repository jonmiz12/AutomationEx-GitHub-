package FinalSelenium;

import static org.junit.Assert.assertArrayEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mortgage {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\נייד\\Desktop\\Tools\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		Robot robot = new Robot();
		Actions action = new Actions(driver);
		MortgageElements m = new MortgageElements();
		
		/*EX1*/
		
		driver.get("https://www.supermarker.themarker.com/");
		
		m.Msearchbox(driver).sendKeys("מחשבון");
		
		
		
		String templi;
		
		Thread.sleep(3000);
		

		for (int i = 0; i<m.Msearchlist(driver).size(); i++) {
			templi = m.Msearchlist(driver).get(i).getText();
			if (templi.contains("מחשבון משכנתא")) {
				m.Msearchlist(driver).get(i).click();
				break;
			}
		}
		
		
		/*EX2*/
		
		
		for (int i=0;i<m.MCalcBy(driver).size();i++) {
			if (m.MCalcBy(driver).get(i).getText().contains("החזר חודשי")) {
				m.MCalcBy(driver).get(0).click();
				System.out.println("החזר חודשי chosen");
			}
		}
		/*EX 3*/
		
		System.out.println(m.qMark(driver).getAttribute("title"));
		
		/*EX4*/
		
		m.reMethod(driver).click();
		
		/*EX5*/
		
		
		m.Madad(driver).click();
		
		
		/*EX6*/
		
		m.MortSum(driver).clear();
		m.MortSum(driver).sendKeys("500000");
		
		/*EX7*/
		
		action.dragAndDropBy(m.Cursor(driver), 35, 0).perform();;
		
		/*EX8*/
		


		m.Intrest(driver).clear();
		m.Intrest(driver).sendKeys("3.75");
		
		/*EX9*/
		
		m.Calc(driver).click();
		Thread.sleep(1500);
		
		/*EX10*/
		
		String loanSumString = m.LoanSum(driver).getText().replace(" ₪", "").replace(",", "");
		System.out.println(loanSumString);
		m.Mail(driver).sendKeys(loanSumString);
		
		/*EX11*/
		
		m.Name(driver).sendKeys("יהונתן מזרחי");
		
		/*EX12*/
		/*
		האלמנט לא נמצא בדף 
		*/
		/*EX13*/

		try {
			m.MailError(driver);
			System.out.println("An error has been presented for the mail field");
		} catch (Exception e) {
			System.out.println("mail field did not present an error");
		}
		
		System.out.println("There is no checkbox for approving terms of use");
		System.out.println("There is no element that shows an error for the phone field");

	}

}

