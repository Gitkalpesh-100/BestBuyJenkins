package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidataBottomLinksPage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC05_ValidateBottomLinks extends ProjectSpecifications {
	@BeforeTest()
	public void setup() {
		sheetName = "ValidatBottomLinks";// same name for the sheet in excel sheet
	}

	@Test(dataProvider = "getInputData")
	public void validateBottomLinks() {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll();

		ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();

		List<WebElement> menuLink = vbl.getbottomlinkname();

		for (WebElement menuItem : menuLink) {

			menuItem.click();
		}
	}
}