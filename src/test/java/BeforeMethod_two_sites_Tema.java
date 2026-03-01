import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeMethod_two_sites_Tema {
    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
    }


    @Test
    public void SearchTest() {
        driver.get("https://www.imd.org/degree/mba/");
        driver.findElement(By.xpath("//button[contains(text(), 'Agree & Proceed')]"));
        ;

    }

    @Test

    public void SearchTest2() {
        driver.get("https://www.apple.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

