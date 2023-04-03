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

'Delete all cookies after browser is opened'
WebUI.deleteAllCookies()

WebUI.navigateToUrl(baseUrl)

'Set viewport size 1280x800'
WebUI.setViewPortSize(1440, 735)

WebUI.setText(findTestObject('Object Repository/Page_Your Store/input_Your Store_search'), productToSearch)

WebUI.sendKeys(findTestObject('Object Repository/Page_Your Store/input_Your Store_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search - macbook/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Search - macbook/button_1 item(s) - 602.00'))

WebUI.click(findTestObject('Object Repository/Page_Search - macbook/strong_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_E-Mail_email'), correo)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Forgotten Password_button-login'))

WebUI.click(findTestObject('Page_Checkout/input_Region  State_button-payment-address'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Terms  Conditions_agree'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Terms  Conditions_button-payment-method'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Please transfer the total amount to t_a6d3bd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Your order has been placed/h1_Your order has been placed'), 
    0)

WebUI.closeBrowser()

