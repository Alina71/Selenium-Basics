package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //        goto syntax projects.com
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']")).click();

        WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
        male.click();

        driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']")).click();
        WebElement Option1 = driver.findElement(By.xpath("//input[@value='Option-1']"));
        Option1.click();

    }
}