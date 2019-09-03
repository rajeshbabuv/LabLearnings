import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_First_Test_01 {
    public static void main(String args[]){
        System.out.println("Welcome to configuring intellij with Selenium");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajesh\\Desktop\\Rajesh\\Selenium\\geckodriver\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("http://www.google.com");
        obj.get("http://gmail.com");
    }
}
