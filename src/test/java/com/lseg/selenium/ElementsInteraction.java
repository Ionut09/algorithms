package com.lseg.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class ElementsInteraction {

    private WebDriver driver;

    private ChromeOptions options;

    private Wait wait;

    @BeforeClass //rulat inaintea tuturor metodelor de tests (cu  @Test)
    // si inaintea celei cu @BeforeMethod
    public void setup1() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod //rulat inaintea fiecarei metode de test
    public void setup() {
        System.out.println("BeforeMethod");
        options = new ChromeOptions();
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                                       .pollingEvery(Duration.ofSeconds(1))
                                       .ignoring(NoSuchElementException.class);
    }

    @AfterMethod
    public void closeEverything() {
        driver.close();
    }

    @Test
    public void testTitle() {
        navigate("https://www.calculator.net/");
        String title = driver.getTitle();
        sleep(2000);
        assertEquals(title, "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
    }

    @Test
    @Parameters
    public void findingElements() {
        navigate("https://www.calculator.net/mortgage-calculator.html");

        String mRateData = find(By.id("mRateData")).getText();
        System.out.println(mRateData);
        sleep(1000);
        String printit = find(By.name("printit")).getText();

        WebElement checkBox = find(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span"));
        checkBox.click();
        System.out.println("isEnabled: " + checkBox.isEnabled()); //disabled attribute --> disabled == null || disabled == false
        System.out.println("disabled attribute: " + checkBox.getAttribute("disabled"));

        System.out.println("isSelected: " + checkBox.isSelected());
        System.out.println("isEnabled: " + checkBox.isEnabled());

        WebElement cbcontainer = find(By.className("cbcontainer"));
        String attribute = cbcontainer.getAttribute("for");
        System.out.println(attribute);

        WebElement oneDiv = find(By.tagName("div"));
        String src = oneDiv.findElement(By.id("header"))
                           .findElement(By.id("logo"))
                           .findElement(By.tagName("a"))
                           .findElement(By.tagName("img"))
                           .getAttribute("src");

        System.out.println(src);
    }

    @Test
    public void interactingWithElements() {
        navigate("https://www.calculator.net/percent-calculator.html");

        WebElement input1 = new WebDriverWait(driver, 3)
                .until(d -> find(By.id("cpar1")));
        input1.sendKeys("20");

        sleep(1000);
        find(By.id("cpar2")).sendKeys("325");
        sleep(1000);
        find(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
        String actualValue = find(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();

        assertEquals(actualValue, "65");
    }

    @Test
    public void findAnElementWithinADynamicPath() {
        navigate("https://www.cardmarket.com/en/Magic/Products/Singles/Zendikar/Arid-Mesa");
        WebElement tabelWithPrices = find(By.className("table-body"));
        //https://stackoverflow.com/questions/63541972/selenium-how-to-get-all-elements-inside-a-webelement

//      tabelWithPrices.findElements(By.xpath(".//*")) //all sub elements of tabelWithPrices
//                     .forEach(System.out::println);
        String price = tabelWithPrices.findElement(By.tagName("div")) //By tag name intoarce primul tag inatlnit
//        String price = tabelWithPrices.findElement(By.linkText("Bak /// GD")) //
                                      .findElement(By.xpath("//div[3]/div[1]/div/div/span"))
                                      .getText();
//        sleep(1000000);
        System.out.println("price = " + price);
    }
    //table data
    //

    @Test
    public void calculatePercentOfNumber() {
        navigate("https://www.calculator.net/percent-calculator.html");

        WebElement input1 = new WebDriverWait(driver, 3)
                                .until(d -> find(By.id("cpar1")));
        input1.sendKeys("19");

        sleep(1000);
        find(By.id("cpar2")).sendKeys("35000");
        sleep(1000);

        find(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
        String actualValue1 = find(By.xpath("//*[@id=\"content\"]/h2[1]")).getText();
        String actualValue2 = find(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();
        String actualValue3 = find(By.xpath("//*[@id=\"content\"]/p[3]/*")).getText();

        assertEquals(actualValue1.substring(actualValue1.length() - 4), "6650");
        assertEquals(actualValue2, "6650");

        //primesc eroare : The result of the xpath expression "//*[@id="content"]/p[3]/text()" is: [object Text]. It should be an element.
        WebElement content = find(By.xpath("//*[@id=\"content\"]"));
        content.findElements(By.tagName("p"))
               .stream()
               .map(WebElement::getText)
               .filter(s -> s.matches("(\\d+)%\\s(of).*"))
               .map(s -> s.substring(s.indexOf("= ") + 2))
               .forEach(System.out::println);

        //assertEquals(actualValue3.substring(actualValue1.length()-4), "6650");

    }

    private WebElement find(By by) {
        return driver.findElement(by);
    }

    private void navigate(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }


    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
