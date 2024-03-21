package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");

WebElement Book1= driver.findElement(By.xpath("//input[@id='favourite-book']"));
Book1.sendKeys("Tema pentru acasa");
WebElement Book2= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
Book2.sendKeys("Oamenii fericiti citesc si beau cafea");
WebElement Book3= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
Book3.sendKeys("Viata e frumoasa, nu-ti face griji");

WebElement BookName3= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
BookName3.sendKeys("Viata e frumoasa, nu-ti face griji");
WebElement BookName2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
BookName2.sendKeys("Oamenii fericiti citesc si beau cafea");
WebElement BookName1= driver.findElement(By.xpath("//input[@id='least-favorite']"));
BookName1.sendKeys("Tema pentru acasa");

        WebElement Grandparent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
Grandparent.sendKeys("Grandparent.");
WebElement Parent=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
Parent.sendKeys("Parent.");
WebElement Child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
Child.sendKeys("Child");
    }
}
