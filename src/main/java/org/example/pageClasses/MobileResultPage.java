package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MobileResultPage {

    private WebDriver webDriver;


    public MobileResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


   public void serachResults() {

        int count=0;

        List<WebElement>mobileSearchResults=webDriver.
                findElements(By.className("s-item__title"));


        for (WebElement webElements :mobileSearchResults.subList(0, Math.min(5, mobileSearchResults.size()))){

            String selectedText = webElements.getText();


                if (selectedText.contains("Mobile Phone") || selectedText.contains("Mobile Phones")  ) {
                    System.out.println("Element " + (count + 1) + " belongs to the 'Mobile Phones' category.");
                } else {
                    System.out.println("Element " + (count + 1) + " does not belong to the 'Mobile Phones' category.");
                }
            count++;

        }








    }








}
