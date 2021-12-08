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

WebUI.navigateToUrl('https://vimeo.com/')

WebUI.click(findTestObject('Object Repository/Page_Vimeo  The worlds only all-in-one vide_2822c6/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Vimeo  The worlds only all-in-one vide_2822c6/input_Log in to Vimeo_email'), 
    'naamanijer2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vimeo  The worlds only all-in-one vide_2822c6/input_Log in to Vimeo_password'), 
    'crZ8lHGJNSNwm4Mc1WZ8ZQ==')

WebUI.click(findTestObject('Object Repository/Page_Vimeo  The worlds only all-in-one vide_2822c6/input_A security code has been sent to your_7a5454'))

WebUI.setText(findTestObject('Object Repository/Page_Videos on Vimeo/input_Upgrade_topnav-search'), 'chocolate cake')

WebUI.click(findTestObject('Object Repository/Page_chocolate cake in videos on Vimeo/div_10 years ago5500439'))

WebUI.click(findTestObject('Object Repository/Page_Chocolate Cake on Vimeo/svg_Show more_sc-gxMtzJ jydGD'))

WebUI.click(findTestObject('Object Repository/Page_Chocolate Cake on Vimeo/div_LIVE_chapters'))

WebUI.click(findTestObject('Object Repository/Page_Chocolate Cake on Vimeo/div_LIVE_chapters'))

WebUI.click(findTestObject('Object Repository/Page_Chocolate Cake on Vimeo/div_Open in app_pause-icon'))

WebUI.closeBrowser()

