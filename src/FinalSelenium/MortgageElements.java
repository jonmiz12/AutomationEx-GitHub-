package FinalSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.PythonParser.return_stmt_return;

public class MortgageElements {
	
	public WebElement Msearchbox (WebDriver driver) {
		WebElement Msearchbox = driver.findElement(By.id("txtSearch"));
		return Msearchbox;
	}
	
	public List<WebElement> Msearchlist (WebDriver driver) {
		List<WebElement> Mmortgli = driver.findElements(By.xpath("/html/body/ul[@id='ui-id-1']/li"));
		return Mmortgli;
	}
	
	public List<WebElement> MCalcBy (WebDriver driver) {
		List<WebElement> CalcBy = driver.findElements(By.xpath("//html//body//form//div[5]//div[4]//div[2]//div[1]//div[2]//table[1]//tbody//tr[2]//td[2]//span//label[@for=\"rblSelectCalcType_0\" or @for=\"rblSelectCalcType_1\"]"));
		return CalcBy;
	}
	
	public WebElement qMark (WebDriver driver) {
		WebElement qMark = driver.findElement(By.xpath("//*[@id=\"mortgageCalculatorType\"]/tbody/tr[3]/td[1]/img"));
		return qMark;
	}
	
	public WebElement reMethod (WebDriver driver) {
		WebElement reMethod = driver.findElement(By.xpath("//*[@id=\"rblSelectKeren\"]/label[@for=\"rblSelectKeren_1\"]"));
		return reMethod;
	}
	
	public WebElement Madad (WebDriver driver) {
		WebElement Madad = driver.findElement(By.xpath("//*[@id=\"rblMadad\"]/label[@for=\"rblMadad_0\"]"));
		return Madad;
	}
	
	public WebElement MortSum (WebDriver driver) {
		WebElement MortSum = driver.findElement(By.xpath("//*[@id=\"txtLoanAmount\"]"));
		return MortSum;
	}
	
	public WebElement Cursor (WebDriver driver) {
		WebElement Cursor = driver.findElement(By.xpath("//*[@id=\"sliderTerm\"]/span"));
		return Cursor;
	}
	
	public WebElement Intrest (WebDriver driver) {
		WebElement Intrest = driver.findElement(By.xpath("//*[@id=\"txtInterest\"]"));
		return Intrest;
	}
	
	public WebElement Calc (WebDriver driver) {
		WebElement Calc = driver.findElement(By.xpath("//*[@id=\"ibCalc\"]"));
		return Calc;
	}
	
	public WebElement LoanSum (WebDriver driver) {
		WebElement LoanSum = driver.findElement(By.id("keren"));
		return LoanSum;
	}
	
	public WebElement Mail (WebDriver driver) {
		WebElement Mail = driver.findElement(By.xpath("//*[@id=\"txtEmail1\"]"));
		return Mail;
	}
	
	public WebElement Name (WebDriver driver) {
		WebElement Name = driver.findElement(By.xpath("//*[@id=\"txtShemPrati1\"]"));
		return Name;
	}
	
	public WebElement MailError (WebDriver driver) {
		WebElement MailError = driver.findElement(By.xpath("//*[@id=\"txtShemPrati1\"]"));
		return MailError;
	}
}
