package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewEmployeeList/reset/1#");

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");

        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement login= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();
        Thread.sleep(12000);

        WebElement Name= driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
        Name.sendKeys("John Smith");


        WebElement ID= driver.findElement(By.xpath("//input[@id='empsearch_id']"));
        ID.sendKeys("123456");

        WebElement EStatus= driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
        Select sel=new Select(EStatus);
        sel.selectByValue("869");

        WebElement include= driver.findElement(By.xpath("//select[@id='empsearch_termination']"));
        Select sel1=new Select(include);
        sel1.selectByValue("1");

        WebElement SuperName=driver.findElement(By.xpath("//input[@id='empsearch_supervisor_name']"));
        SuperName.sendKeys("Joe Smith");

        WebElement JobTitle= driver.findElement(By.xpath("//select[@id='empsearch_job_title']"));
        Select sel3=new Select(JobTitle);
        sel3.selectByValue("951");

        WebElement SubUnit= driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']"));
        Select sel4=new Select(SubUnit);
        sel4.selectByValue("3");

    }
}
