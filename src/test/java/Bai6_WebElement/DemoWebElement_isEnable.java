package Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement_isEnable {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io");
        System.out.println("isDisplayed Button = Run this project: " + driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).isDisplayed());
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        System.out.println("isDisplayed Button = Submit: " + driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isDisplayed());
        System.out.println("isEnabled Button = Submit: " + driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled());
        System.out.println("isDisplayed Button = Hacker Submit: " + driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isDisplayed());
        System.out.println("isEnabled Button = Hacker Submit: " + driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled());
        System.out.println("Text of Button = Hacker Submit: " + driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).getText());

        driver.quit();
    }
}
