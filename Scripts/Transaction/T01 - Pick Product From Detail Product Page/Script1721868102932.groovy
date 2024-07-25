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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://www.saucedemo.com/')
//
//WebUI.maximizeWindow()
//
//WebUI.setText(findTestObject('Object Repository/Login-Page/input_username'), username)
//
//WebUI.setText(findTestObject('Object Repository/Login-Page/input_password'), password)
//
//WebUI.click(findTestObject('Object Repository/Login-Page/login-button'))
WebUI.callTestCase(findTestCase('Login/L01 - Login Success'), [('username') : 'standard_user', ('password') : 'secret_sauce'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Transaction/Inventory-page/product_name', [('product_name') : product_name]))

WebUI.verifyElementVisible(findTestObject('Transaction/Inventory-item-page/label_product_name_detail_page'))

WebUI.verifyElementVisible(findTestObject('Transaction/Inventory-item-page/button_Add to cart - item page'))

WebUI.click(findTestObject('Transaction/Inventory-item-page/button_Add to cart - item page'))

WebUI.verifyElementVisible(findTestObject('Transaction/General/label_shopping_cart_badge'))

WebUI.takeFullPageScreenshot()

