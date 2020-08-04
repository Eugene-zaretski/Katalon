package ru.stqa.pft.addressbook;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.fail;


 public class GroupTestCase{
  FirefoxDriver wd;
     //private WebDriver driver;
  //private String baseUrl;
  //private boolean acceptNextAlert = true;
  //private final StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    //baseUrl = "https://www.google.com/";
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void GroupTestCase() throws Exception {
    wd.get("http://localhost/addressbook/group.php");
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//input[@value='LOGIN']")).click();
    wd.findElement(By.name("new")).click();
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys("qwerty");
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys("qwerty1");
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys("qwerty2");
    wd.findElement(By.name("submit")).click();
    wd.findElement(By.linkText("group page")).click();
  }

  @AfterMethod
  public void tearDown() throws Exception {
    wd.quit();

  }





}
