package com.griddynamics.web.selenium;

import org.jbehave.web.selenium.PropertyWebDriverProvider;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CustomPropertyWebDriverProvider extends PropertyWebDriverProvider {

    @Override
    protected FirefoxDriver createFirefoxDriver() {

        FirefoxProfile profile = new FirefoxProfile();

        profile.setPreference("app.update.enabled", false);
        profile.setPreference("app.update.auto", false);
        profile.setPreference("browser.search.update", false);
        profile.setPreference("extensions.update.enabled", false);
        profile.setPreference("app.update.checkInstallTime", false);
        profile.setPreference("extensions.update.autoUpdateDefault", false);
        profile.setPreference("lightweightThemes.update.enabled", false);

        return new FirefoxDriver(profile);
    }
}
