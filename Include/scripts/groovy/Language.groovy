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



class Language {
	
	/**
	 * Below is for add language feature
	 *
	 */
	
	@Given("user navigate to Language page")
	def navigateToLanguagePage() {
		WebUI.callTestCase(findTestCase('PROJECT WEB/common/Login/Positive/login-with-valid-credential'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.mouseOver(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/a_Qualifications'))
		WebUI.click(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/a_Languages'))
	}

	@When("user click on add language button")
	def clickOnAddButton() {
		WebUI.click(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/input_Languages_btnAdd'))
	}

	@And("user enters language (.*)")
	def enterLanguage(String language) {
		WebUI.setText(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/input__languagename'), language)
	}

	@And("user click on save language button")
	def clickOnSaveLanguageButton() {
		WebUI.click(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/input__btnSave'))
	}

	@Then("user should be able to add new language successfully")
	def verifyAddNewLanguage() {
		WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/div_Successfully Saved       Close'), 5)
		WebUI.closeBrowser()
	}

	@And("user enters same language (.*)")
	def enterSameLanguage(String language) {
		WebUI.setText(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/input__languagename'), language)
	}

	@Then("language already exists message will appear")
	def verifyLanguageAlreadyExists() {
		WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/div_Name Already Exists       Close'), 5)
		WebUI.closeBrowser()
	}

	@Then("input required message will appear")
	def verifyInputRequiredMessage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/span_Required'), 5)
		WebUI.closeBrowser()
	}

	/**
	 * Below is for delete language feature
	 *
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

	@When("user select more than one language checkbox")
	def selectMultipleCheckbox() {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/checkBoxMandarin'))
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/checkBoxThai'))
	}

	@Then("user should be able to delete multiple language successfully")
	def verifyDeleteMultipleLanguage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/div_Successfully Deleted       Close'), 5)
		WebUI.closeBrowser()
	}

	/**
	 * Below is for edit existing language feature
	 *
	 */

	@When("user click on language name")
	def clickOnLanguageName() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/a_Arabic'))
	}

	@And("user rename the language name")
	def renameLanguageName() {
		WebUI.doubleClick(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input__languagename'))
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input__languagename'),'Mandarin')
	}

	@Then("user should be able to rename the language")
	def verifyRenameLanguage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/div_Successfully Saved       Close'), 5)
		WebUI.closeBrowser()
	}

	@And("user rename the language name with existing language")
	def renameWithExistsLanguageName() {
		WebUI.doubleClick(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input__languagename'))
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input__languagename'),'English')
	}
	
	@And("user leave the form blank")
	def leaveTheFormBlank() {
		WebUI.doubleClick(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input__languagename'))
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Language/Page_OrangeHRM/input__languagename'),'')
	}
}