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

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/a_Organization'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/a_General Information'))

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input__btnSaveGenInfo'))

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input__organizationname'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Tax ID_organizationtaxId'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Registration Number_organizationregistraionNumber'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Phone_organizationphone'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Fax_organizationfax'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Email_organizationemail'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Address Street 1_organizationstreet1'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_Address Street 2_organizationstreet2'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_City_organizationcity'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_StateProvince_organizationprovince'), '')

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/input_ZipPostal Code_organizationzipCode'), '')

WebUI.selectOptionByValue(findTestObject('PROJECT WEB/Page_OrangeHRM/select_-- Select --AfghanistanAlbaniaAlgeri_3356b1'), 
    '0', false)

WebUI.setText(findTestObject('PROJECT WEB/Page_OrangeHRM/textarea_HRM Software'), '')

WebUI.click(findTestObject('PROJECT WEB/Page_OrangeHRM/input__btnSaveGenInfo'))

WebUI.verifyElementText(findTestObject('PROJECT WEB/Page_OrangeHRM/span_Required'), 'Required')

WebUI.closeBrowser()

