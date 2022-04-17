import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PROJECT WEB/common/Login/Positive/login-with-valid-credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('PROJECT WEB/User/Page_OrangeHRM/b_Admin'))

WebUI.mouseOver(findTestObject('PROJECT WEB/User/Page_OrangeHRM/a_User Management'))

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/a_Users'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/User/Page_OrangeHRM/verify system users'), 5)

WebUI.setText(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input_Employee input_searchEmployeeName'), 'Harry Kane')

WebUI.sendKeys(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input_Employee input_searchEmployeeName'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/search button'))

WebUI.check(findTestObject('PROJECT WEB/User/Page_OrangeHRM/usernameCheckBox', [('username') : 'HarryKane2']))

WebUI.check(findTestObject('PROJECT WEB/User/Page_OrangeHRM/usernameCheckBox', [('username') : 'HarryKane3']))

WebUI.check(findTestObject('PROJECT WEB/User/Page_OrangeHRM/usernameCheckBox', [('username') : 'HarryKane4']))

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input_Status_btnDelete'))

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dialogDeleteBtn'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/User/Page_OrangeHRM/div_Successfully Deleted       Close'), 5)

WebUI.closeBrowser()

