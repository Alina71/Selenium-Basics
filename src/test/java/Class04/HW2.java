package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement feedback= driver.findElement(By.xpath("//input[@class='form-control feedbackBox2']"));
        feedback.sendKeys("It was a great day today!!!");
        WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
        Email.sendKeys("Christmas@yahoo.com");

    }
}
