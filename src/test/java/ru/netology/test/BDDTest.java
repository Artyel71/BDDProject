package ru.netology.test;


import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.LoginPageV1;

import static com.codeborne.selenide.Selenide.open;


public class BDDTest {

    @Test
    void shouldTransferMoneyBetweenOwnCards() {
        open("http://localhost:9999");
        var loginData = DataHelper.getAuthInfo();

        new LoginPageV1()
                .validLogin(loginData)
                .validVerify(DataHelper.getVerificationCodeFor(loginData));

    }
}
