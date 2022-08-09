package com.mycompany.app.my_selenium_app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("welcome to selenium mavin project");
  }
  @Test
   public void launchrome() {
   System.setProperty("webdriver.chrome.driver", "D:\\new eclipse\\first\\Binary\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("https://www.facebook.com");
}
}
