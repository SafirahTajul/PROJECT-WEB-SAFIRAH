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

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Report Name_btnAdd'))

WebUI.setText(findTestObject('Object Repository/PROJECT WEB/Page_OrangeHRM/input__reportreport_name (1)'), 'Employee Skill')

WebUI.selectOptionByValue(findTestObject('Object Repository/PROJECT WEB/Page_OrangeHRM/select_Employee NamePay GradeEducationEmplo_8a679c (1)'), 
    'skill', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PROJECT WEB/Page_OrangeHRM/select_Personal Contact Details Emergency C_da5165'), 
    'display_group_12', true)

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/a_Add'))

WebUI.click(findTestObject('Object Repository/PROJECT WEB/Page_OrangeHRM/input_Skills (Include Header)_display_groups'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input__btnSave'))

WebUI.verifyElementText(findTestObject('PROJECT WEB/Page_OrangeHRM/div_Successfully Saved       Close'), 'Successfully Saved')

WebUI.closeBrowser()

