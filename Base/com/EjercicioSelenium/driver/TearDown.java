package com.EjercicioSelenium.driver;

import org.apache.commons.io.FileUtils;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TearDown {

    private WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }
    
    @After
    public void quitDriver(Scenario scenario) throws Exception{
 
    	this.takeSnapShot(driver, "EjercicioBaufest\\Screenshots\\test.png") ; 
        this.driver.quit();
    }

    public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}