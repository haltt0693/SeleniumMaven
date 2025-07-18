package Bai6_WebElement;

import LocatorElement.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DecimalFormat;
import java.time.Duration;

public class DemoWebElementCRM {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
//        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit();
//        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();


        System.out.println(driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getText());
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.headerLogin)).getTagName());

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("background-color"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("color"));

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size"));

// Làm tròn số thập phân FONT-SIZE
        double value = Double.parseDouble(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-size").replace("px", ""));
        long rounded = Math.round(value);  // trả về long
        System.out.println(rounded);


        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-family"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("font-style"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("height"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getCssValue("width"));

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value"));

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize());
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().height);

//        Làm tròn vs số thập phân 2 chữ số
        DecimalFormat df = new DecimalFormat("#.00");
        String fontSizeRounded = df.format(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().height);
        System.out.println("Font-size sau làm tròn: " + fontSizeRounded + "px");

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().width);

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation());
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().x);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().y);


//        System.out.println("isDisplayed Alert: " + driver.findElement(By.xpath(LocatorsCRM.alertLoginFailed)).isDisplayed());
//        System.out.println("Alert: " + driver.findElement(By.xpath(LocatorsCRM.alertLoginFailed)).getText());


//        driver.get("https://anhtester.com/");
//        System.out.println("isDisplayed Header page: " + driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed());
//        System.out.println("isDisplayed Login Button: " + driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed());
//

        driver.quit();

    }
}
