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

WebUI.callTestCase(findTestCase('Transaction/T07 - Information Page - Fill Form - Continue'), [('first_name') : 'Ruth', ('last_name') : 'Silalahi'
        , ('postal_code') : '63411'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Transaction/Checkout - Overview/Page_Swag Labs/item_container'))

WebUI.verifyElementVisible(findTestObject('Transaction/Checkout - Overview/label_Price Total'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Transaction/Checkout - Complete/button_Finish'))

WebUI.verifyElementVisible(findTestObject('Transaction/Checkout - Complete/span_Checkout Complete'))

WebUI.verifyElementVisible(findTestObject('Transaction/Checkout - Complete/h2_Thank you for your order'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Transaction/Checkout - Complete/button_Back Home'))

