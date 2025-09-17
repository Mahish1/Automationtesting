package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pages extends Reuseble {
    public static String url = "https://www.facebook.com/";
    
    static By email=By.id("email");
    static By pass=By.id("pass");
    static By login = By.xpath("//*[@name='login']");
    public static WebElement loc(By elements) {
        return driver.findElement(elements);
    }
    public static void url() {
    	driver.get(url);
    }
    public static void Detailes() {
    	loc(email).sendKeys("7993307119");
    	loc(pass).sendKeys("mahesh@21");
    	loc(login).click();
    }


}
