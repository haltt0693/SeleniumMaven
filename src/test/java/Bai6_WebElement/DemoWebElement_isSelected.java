package Bai6_WebElement;

import LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement_isSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getText());
        System.out.println("Status of button: " + driver.findElement(By.xpath(LocatorsCRM.checkboxRememberme)).isSelected());
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.checkboxRememberme)).click();
        Thread.sleep(1000);
        System.out.println("Status of button: " + driver.findElement(By.xpath(LocatorsCRM.checkboxRememberme)).isSelected());


        driver.quit();
    }
}
