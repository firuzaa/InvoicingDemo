package com.cybertek.tests;

import com.cybertek.pages.UserStory_1;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserStory_1_Test extends TestBase {

    public UserStory_1 userStory_1;

    @Test
    public void filter_1() {

        userStory_1 = new UserStory_1();

        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        BrowserUtils.wait(5);
        userStory_1.filterBtn.click();

        assertTrue(userStory_1.draft_btn.isDisplayed());
        assertTrue(userStory_1.open_btn.isDisplayed());
    }

    @Test
    public void openOption() {

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.open_btn, 10).click();
        BrowserUtils.wait(5);

        for (int i = 1; i <= 9; i++) {

            String actual_result = Driver.getDriver().findElement(By.xpath(userStory_1.verifyStatus(i))).getText();
            assertEquals(actual_result, "Open");
        }


    }

    @Test
    public void verifyDraftOption() {

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.draft_btn, 10).click();
        BrowserUtils.wait(5);

        for (int i = 1; i <= 2; i++) {

            String actual_result = Driver.getDriver().findElement(By.xpath(userStory_1.verifyStatus(i))).getText();
            assertEquals(actual_result, "Draft");
        }


    }
}
