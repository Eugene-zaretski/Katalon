package ru.stqa.pft.ad;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class UntitledTestCase {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.google.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		selenium.open("http://localhost/addressbook/group.php");
		selenium.type("name=user", "admin");
		selenium.click("name=pass");
		selenium.type("name=pass", "secret");
		selenium.click("//input[@value='LOGIN']");
		selenium.click("name=new");
		selenium.click("name=group_name");
		selenium.type("name=group_name", "qwerty");
		selenium.click("name=group_header");
		selenium.type("name=group_header", "qwerty1");
		selenium.click("name=group_footer");
		selenium.type("name=group_footer", "qwerty2");
		selenium.click("name=submit");
		selenium.click("link=group page");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
