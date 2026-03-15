import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema_4_p1 {
        WebDriver driver;
        WebDriverWait wait;


        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            driver.get("https://practicesoftwaretesting.com");
            driver.manage().window().maximize();
        }

    @Test
    //Verificare titlu&logo
    public void title_T(){
        Assert.assertEquals("Practice Software Testing - Toolshop - v5.0", driver.getTitle(), "Titlul nu este cel corect" );

        WebElement logo = driver.findElement(By.id("Layer_1"));
        Assert.assertTrue(logo.isDisplayed(), "Logo nu este vizibil" );
    }

    @Test
    //cautare produs
    public void prodSearch(){
        WebElement searchbar = driver.findElement(By.id("search-query"));
        searchbar.sendKeys("hammer");
        searchbar.sendKeys(Keys.ENTER);
        WebElement rezultat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Sledgehammer')]")));
        int count = driver.findElements(By.xpath("//*[contains(text(), 'hammer')]")).size();
        Assert.assertTrue(count > 0, "Nu avem ciocane");
    }

    @Test
    //verificare produs plus carucior
    public void lazyCardClick(){
        WebElement listProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='card']")));
        listProducts.click();
        WebElement poza = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='figure-img img-fluid']")));
        Assert.assertTrue(poza.isDisplayed(), "Zambeste la aparat");
        WebElement carucior = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-add-to-cart']")));
        Assert.assertTrue(carucior.isDisplayed(),"Merge la Lidl ca astia nu au carucioare");
    }

    @Test
    // filtre
    public void filtre() {
        WebElement brand = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'MightyCraft Hardware')]")));
        WebElement clickbox = driver.findElement(By.xpath("//label[contains(text(), 'MightyCraft Hardware')]/input"));
        clickbox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-title")));
        int count = driver.findElements(By.cssSelector(".card")).size();
        System.out.println("La ghici domnu cu mila ca am ajuns la CSS selctor " + count);
        Assert.assertTrue(count > 0, "404");
        WebElement firstResultTitle = driver.findElement(By.cssSelector(".card-title"));
        Assert.assertTrue(firstResultTitle.isDisplayed());


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}