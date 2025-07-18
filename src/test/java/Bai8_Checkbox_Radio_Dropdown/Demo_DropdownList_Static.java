package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static common.BaseTest.createDriver;
import static common.BaseTest.driver;

public class Demo_DropdownList_Static extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
        //Scroll đến element
        WebElement element = driver.findElement(By.xpath("//h1[normalize-space()='Select Menu']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Tạo class Select từ Selenium
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));


// Get list options
        List<WebElement> menuOptions = select.getOptions();
        for (int i =0; i < menuOptions.size(); i++) {
            System.out.println(menuOptions.get(i).getText());
        }



        Thread.sleep(2000);
        //Select option theo text hiển thị
        select.selectByVisibleText("Blue");

        Thread.sleep(1000);
        System.out.println("===============================================================");
        //Get giá trị sau khi đã chọn
        System.out.println("Selected value: " + select.getFirstSelectedOption().getText());

        Thread.sleep(1000);
        closeDriver();
    }
}
