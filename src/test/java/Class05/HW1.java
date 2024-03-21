package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement enableButtons = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableButtons.click();

        WebElement male = driver.findElement(By.xpath("//input[@value='gender-male']"));
        if (male.isEnabled()) {
            male.click();
        }
    }
}
