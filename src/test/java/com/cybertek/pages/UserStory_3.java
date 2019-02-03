package com.cybertek.pages;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_3 {
    public UserStory_3() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[8]/a/span")
    public WebElement invoiceButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[2]/a/span")
    public WebElement masterDataButton;



}
