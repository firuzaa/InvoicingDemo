package com.cybertek.tests;

import com.cybertek.pages.UserStory_1;
import com.cybertek.pages.UserStory_8;
import com.cybertek.pages.loginPages.HomePage;
import com.cybertek.pages.loginPages.LogInPage;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_8_Test {
    public UserStory_8 userStory_8;

    @Test
    public void TestCase_01() throws InterruptedException {
        userStory_8 = new UserStory_8();

        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        Thread.sleep(5000);
        homePage.invoicingBtn.click();
        Thread.sleep(5000);
        Assert.assertTrue(userStory_8.DocumentsOptions.isDisplayed());
    }
    @Test
    public void TestCase_02() throws InterruptedException{
        userStory_8 = new UserStory_8();
        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

        HomePage homePage = new HomePage();
        Thread.sleep(5000);
        homePage.invoicingBtn.click();
        Thread.sleep(5000);
        userStory_8.MasterData.click();
        Thread.sleep(5000);
        Assert.assertTrue(userStory_8.MasterDataOptions.isDisplayed());


    }
}
