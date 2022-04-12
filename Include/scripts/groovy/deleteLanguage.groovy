import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class deleteLanguage {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("user select a language checkbox")
	def selectACheckbox() {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/checkboxMalay'))
	}

	@And("user click on delete language button")
	def clickOnDeleteLanguageButton() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input_Languages_btnDel'))
	}
	
	@Then("user should be able to delete a language successfully")
	def verifyDeleteALanguage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/div_Successfully Deleted       Close'), 5)
	}
	
	@When("user select multiple language checkbox")
	def selectMultipleCheckbox() {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/checkBoxMandarin'))
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/checkBoxThai'))
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/checkBoxArab'))
	}
	
	@Then("user should be able to delete multiple language successfully")
	def verifyDeleteMultipleLanguage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/div_Successfully Deleted       Close'), 5)
	}
	
}