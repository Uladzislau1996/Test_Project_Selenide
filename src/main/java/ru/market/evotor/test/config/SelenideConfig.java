package ru.market.evotor.test.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelenideConfig {

    public static final String SIZE = "3600x3600";
    public static final String BASE_URL = "https://market.evotor.ru/";
    public static final String BROWSER = "chrome";

    public static void config () {
        Configuration.browser = BROWSER;
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.browserSize = SIZE;
        Configuration.baseUrl = BASE_URL;
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
    }

}
