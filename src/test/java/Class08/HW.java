package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //        get  the column id
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

//        iterate over to find the row number of the desired id
        int count=0;
        for(WebElement id:ids){

            if(id.getText().equals("95935A")){
                System.out.println("the row number is "+(count+1));
//                click on the checkbox
                String xpath = "//table/tbody/tr["+(count+1)+"]/td[1]";
                WebElement checkBox = driver.findElement(By.xpath(xpath));
                checkBox.click();

            }
            count=count+1;
        }
    }
}

