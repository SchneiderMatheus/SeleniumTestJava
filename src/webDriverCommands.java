import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
    public static void main(String[] args) {
        //Set the path of the chrome exacutable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mathe\\Desktop\\Classes\\Selenium\\Selenium Driver 1\\src\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //Navigate to the sebsite to be tested
        driver.get("htpp://www.example.com");

        //Find the username field and enter a username
        WebElement usernameField=driver.findElement(By.id("usernameField"));
        usernameField.sendKeys("myusername");

        //find the password field and enter a password
        WebElement passwordField=driver.findElement(By.id("passwordsField"));
        passwordField.sendKeys("mypassword");

        //click the login button to login
        WebElement loginButton=driver.findElement(By.id("loginButton"));
        loginButton.click();

        //Verify that the login was successful
        WebElement welcomeMessage=driver.findElement(By.id("welcome"));
        String messageText=welcomeMessage.getText();

        if(messageText.equals("welcome,myusername")){
            System.out.println("Congratulations, login sucessfull");
        }
        else{
            System.out.println("login failed");
        }

        driver.quit();
    }
}
