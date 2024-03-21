package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

        driver.findElement(By.xpath("//button[@id='display_button']")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enabled']"))).click();

        driver.findElement(By.xpath("//button[@id='enable_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-default' and text()='Button']"))).click();
        Thread.sleep(12000);

        driver.findElement(By.xpath("//button[@id='checkbox_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']"))).click();
        WebElement check=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(check.isSelected());


    }
}
