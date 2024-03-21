package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //        goto syntax projects.com
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //        find the alert1
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert1.click();
        Thread.sleep(2000);

        //        switch the focus of the driver to alert
        Alert alertHandler = driver.switchTo().alert();
        alertHandler.sendKeys("Salut");
        alertHandler.accept();

    }
}
