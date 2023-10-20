import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mathe\\Desktop\\Classes\\Selenium\\Selenium Driver 1\\src\\chromedriver.exe");

        //Click the link to activate the alert
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        //driver.switchTo().frame("iframeResult");

        // find the button that reiggers the alert and clickit 
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();

        Alert alert=driver.switchTo().alert();
        String alertText=alert.getText();
        System.out.println("Alert text is:" + alertText);

        //Accept the Alert
        ((Alert) driver).accept();

        //switch back to the main window
        driver.quit();

    }
}

