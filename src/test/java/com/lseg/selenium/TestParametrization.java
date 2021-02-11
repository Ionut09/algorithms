package com.lseg.selenium;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import lombok.SneakyThrows;

import static java.lang.Double.parseDouble;
import static java.lang.System.out;
import static org.testng.Assert.assertEquals;

public class TestParametrization {

    private static final String[] HEADERS = {"TestName", "num1", "num2", "result"};

    private static WebDriver driver;

    private static ChromeOptions options;

    private static Wait wait;

    @BeforeClass
    public static void setup() {
        options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                                       .pollingEvery(Duration.ofSeconds(1))
                                       .ignoring(NoSuchElementException.class);
    }

    @AfterClass
    public static void closeEverything() {
        driver.close();
    }

    @DataProvider(name = "excelFileProvider")
    public Object[][] excelFileProvider() {
        Object[][] parameters;
        try (FileInputStream inputStream = new FileInputStream("./src/test/resources/percent.xlsx")) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet percentSheet = workbook.getSheet("percent");

            int physicalNumberOfRows = percentSheet.getPhysicalNumberOfRows();

            int numberOfParameters = getNumberOfParametersOfMethod("parameterizedTest");
            parameters = new Object[physicalNumberOfRows - 1][numberOfParameters];

            for (int i = 1; i < physicalNumberOfRows; i++) {
                for (int j = 1; j <= numberOfParameters; j++) {
                    double value = percentSheet.getRow(i).getCell(j).getNumericCellValue();
                    out.print(value + " ");
                    parameters[i - 1][j - 1] = value;
                }
                out.println();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return parameters;
    }

    @DataProvider(name = "csvFileProvider")
    public Object[][] csvFileProvider() {
        Object[][] parameters;

        try (Reader reader = new FileReader("./src/test/resources/percent.csv")) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader(HEADERS)
                                                           .withFirstRecordAsHeader()
                                                           .parse(reader);

            int numberOfParameters = getNumberOfParametersOfMethod("parameterizedTest");
            parameters = new Object[6][numberOfParameters];
            int i = 0;

            for (CSVRecord record : records) {
                parameters[i][0] = parseDouble(record.get("num1"));
                parameters[i][1] = parseDouble(record.get("num2"));
                parameters[i][2] = parseDouble(record.get("result"));
                i++;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return parameters;
    }


    @Test(dataProvider = "excelFileProvider")
//  @Parameters(value = {"19", "35000", "6650"})
    public void parameterizedTest(double percent, double number, double result) {

        navigate("https://www.calculator.net/percent-calculator.html");
        WebElement input1 = new WebDriverWait(driver, 3)
                .until(d -> find(By.id("cpar1")));
        input1.sendKeys(percent + "");

        find(By.id("cpar2")).sendKeys(number + "");
        find(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();

        String actualValue2 = find(By.xpath("//*[@id=\"content\"]/p[2]/font/b")).getText();
        assertEquals(parseDouble(actualValue2), result);
    }


    private int getNumberOfParametersOfMethod(String methodName) {
        return Arrays.stream(getClass().getMethods())
                     .filter(method -> method.getName().equals(methodName))
                     .findFirst()
                     .map(Method::getParameterCount)
                     .orElseThrow();
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

    private static void printMembers(Member[] mbrs, String s) {
        out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Method)
                out.format("  %s%n", ((Method) mbr).toGenericString());
            out.format("  %s%n", ((Method) mbr).getName());
        }
        if (mbrs.length == 0)
            out.format("  -- No %s --%n", s);
        out.format("%n");
    }
}
