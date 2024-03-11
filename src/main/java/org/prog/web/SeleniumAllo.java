package org.prog.web;


import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class SeleniumAllo {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
            //TODO:GO TO GOOGLE
            driver.get("https:www.google.com");

            //TODO:SEARCH ALLO
            WebElement googleSearchBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
            googleSearchBox.sendKeys("Allo" + Keys.ENTER);
            //TODO:CLICK "https://allo.ua/"
            WebElement alloSite = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "//*[@class='tjvcx GvPZzd cHaqb'] ")));
            alloSite.click();
            //TODO:PRINT ON CONSOLE SITE TITLE AND CURRENT URL
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            //TODO CHECK SITE TITLE  CONTAINS "ALLO"
            if (driver.getTitle().contains("Iphone15")) {
                System.out.println("TEST PASSED!");
            } else {
                System.out.println("TEST FAILED!");
            }
            //TODO:PRINT ON CONSOLE SITE WINDOW HANDLE CODE
            String Iphone15Handle = driver.getWindowHandle();
            System.out.println("Iphone15 Handle Code : " + Iphone15Handle);
            //TODO:SEARCH "Iphone 15"
            WebElement searchBoxAllo = driver.findElement(By.xpath("//*[@class='product-card']"));
            searchBoxAllo.sendKeys("ALLO" + Keys.ENTER);
            //TODO:CONFIRM SEARCH RESULT CONTAIN "Iphone 15"
            WebElement Iphone15Search = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='product-card']")));
            if (Iphone15Search.getText().contains("Iphone")) {
                System.out.println("TEST PASSED!");
            } else {
                System.out.println("TEST FAILED!");
            }
            //TODO:PRINT FIRST SEARCH RESULT
            WebElement firstElementIphone15 = driver.findElement(By.xpath("Apple iPhone 15 Pro Max 256GB Natural Titanium (MU793)"));
            System.out.println(firstElementIphone15.getText());
            //TODO:GO AGAIN MAIN PAGE ALLO
            WebElement allo = driver.findElement(By.xpath("//*[@class='tjvcx GvPZzd cHaqb'] "));
            allo.click();
        } finally {
            driver.quit();
        }
    }
}



