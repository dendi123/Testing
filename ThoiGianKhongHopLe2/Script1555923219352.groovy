import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn')

WebUI.click(findTestObject('Object Repository/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/input_a ch email_useremail'), 'hwngvux98@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Mt khu_userpassword'), 'EjEDdN6o7pTQoul/MO4YbQ==')

WebUI.click(findTestObject('Object Repository/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/a_Lp 6'))

WebUI.click(findTestObject('Object Repository/a_Ton c bn v nng cao lp 6 - Tp 1'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/span_Giao bi tp'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('div_S ln lm li'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('ThoiGian/input_Ngy gi bt u_form-control ng-untouched ng-pristine ng-valid'), '8/04/2018')

WebUI.delay(2)

WebUI.setText(findTestObject('ThoiGian/input_Ngy gi kt thc_form-control ng-untouched ng-pristine ng-valid'), '7/04/2018')

WebUI.delay(2)

WebUI.click(findTestObject('input__btn btn-primary'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('LonHonThoiGianKetThuc'))

WebUI.closeBrowser()

