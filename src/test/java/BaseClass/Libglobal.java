package BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Libglobal {
public static WebDriver driver;
public WebDriver getDriver(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\CucuAdactin\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	return driver;
	
}
public void geturl(String url) {
driver.get(url);


}
public void fill(WebElement e,String text) {
	e.sendKeys(text);

}
public String generaterandomdate() {
	return new SimpleDateFormat("EE_MM_dd_yyyy_hhmmss").format(new Date());

}
public void screenshot() {
	TakesScreenshot tk=(TakesScreenshot) driver;
File s = tk.getScreenshotAs(OutputType.FILE);
File d=new File("C:\\Users\\Marcellin\\eclipse-workspace\\CucuAdactin\\screenshot\\"+generaterandomdate() +".png");
try {
FileUtils.copyFile(s, d);
}catch (IOException e) {
	e.printStackTrace();
}
}
public void click(WebElement e) {
	e.click();

}
}
