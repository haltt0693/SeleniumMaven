package Bai8_Checkbox_Radio_Dropdown;

import LocatorElement.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;

import static common.BaseTest.*;

public class Demo_Checkbox extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        loginCRM();

        driver.findElement(By.xpath(LocatorsCRM.menuTasks)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonNewTask)).click();

        Thread.sleep(2000);
        //Click chọn checkbox Public
//        driver.findElement(By.xpath("//input[@id='task_is_public']")).click();
        //driver.findElement(By.xpath("//label[normalize-space()='Public']")).click();

        //Kiểm tra checkbox đã được check hay chưa
        System.out.println("isSelected Public button: " + driver.findElement(By.xpath("//input[@id='task_is_public']")).isSelected());

        driver.findElement(By.xpath("//input[@id='task_is_public']")).click();
        System.out.println("isSelected Public button: " + driver.findElement(By.xpath("//input[@id='task_is_public']")).isSelected());

        boolean isSelected = driver.findElement(By.xpath("//input[@id='task_is_billable']")).isSelected();
        System.out.println("isSelected: " + isSelected);

        //Nếu chưa được check thì click vào ô check box đó
        if (isSelected == false) {
            System.out.println("Click chọn checkbox");
            driver.findElement(By.xpath("//input[@id='task_is_billable']")).click();
        }

        Thread.sleep(2000);
        closeDriver();
    }
}
