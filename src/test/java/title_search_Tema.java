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
        driver.findElement(By.xpath("//button[contains(text(), 'Agree & Proceed')]"));;
    }

    @Test
    public void searchTest() {


        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "1-Year MBA | Master of Business Administration Switzerland";

        Assert.assertEquals(actualTitle, expectedTitle, "Verify the page title.");

    }
    @Test
    public void searchTest2() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title is: " + actualTitle);

        Assert.assertNotNull(actualTitle, "The page title should not be null.");

        Assert.assertFalse(actualTitle.isEmpty(), "The page title should not be empty.");

        String keyword = "MBA";
        Assert.assertTrue(actualTitle.contains(keyword),
                "The title does not contain the expected keyword: " + keyword);
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

