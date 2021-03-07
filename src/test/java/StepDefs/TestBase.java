package StepDefs;

import AppConstants.Constants;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties properties;
    private String basePath = System.getProperty("user.dir");


    public void initializeDriver() {
        loadConfig();
        setUpBrowser();
        launchUrl();

    }

    private void launchUrl() {
        driver.manage().timeouts().implicitlyWait(Constants.default_Implicit_wait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
    }

    private WebDriver setUpBrowser() {

        switch (properties.getProperty("browser")) {

            case "chrome":
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                FirefoxDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "edge":
                EdgeDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            default:
                throw new NullPointerException();

        }
        return driver;

    }

    private void loadConfig() {
        try {
            FileInputStream fileInputStream = new FileInputStream(basePath + File.separator + "src/test/resources/configuration.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
