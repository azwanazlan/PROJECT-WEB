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



class JobCategories {


	/**
	 * Successfully add new job category
	 * 
	 */


	@Given("users navigate to job categories page")
	def navigateToJobCategoryPage() {
		WebUI.callTestCase(findTestCase('PROJECT WEB/common/Login/Positive/login-with-valid-credential'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.mouseOver(findTestObject('PROJECT WEB/Language/Page_OrangeHRM/b_Admin'))
		WebUI.mouseOver(findTestObject('Object Repository/PROJECT WEB/Job Categories/Job'))
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Job Categories/Job Categories'))
	}

	@When("users click on add job category button")
	def addJobCategory( ) {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Job Categories/input_Job Categories_btnAdd'))
	}

	@And("users enter job category name (.*)")
	def enterJobCategoryName(String jobCategories) {
		WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Job Categories/Job category name'), jobCategories)
	}

	@And("users click on save job category button")
	def saveJobCategoryName() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Job Categories/save button'))
	}

	@Then("users should be able to add new job category")
	def verifyAddNewJobCategory() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Job Categories/Sucessfully saved'), 5)
		WebUI.closeBrowser()
	}

	@Then("job category name already exists message will appear")
	def verifyJobCategoryExists() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Job Categories/span_Already exists'), 5)
		WebUI.closeBrowser()
	}


	/**
	 * 
	 * Below is for delete job category
	 */


	@When("users select a job category")
	def selectAJobCategory( ) {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Job Categories/checkBoxJob', ['job':'Admin']))
	}

	@And("users click on delete job category button")
	def deleteJobCategory() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Job Categories/input_Job Categories_btnDelete'))
	}

	@And("users click on delete job category confirmation button")
	def deleteJobCategoryConfirmation() {
		WebUI.click(findTestObject('Object Repository/PROJECT WEB/Job Categories/confirmationDeleteButton'))
	}

	@Then("users should be able to delete a job category")
	def verifyAJobCategoryDelete() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Job Categories/div_Successfully Deleted       Close'), 5)
		WebUI.closeBrowser()
	}

	@When("users select more than one job category")
	def selectMoreThanOneJobCategory( ) {
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Job Categories/checkBoxJob', ['job':'IT']))
		WebUI.check(findTestObject('Object Repository/PROJECT WEB/Job Categories/checkBoxJob', ['job':'Engineer']))
	}

	@Then("users should be able to delete more than one job category")
	def verifyMoreThanOneJobCategoryDelete() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PROJECT WEB/Job Categories/div_Successfully Deleted       Close'), 5)
		WebUI.closeBrowser()
	}
}