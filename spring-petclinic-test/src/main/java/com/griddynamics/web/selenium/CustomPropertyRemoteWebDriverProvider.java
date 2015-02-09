package com.griddynamics.web.selenium;

import org.jbehave.web.selenium.RemoteWebDriverProvider;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CustomPropertyRemoteWebDriverProvider extends RemoteWebDriverProvider {

    @Override
    protected DesiredCapabilities makeDesiredCapabilities() {

        DesiredCapabilities desiredCapabilities = super.makeDesiredCapabilities();

        FirefoxProfile profile = new FirefoxProfile();

        profile.setPreference("app.update.enabled", false);
        profile.setPreference("app.update.auto", false);
        profile.setPreference("browser.search.update", false);
        profile.setPreference("extensions.update.enabled", false);
        profile.setPreference("app.update.checkInstallTime", false);
        profile.setPreference("extensions.update.autoUpdateDefault", false);
        profile.setPreference("lightweightThemes.update.enabled", false);

        desiredCapabilities.setCapability(FirefoxDriver.PROFILE, profile);

        return desiredCapabilities;
    }
}
