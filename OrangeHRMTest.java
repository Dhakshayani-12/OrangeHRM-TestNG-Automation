package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRMTest {

@Test
public void addSearchAndDeleteEmployeeTest() throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

// LOGIN
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();

// OPEN PIM
wait.until(ExpectedConditions.visibilityOfElementLocated(
By.xpath("//span[text()='PIM']"))).click();

// CLICK ADD EMPLOYEE
wait.until(ExpectedConditions.elementToBeClickable(
By.xpath("//button[normalize-space()='Add']"))).click();

// WAIT FOR FORM
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

// ENTER DETAILS
driver.findElement(By.name("firstName")).sendKeys("Dhakshi");
driver.findElement(By.name("lastName")).sendKeys("Veeranki");

// SCROLL
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,300)");

// SAVE EMPLOYEE
wait.until(ExpectedConditions.elementToBeClickable(
By.xpath("//button[normalize-space()='Save']"))).click();

// VERIFY SAVE
wait.until(ExpectedConditions.visibilityOfElementLocated(
By.xpath("//h6[text()='Personal Details']")));

// GO TO EMPLOYEE LIST
wait.until(ExpectedConditions.elementToBeClickable(
By.xpath("//a[text()='Employee List']"))).click();

// SEARCH EMPLOYEE
wait.until(ExpectedConditions.visibilityOfElementLocated(
By.xpath("(//input[@placeholder='Type for hints...'])[1]")))
.sendKeys("Dhakshi");

// CLICK SEARCH
driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();

// WAIT FOR RESULT
wait.until(ExpectedConditions.visibilityOfElementLocated(
By.xpath("//div[@class='oxd-table-body']")));


// =======================
// DELETE EMPLOYEE
// =======================

// CLICK DELETE ICON OF FIRST ROW
wait.until(ExpectedConditions.elementToBeClickable(
By.xpath("(//button[i[contains(@class,'bi-trash')]])[1]"))).click();

// CONFIRM DELETE
wait.until(ExpectedConditions.elementToBeClickable(
By.xpath("//button[normalize-space()='Yes, Delete']"))).click();

// WAIT SMALL TIME
Thread.sleep(2000);

// CLOSE BROWSER
driver.quit();

}

}