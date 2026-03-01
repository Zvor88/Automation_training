import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeMethod_two_sites_Tema {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver ();
        driver.get("https://www.imd.org/degree/mba/");
        driver.get("https://www.apple.com");
    }
    @Test
    public void SearchTest() {
        driver.findElement(By.xpath("//button[contains(text(), 'Agree & Proceed')]"));;

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
