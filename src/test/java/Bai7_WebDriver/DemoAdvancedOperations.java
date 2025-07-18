package Bai7_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvancedOperations {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));


// Navigate to a page
        driver.navigate().to("http://anhtester.com");
        Thread.sleep(1000);
        System.out.println("Code1: " + driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://kenh14.vn/");
        Thread.sleep(1000);
        System.out.println("Code2: " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://afamily.vn/");
        Thread.sleep(1000);
        System.out.println("Code3: " + driver.getWindowHandle());


//        String handle = driver.getWindowHandle();
//        System.out.println("Code: " + handle);


        driver.quit();

    }
}
