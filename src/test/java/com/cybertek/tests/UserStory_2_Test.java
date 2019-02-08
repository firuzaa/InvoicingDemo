package com.cybertek.tests;

import com.cybertek.pages.UserStory_2;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class UserStory_2_Test extends TestBase {

    public UserStory_2 userStory_2;

    @Test
    public void test1(){
        userStory_2 = new UserStory_2();

        BrowserUtils.wait(5);
        userStory_2.createBtn.click();
    }
}
