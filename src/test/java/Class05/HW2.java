package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //        goto syntax projects.com
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement enableButtons = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableButtons.click();

        List<WebElement> options = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement CheckBox: options) {
            String optionVal = CheckBox.getAttribute("value");
            if (optionVal.equals("Checkbox-1")||optionVal.equals("Checkbox-4")) {
                CheckBox.click();

            }
        }
    }
}