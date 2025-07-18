package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;

public class Demo_DropdownList_Dynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(3000);

        //Click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        //Search giá trị cần chọn
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Travel");
        //Click chọn Text đã search (cần chọn)
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();

        //Cách ENTER dùng cho trường hợp chỉ hiển thị 1 giá trị lựa chọn
        //Actions action = new Actions(driver);
        //action.sendKeys(Keys.ENTER).perform();

//        System.out.println("Selected value: " + driver.findElement(By.xpath("//div[@class='main-search-input']//span[@xpath='1']")).getText());

        Thread.sleep(2000);
        closeDriver();
    }
}
