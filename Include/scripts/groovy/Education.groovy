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



class Education {

	/**
	 * Below is add education level
	 * 
	 * 
	 */

	@Given("user navigate to education page")
	def navigateToEducationPage() {
		WebUI.callTestCase(findTestCase('PROJECT WEB/common/Login/Positive/login-with-valid-credential'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.mouseOver(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/a_Qualifications'))
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/a_Education'))
	}

	@When("user click on add education button")
	def clickOnAddEducationButton() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input_Education_btnAdd'))
	}

	@And("user enter education level name (.*)")
	def enterEducation(String education) {
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input__educationname'), education)
	}

	@And("user click on save education button")
	def clickOnSaveEducationButton() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input__btnSave'))
	}

	@Then("user should be able to add new education level successfully")
	def verifyAddNewLanguage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/div_Successfully Saved       Close'), 5)
		WebUI.closeBrowser()
	}

	@Then("education level already exists message will appear")
	def verifyEducationLevelAlreadyExists() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/div_Level Already Exists       Close'), 5)
		WebUI.closeBrowser()
	}

	@Then("education level input required message will appear")
	def verifyEducationLevelRequired() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/span_Required'), 5)
		WebUI.closeBrowser()
	}

	/**
	 * Below is delete education level
	 *
	 *
	 */

	@When("user select an education level")
	def selectAnEducationLevel() {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/checkBtnFirst'))
	}

	@And("user click on delete education level button")
	def clickOnDeleteEducationButton() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input_Education_btnDel'))
	}

	@Then("user should be able to delete an education level successfully")
	def verifyDeleteEducationLevel() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/div_Successfully Deleted       Close'), 5)
		WebUI.closeBrowser()
	}

	@When("user select more than one education level")
	def selectMoreThanOneEducationLevel() {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/checkBtn2nd'))
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/checkBtn3rd'))
	}

	@Then("user should be able to delete more than one education level successfully")
	def verifyDeleteMoreThanOneEducationLevel() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/div_Successfully Deleted       Close'), 5)
		WebUI.closeBrowser()
	}

	/**
	 * Below is edit education level
	 *
	 *
	 */

	@When("user select an existing education level (.*)")
	def selectExistingEducationLevel(String education) {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/educationLevel' , ['educationLevel' : education]))
	}

	@And("user rename the education level")
	def renameEducationLevel() {
		WebUI.doubleClick(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input__educationname'))
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input__educationname'),'Sijil Pelajaran Malaysia')
	}

	@Then("user should be able to rename the education level successfully")
	def verifyRenameEducationLevel() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/div_Successfully Updated       Close'), 5)
		WebUI.closeBrowser()
	}

	@And("user rename the education level with existing education level (.*)")
	def renameEducationLevelWithExisting(String existingEducation) {
		WebUI.doubleClick(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input__educationname'))
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/input__educationname'), existingEducation)
	}
	
	@Then("education level already exists message is displayed")
	def verifyExistsEducationLevel() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Education/Page_OrangeHRM/div_Level Already Exists       Close'), 5)
		WebUI.closeBrowser()
	}
}