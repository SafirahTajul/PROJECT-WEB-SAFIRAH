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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), GlobalVariable.Username)

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Username_txtPassword'), GlobalVariable.Password)

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/a_Reports'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/td_Employee Skill'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Report Name_btnDelete'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dialogDeleteBtn'))

WebUI.verifyElementText(findTestObject('PROJECT WEB/Page_OrangeHRM/div_Successfully Deleted       Close'), 'Successfully Deleted')

WebUI.closeBrowser()

