package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.linkedin.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("pagekey-uno-reg-guest-home")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
}
}