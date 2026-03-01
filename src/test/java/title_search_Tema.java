import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class title_search_Tema {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.imd.org/degree/mba/");
    }

    @Test
    public void searchTest() {
        driver.findElement(By.xpath("//button[contains(text(), 'Agree & Proceed')]"));;

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "1-Year MBA | Master of Business Administration Switzerland";

        Assert.assertEquals(actualTitle, expectedTitle, "Verify the page title.");

    }



    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

