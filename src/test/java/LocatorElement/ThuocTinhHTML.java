package LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ThuocTinhHTML {
    public static void main(String[] args) throws InterruptedException {
        //Set up mo trinh duyet
        WebDriver driver; //Khai bao bien Driver
        driver = new ChromeDriver(); //Khoi tao gia tri trinh duyet
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thoi gian cho doi toi da de tim element

        //Code auto thao tac
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.partialLinkText("Forgot Pass")).click();
//        driver.findElement(By.className("btn")).click();
        driver.findElement(By.tagName("button")).click();
//        driver.findElement(By.id("search_input")).sendKeys("Selenium");
        Thread.sleep(1000);

        driver.quit(); //Tat trinh duyet
    }
}
