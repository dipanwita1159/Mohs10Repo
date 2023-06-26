package com.mohs10.ActionDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import com.mohs10.base.StartBrowser;

public class Validation extends StartBrowser {


	
	    public static void pageTittleValidation() {
	       
	        // Validate the page title
	        String expectedTitle = "https://mohs10.io/who-we-are/"; // Replace with the expected title of the page
	        try {
	        	 // Set the timeout duration
	            Duration timeout = Duration.ofSeconds(10);

	            // Wait for the title to be present
	            FluentWait<WebDriver> wait = new WebDriverWait(driver, timeout)
	                    .withTimeout(timeout)
	                    .ignoring(Exception.class);
	            wait.until(ExpectedConditions.titleContains(expectedTitle));
	            // Get the actual title of the page
	            String actualTitle = driver.getTitle();

	            // Compare the expected and actual titles
	            if (actualTitle.contains(expectedTitle)) {
	                System.out.println("Page validation successful!");
	            } else {
	                System.out.println("Page validation failed! Expected: " + expectedTitle + ", Actual: " + actualTitle);
	            }
	        } catch (Exception e) {
	            System.out.println("Page validation failed with error: " + e.getMessage());
	        }

	    }
	    public static void pagetextValidation(String msg) {
	    	String pageSource = driver.getPageSource();

	        // Validate the presence of the expected text
	        String expectedText = msg;
	        boolean isTextPresent = pageSource.contains(expectedText);

	        if (isTextPresent) {
	            System.out.println("Text '" + expectedText + "' is present on the page.");
	        } else {
	            System.out.println("Text '" + expectedText + "' is not present on the page.");
	        }
	     // Highlight the element containing the expected text
            highlightElement(driver, By.xpath("//*[contains(text(),'" + msg + "')]"));
	    }
       
   

    public static void highlightElement(WebDriver driver, By locator) {
        // Find the element to highlight
        WebElement element = driver.findElement(locator);

        // Execute JavaScript to highlight the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    

	    }
	}




