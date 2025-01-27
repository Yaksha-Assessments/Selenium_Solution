package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class socialService_Pages extends StartupPage {

	By usernameTextfield=By.id("username_id");
	By usernameTextbox = By.xpath("//input[@id='username_id']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//button[@id='login']");
	By registeredPatientTextElement = By.xpath("//p[contains(text(), 'Registered Patient')]");	
	By totalDoctorsTextElement = By.xpath("//p[contains(text(), 'Total Doctors')]");	
	By todaysAppointmentTextElement = By.xpath("//p[contains(text(), 'Registered Patient')]");	
	By socialServiceModule = By.xpath("//span[.='SocialService']");	
	By registerNewSSUPatientButton = By.xpath("//a[.=' Register New SSU Patient']");	
	By searchBar = By.id("quickFilterInput");
	By newSSUpatientRegistrationPopup= By.xpath("//div[@class='modelbox-div']");
	By firstNameTextField = By.id("regPatFirstName");
	By middelNameTextField = By.id("MiddleName");
	By lastNameTextField = By.id("LastName");
	By ageTextField = By.id("Age");
	By phoneNumberTextField = By.id("PhoneNo");
	By phoneNumberTextFieldErrorMessage = By.xpath("//span[.='Primary Phone is not proper']");
	By countryDropdown = By.id("ddlCountry");
	By countryDropdownMenuElement = By.xpath("//select[@id='ddlCountry']");
	By selectIndiaIncountryDropdown = By.xpath("//option[.=' India ']");
	By warningMessage = By.xpath("(//span[.='Membership Scheme(s) is Mandatory. '])[2]");
	By hasTG_certificateDropdown = By.id("hasTG_certificate");
	By selectYesFromhasTG_certificateDropdown = By.xpath("(//option[.='Yes'])[2]");
	By addressTextField = By.id("address");
	By patientInformationBar = By.xpath("//h4[@data-target='#patInfoSection']");
	By patientInformationText = By.xpath("//h4[.=' Patient Information ']");	
	By ssuInformationBar = By.xpath("//h4[@data-target='#insuranceInfoSection']");
	By targetGroupDropdown = By.id("TargetGroupId");
	By registerButton = By.id("SaveButton0");
	By newSSUPatientRegistrationFormNameElement = By.xpath("//strong[contains(text(), 'New SSU Patient Registration')]");
	By registrationButtonOfNewSSUPatientRegistrationForms = By.xpath("//button[contains(text(), 'Register')]");
	By errorMeesageInLastNameTextFieldElement = By.xpath("//span[contains(text(), 'Last Name is required')]");
	By registerButtonOfNewSSUPatientRegistrationForms = By.xpath(" //button[contains(text(), 'Register')]");
	By targetGroupCertificateTypeTextbox = By.xpath("//input[@id='TG_CertificateType']");
	By certificateNoTextbox = By.xpath("//input[@id='TG_CertificateNo']");

	By ssuPatientListButtonByElement = By.xpath("//a[contains(text(), 'SSU Patient List')]");
	By subCategoryTabByElement = By.xpath("//a[contains(text(), 'Sub Category')]");
	By cuttonSubCategoryNameByElement = By.xpath("//div[contains(text(), 'cotton')]");
	By itemSubmenuByElement = By.xpath("//a[contains(text(), 'Items')]");
	By addItemButtonByElement = By.xpath("//input[@value='Add Item']");
	By generalInventoryRadioButtonByElement = By.xpath("(//input[@type='radio'])[2]");
	By commonRadioButtonByElement = By.xpath("//input[@id='Common']");

	By inactiveRadioButton = By.xpath("(//label//span)[3]");
	By activeRadioButton = By.xpath("(//label//span)[2]");

	By addItemPageNameByElement = By.xpath("//span[contains(text(), 'Add Item')]");

	By isCssdApplicableCheckBoxByElement = By.xpath("//input[@id='IsCssdApplicable']/..//span");
	By isColdStorageApplicableCheckBoxByElement = By.xpath("//input[@id='IsColdStorageApplicable']/..//span");
	By isPatConsumptionApplicableCheckBoxByElement = By.xpath("//input[@id='IsPatConsumptionApplicable']/..//span");


	String pageName = this.getClass().getSimpleName();
	public socialService_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		Boolean textIsDisplayed = false;
		try {
			WebElement usernametextFieldWebElement = commonEvents.findElement(usernameTextbox);
			commonEvents.highlightElement(usernametextFieldWebElement);
			commonEvents.sendKeys(usernameTextbox,expectedData.get("username"));

			WebElement passwordtextFieldWebElement = commonEvents.findElement(passwordTextbox);
			commonEvents.highlightElement(passwordtextFieldWebElement);
			commonEvents.sendKeys(passwordTextbox,expectedData.get("password"));

			WebElement signinButtonWebElement = commonEvents.findElement(signInButton);
			commonEvents.highlightElement(signinButtonWebElement);
			commonEvents.click(signInButton);

			if(commonEvents.isDisplayed(registeredPatientTextElement))
			{   
				WebElement registeredPatientTextWebElement = commonEvents.findElement(registeredPatientTextElement);
				commonEvents.highlightElement(registeredPatientTextWebElement);
				textIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return textIsDisplayed;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		String pageTitle = "";
		try {
			pageTitle = commonEvents.getTitle();
			System.out.println("title of the page is  :" + pageTitle );
		}catch(Exception e) {
			throw e;
		}	
		return pageTitle;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		String urlofThepage = "";
		try {
			urlofThepage = commonEvents.getCurrentUrl();
			System.out.println("URL of the page is  :" + urlofThepage );
		}catch(Exception e) {
			throw e;
		}	
		return urlofThepage;
	}

	/**@Test2
	 * about this method verifySocialServiceModuleisPresentAndGoToSocialServiceTab() 
	 * @param : null
	 * @description : Verify that SocialService module is present and Go to SocialService Tab.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifySocialServiceModuleisPresentAndGoToSocialServiceTab() throws Exception {
		boolean isDisplayed = false;
		try {
			if(commonEvents.isDisplayed(socialServiceModule)){
				commonEvents.click(socialServiceModule);
				Thread.sleep(2000);
				isDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return isDisplayed;
	}

	/**@Test3
	 * about this method registerNewSSUPatientButtonisPresent() 
	 * @param : null
	 * @description : Verify that Register New SSU Patient button is present inside the SocialService Tab.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public String verifyRegisterNewSSUPatientButtonisPresentAndValidateFormName() throws Exception {
		String newSSUPatientRegistrationFormName = "";
		try {
			commonEvents.isDisplayed(registerNewSSUPatientButton);
			commonEvents.click(registerNewSSUPatientButton);
			Thread.sleep(2000);
			newSSUPatientRegistrationFormName = commonEvents.getText(newSSUPatientRegistrationFormNameElement);
			System.out.println("form Name after click on " + " " + "registerNewSSUPatient" + " " +  "Button : " + newSSUPatientRegistrationFormName);
			//				return newSSUPatientRegistrationFormName;
		}catch(Exception e) {
			throw e;
		}
		return newSSUPatientRegistrationFormName;
	}

	/**@Test4
	 * about this method validateErrorMessageInLastNameTextfield() 
	 * @param : null
	 * @description : Validate the error message in Last Name text field without filling any data and clicking on "Register" Button
	 * @author : YAKSHA
	 */
	public String validateErrorMessageInLastNameTextfield() throws Exception {
		String errorMessageText = "";
		try {
			if(commonEvents.isDisplayed(registrationButtonOfNewSSUPatientRegistrationForms)) {
				commonEvents.click(registrationButtonOfNewSSUPatientRegistrationForms);
				Thread.sleep(3000);
				errorMessageText = commonEvents.getText(errorMeesageInLastNameTextFieldElement);
				System.out.println("Error Meesage of Last Name Text Field is : " + errorMessageText );
				return errorMessageText;	
			}
		}catch(Exception e) {
			throw e;
		}	
		return errorMessageText;
	}

	/**@Test5
	 * about this method fillAllTheTextfieldsinsideTheNewSSUPatientRegistrationForm() 
	 * @param : Map<String, String>
	 * @description : Fill all the text fields which are present inside the New SSU Patient Registration popup  and Check the data which we are entered are present in First Name Field. 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String fillDataInTextfieldsAndVerifyEnteredData(Map<String, String> expectedData) throws Exception {
		String firstNameTextfieldValue = "";
		try {
			if(commonEvents.isDisplayed(firstNameTextField) && 
					commonEvents.isDisplayed(middelNameTextField) &&
					commonEvents.isDisplayed(lastNameTextField))
			{
				commonEvents.sendKeys(firstNameTextField,expectedData.get("firstName"));	
				commonEvents.sendKeys(middelNameTextField,expectedData.get("middleName"));
				commonEvents.sendKeys(lastNameTextField,expectedData.get("lastName"));

				firstNameTextfieldValue = commonEvents.getAttribute(firstNameTextField, "value");
				System.out.println("value inside the FirstName textbox is : " + firstNameTextfieldValue);
			}
		}catch(Exception e) {
			throw e;
		}
		return firstNameTextfieldValue;
	}

	/**@Test6
	 * about this method selectIndiaFromCountryDropdownAndVerifySelection() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : it will select the country as per Excel expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String selectIndiaFromCountryDropdownAndVerifySelection(Map<String, String> expectedData) throws Exception {

		String selectedCountryName = "" ;

		//		commonEvents.click(countryDropdownMenuElement);

		try {
			commonEvents.selectByVisibleText(countryDropdownMenuElement, expectedData.get("selectedCountryName"));
			selectedCountryName = commonEvents.getFirstSelectedOptionFromDropdown(countryDropdownMenuElement, "elementName", "pageName");
			System.out.println("first selected option from country dropdown : " + selectedCountryName );
			return selectedCountryName;
		}catch(Exception e) {
			throw e;
		}	
	}

	/**@Test7
	 * about this method scrollToButtomOfThePageAndVerifyCloseButtonIsPresent() 
	 * @param : null
	 * @description : scroll to the bottom of the page and verify that "Close" button is present or not.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean scrollToButtomOfThePageAndVerifyCloseButtonIsPresent() throws Exception {
		boolean closeButtoIsDisplayed = false;
		try {
			Thread.sleep(5000);
			//			commonEvents.jsScrollTillPageFooter();
			commonEvents.jsScrollPageTillElementVisible(registerButtonOfNewSSUPatientRegistrationForms, "pageName", "pageName");
			if(commonEvents.isDisplayed(closeButtonOfNewSsuPatientRegistrationByElement) && 
					commonEvents.isDisplayed(registerButtonOfNewSSUPatientRegistrationForms)) {

				WebElement closeButtonOfNewSsuPatientRegistrationWebElement = commonEvents.findElement(closeButtonOfNewSsuPatientRegistrationByElement);
				commonEvents.highlightElementAfterAction(closeButtonOfNewSsuPatientRegistrationWebElement);

				WebElement registerButtonOfNewSSUPatientRegistrationFormsWebElement = commonEvents.findElement(registerButtonOfNewSSUPatientRegistrationForms);
				commonEvents.highlightElementAfterAction(registerButtonOfNewSSUPatientRegistrationFormsWebElement);

				closeButtoIsDisplayed = true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return closeButtoIsDisplayed;
	}

	/**@Test8
	 * about this method validateWarnningMessageOfNewSSUPatientRegistrationForms() 
	 * @param : Map<String, String>
	 * @description : Validate the warnning message for the membership dropdown.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String validateWarnningMessageOfNewSSUPatientRegistrationForms(Map<String, String> expectedData) throws Exception {
		String warningMessageValue = "";
		try {
			if(commonEvents.isDisplayed(warningMessage)) {
				warningMessageValue = commonEvents.getText(warningMessage);
				System.out.println("Warnning Message is : " + warningMessageValue);
			}
		}catch(Exception e) {
			throw e;
		}
		return warningMessageValue;
	}
}