package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        //instating the instance of chrome driver
        WebDriver driver=new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        // go to a url
        driver.get("https://www.google.com");
        //driver.manage().window().fullscreen();

        //get the title
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        //get the url of the page
       String url= driver.getCurrentUrl();
        System.out.println("The url is "+url);

        //slow done code
        Thread.sleep(2000);

        //close the window
        driver.quit();
        }
    }

