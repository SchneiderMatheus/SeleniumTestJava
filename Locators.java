

public class Locator {
    public static void main(String[] args)
    //above
    //By emailLocator=RelativeLocator.with(By.tagName("input")).above(By.id("password"));
    //below
    //By passwordLocator=RelativeLocator.with(By.tagName("input")).Below(By.id("email"));
    //left of
    //By cancelLocator=RelativeLocator.with(By.tagName("button")).toLeftof(By.id("submit"));
    //Right of
    //By submitLocator=RelativeLocator.with(By.tagName("button")).toRightof(By.id("cancel"));
    //near
    //By emailLocator=RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));

    {

        //sign in page locatores
        //public static final By BASE_URL = By,name("URL");
        public static final By USERNAME_INPUT=By.name("username");
        public static final By PASSWORD_INPUT=By.name("password");
        public static final By SININ_BUTTON=By.name("sign_in");

        //home Locators
        public static final By MESSAGE_HEADING= By.tagName("h1");

        //Main Page Locators
        public static final String USERNAME="myusername"
        public static final String Password = "mypassword"
        public static final String BASE_URL = "https://www.advantageonlineshopping.com/#/"
        
    }
}