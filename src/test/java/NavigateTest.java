import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by neste on 02.05.2020.
 */
public class NavigateTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void startDriver(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }

    @Test
    public void checkTitle(){
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/");
        String title = driver.getTitle();
        assertThat(title).isEqualTo("SeleniumHQ Browser Automation");
    }

    @Test
    public void navigateBack(){
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/");
        navigate.back();
    }

    @Test
    public void navigateForward(){
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/");
        navigate.forward();
    }

    @Test
    public void navigateRefresh(){
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/");
        navigate.refresh();
    }

}
