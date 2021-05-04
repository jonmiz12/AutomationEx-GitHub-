package FinalSelenium;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.python.antlr.PythonParser.classdef_return;


import com.paulhammant.ngwebdriver.ByAngularBinding.FindBy;

public class MyWeekendElements {
	
	@org.openqa.selenium.support.FindBy (how = How.XPATH, using = "//p[@class=\"grades4\"]")
	static List<WebElement> bigratings;
	
	@org.openqa.selenium.support.FindBy (xpath = "//div[@class=\"gradesshort\"]")
	static List<WebElement> smallratings;
}
