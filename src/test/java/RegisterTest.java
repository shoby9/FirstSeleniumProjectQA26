import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
        driver.findElement(By.id("firstname")).sendKeys("radu");
        driver.findElement(By.id("middlename")).sendKeys("sh");
        driver.findElement(By.id("lastname")).sendKeys("nicolae");
        driver.findElement(By.id("email_address")).sendKeys("radunicolae9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector(".control > label:nth-child(2)")).click();
        driver.findElement(By.cssSelector("button.button:nth-child(2) > span:nth-child(1) > span:nth-child(1)")).click();
        driver.close();
    }
}
