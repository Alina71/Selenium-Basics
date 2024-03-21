package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(5000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Mila");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("Mila123@gmail.com");
        WebElement reEnterEmail= driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("Mila123@gmail.com");
        WebElement password= driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("123Mila");
        Thread.sleep(8000);
        driver.close();
    }
}
