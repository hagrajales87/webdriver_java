package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPassword extends BaseTests {

    @Test
    public void testRetrievePassword()
    {
        var forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmailField("tau@example.com");
        var retrievePasswordPage = forgotPassword.clickButton();
        assertEquals(retrievePasswordPage.getMessage(), "Your e-mail's been sent!",
                "Message Incorrect!!!");

    }

}
