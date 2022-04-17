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

WebUI.mouseOver(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/a_Employee List'))

WebUI.setText(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/input_EmployeeName'), findTestData('add employee').getValue(
        3, 1))

WebUI.sendKeys(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/input_EmployeeName'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/searchButton'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/a_employeeName', [('employeeFirstName') : findTestData(
                'add employee').getValue(1, 1), ('employeeSecondName') : findTestData('add employee').getValue(1, 2)]), 
    5)

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/checkBoxFirst'))

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/btnDelete'))

WebUI.click(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/BtnConfirmationDelete'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/Employee List/Page_OrangeHRM/div_Successfully Deleted       Close'), 
    5)

WebUI.closeBrowser()

