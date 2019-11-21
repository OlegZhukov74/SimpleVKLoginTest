package com.vk.qa.other;

import com.vk.qa.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OtherTest extends BaseTest {

    @DataProvider(name = "asd", parallel = true)
    public Object[][] asd() {
        return new Object[][]{
                {"ykmukhj"},
                {"scfdscdf"}
        };
    }

    @Test(dataProvider = "asd")
    public void otherTest1(String b) {
        System.out.println("otherTest1 " + b);
    }

    @Test
    public void otherTest2() {
        System.out.println("otherTest2");
    }
}
