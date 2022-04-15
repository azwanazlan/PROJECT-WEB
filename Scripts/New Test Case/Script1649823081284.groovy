import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'akaza')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'sWNoLOHkpmUBnZKdu6lwUA==')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))

WebUI.verifyAlertPresent(5)

WebDriver driver = DriverFactory.getWebDriver()

String getMessage = driver.switchTo().alert().getText()

WebUI.verifyEqual(getMessage, 'Wrong password.')

WebUI.closeBrowser()

