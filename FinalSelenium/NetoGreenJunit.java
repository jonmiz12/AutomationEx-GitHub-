package FinalSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.FindBy;

public class NetoGreenJunit {
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"searchTxt\"]")
	static WebElement searchbox;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"Button1\"]")
	static WebElement searchbutton;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
	static WebElement firstresult;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option")
	static List<WebElement> resultList;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"quantity\"]")
	static WebElement quantity;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[4]")
	static List<WebElement> fourthresult;
}