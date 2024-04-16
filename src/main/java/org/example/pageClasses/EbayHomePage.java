package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayHomePage {

    private WebDriver webDriver;
    public EbayHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setUpHomePage(){
        webDriver.get("https://www.ebay.com/");

    }
    public String homePageUrl(){

        String currentSelectedUrl = webDriver.getCurrentUrl();
        if(!currentSelectedUrl.isEmpty()){
            return currentSelectedUrl;
        }

        throw new RuntimeException();

    }


    public String categorySelect(){

        webDriver.findElement(By.id("gh-shop-a")).click();
        webDriver.findElement(By.linkText("Cell phones & accessories")).click();
        String currentUrl = webDriver.getCurrentUrl();
        if(!currentUrl.isEmpty()){

            return currentUrl;
        }

        throw new RuntimeException();

    }


    public void findMobiles(){

        webDriver.findElement(By.id("gh-ac")).
                sendKeys("Mobile Phone");
        webDriver.findElement(By.id("gh-btn")).click();
    }










}
