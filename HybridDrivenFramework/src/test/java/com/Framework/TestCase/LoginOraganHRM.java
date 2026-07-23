package com.Framework.TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import utility.ExcelDataReader;

public class LoginOraganHRM extends BaseClass {

    @Test
    public void loginApp() throws Exception {

        ExcelDataReader excel = new ExcelDataReader();

        String username = excel.getStringData("LoginHRM", 0, 0);
        String password = excel.getStringData("LoginHRM", 0, 1);

        LoginPage loginHRM = PageFactory.initElements(driver, LoginPage.class);

        loginHRM.LoginHRM(username, password);

        Thread.sleep(5000);
    }
}