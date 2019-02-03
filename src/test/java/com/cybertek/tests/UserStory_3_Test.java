package com.cybertek.tests;

import com.cybertek.pages.UserStory_3;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class UserStory_3_Test extends TestBase {
    public UserStory_3 userStory_3;

    @Test
    public void masterData() {
        userStory_3 = new UserStory_3();

        userStory_3.invoiceButton.click();
        userStory_3.masterDataButton.click();
    }
}
