package LocatorElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorXPathTuyetDoi {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver; //Khai bao bien Driver
        driver = new ChromeDriver(); //Khoi tao gia tri trinh duyet
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Thoi gian cho doi toi da de tim element

        //Code auto thao tac
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/form/div/input")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/button")).click();

        Thread.sleep(1000);
        driver.quit();
    }
}
