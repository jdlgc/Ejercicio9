package jdlgc.Ejercicio9;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class Test3Test {
	
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void test3() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(1512, 944));
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("about_sidebar_link")).click();
    vars.put("pageurl", js.executeScript("return window.location.href"));
    assertEquals(vars.get("pageurl").toString(), "https://saucelabs.com/");
  }
  
}
