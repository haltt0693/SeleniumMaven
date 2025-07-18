package LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorXPathTuongDoi1_4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
//        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText());
//        System.out.println(driver.findElement(By.xpath("//label[@for='email']")).getText());
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println(driver.findElements(By.xpath("//li[starts-with(@class,'menu-item')]")).getClass());
        System.out.println(driver.findElements(By.xpath("//li[starts-with(@class,'menu-item')]")).get(2));
        System.out.println(driver.findElements(By.xpath("//li[starts-with(@class,'menu-item')]")).get(3));
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[2]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[3]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[4]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[5]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[6]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[7]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[8]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[9]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[10]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[11]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[12]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[13]")).getText());
        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[14]")).getText());
//        System.out.println(driver.findElement(By.xpath("(//li[starts-with(@class,'menu-item')])[15]")).getText());

//        Thread.sleep(1000);
        driver.quit();

    }
}
