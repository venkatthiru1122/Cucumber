package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseMethods {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({
		@FindBy(id = "username"),
		@FindBy(xpath="(//input[@class='login_input'])[1]"),
		@FindBy(name="username")	
	})
	private WebElement adactinUsername;
	
	
	@FindAll({
		@FindBy(id="password"),
		@FindBy(name="password"),
		@FindBy(xpath="(//input[@type='password'])")
		
	})
	private WebElement adactinPassword;


	@FindAll({
		@FindBy(id="login"),
		@FindBy(name="login"),
		@FindBy(xpath="(//input[@type='Submit'])")
		
	})
	private WebElement adactinLogin;

	@FindAll({
		@FindBy(name="username"),
		@FindBy(id="username"),
		@FindBy(xpath="(//input[@class='reg_input'])[1]")
	})
	private WebElement adactinFormUsername;
	
	@FindAll({
		@FindBy(name="password"),
		@FindBy(id="password"),
		@FindBy(xpath="(//input[@class='reg_input'])[2]")
	})
	private WebElement adactinFormPassword;
	
	@FindAll({
		@FindBy(name="re_password"),
		@FindBy(id="re_password"),
		@FindBy(xpath="(//input[@class='reg_input'])[3]")
	})
	private WebElement adactinFormCnfrmPassword;
	
	@FindAll({
		@FindBy(name="full_name"),
		@FindBy(id="full_name"),
		@FindBy(xpath="(//input[@class='reg_input'])[4]")
	})
	private WebElement adactinFormFullName;
	
	@FindAll({
		@FindBy(name="email_add"),
		@FindBy(id="email_add"),
		@FindBy(xpath="(//input[@class='reg_input'])[5]")
	})
	private WebElement adactinFormEmail;
	
	@FindAll({
		@FindBy(name="Submit"),
		@FindBy(id="Submit"),
	})
	private WebElement adactinFormSubmit;
	
	@FindAll({
	    @FindBy(id = "email"),
	    @FindBy(name="email"),
	    @FindBy(xpath="//input[@type='text']")
	})
	private WebElement fbUsername;
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="pass"),
		@FindBy(xpath="(//input[@type='password'])")	
	})
	private WebElement fbPassword;
	

	@FindAll({
		@FindBy(id="u_0_5_/w"),
		@FindBy(name="login"),
		@FindBy(xpath="(//button[@type='submit'])")	
	})
	
	private WebElement fbLogin;
	
	@FindAll({
		@FindBy(xpath="//h5[text()='Forms']"),
		@FindBy(xpath="(//div[@class='card-body'])[2]")
	})

		private WebElement demoQAformClick; 
	
	@FindAll({
		@FindBy(xpath="//span[text()='Practice Form']"),
		//@FindBy(id = "item-0")	
	})
	private WebElement demoQAPracticeClick;
	
	@FindAll({
		@FindBy(id= "firstName"),
		@FindBy(xpath="//input[@placeholder='First Name']"),
		@FindBy(xpath="(//input[@type='text'])[1]")	
	})
	
	private WebElement demoQAfirstName;
	
	@FindAll({
		@FindBy(id= "lastName"),
		@FindBy(xpath="//input[@placeholder='Last Name']"),
		@FindBy(xpath="(//input[@type='text'])[2]")	
	})
	
	private WebElement demoQALastName;
	
	@FindAll({
		@FindBy(id= "userEmail"),
		@FindBy(xpath="//input[@placeholder='name@example.com']"),
		@FindBy(xpath="(//input[@type='text'])[3]")	
	})
	
	private WebElement demoQAEmail;
	
	@FindAll({
		@FindBy(id= "userNumber"),
		@FindBy(xpath="//input[@placeholder='Mobile Number']"),
		@FindBy(xpath="(//input[@type='text'])[4]")	
	})
	
	private WebElement demoQAMobileNo;
	
	@FindAll({
		@FindBy(xpath="(//input[@type='text'])[5]")
		
		
		
	})
	private WebElement demoQADOB;

	@FindAll({
		@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"),
	    @FindBy(xpath="(//input[@type='text'])[6]")
	})
	private WebElement demoQASubject;
	

	@FindAll({
		@FindBy(id= "currentAddress"),
		@FindBy(xpath="//input[@placeholder='Current Address']"),
		@FindBy(xpath="//textarea[@class='form-control']")	
	})
	
	private WebElement demoQAAddress;
	
	
	@FindAll({
		@FindBy(xpath="//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']")	
	})
	private WebElement greensCopyRight;
	
	
	@FindAll({
		@FindBy(xpath="//h1[contains(text(),'Chennai with Placements')]")	
	})
	private WebElement greensChennaiPlacements;
	
	
	@FindAll({
		@FindBy(xpath="//a[text()='Certifications']"),
		@FindBy(xpath="(//a[@href='Certifications.html'])")
	})
	private WebElement greensCertificationsClick;
	
	@FindAll({
		@FindBy(xpath="(//a[text()='Course Content'])[29]"),
		@FindBy(xpath="(//a[@href='selenium-course-content.html'])[2]")
	})
	private WebElement greensSeleniumClick;
	
	@FindAll({
		@FindBy(xpath="//p[@style='padding-top:10px;']")
	})
	private WebElement greensParagraph;
	
	@FindAll({
		@FindBy(xpath="//a[@href='courses.html']"),
		@FindBy(xpath="//a[@class='activeLink']"),
		@FindBy(xpath="//a[text()='COURSES']")		
	})
	private WebElement greensCoursesMove;
	
	
	@FindAll({
		@FindBy(xpath="//a[text()='Java Training ']"),
		@FindBy(xpath="(//a[@href='http://www.greenstechnologys.com/java-training-course-content.html'])[1]"),
	})
	private WebElement greensJavaTrainingMove;

	
	@FindAll({
		@FindBy(xpath="((//a[@href='http://www.greenstechnologys.com/java-training-course-content.html']))[2]"),
		@FindBy(xpath="//a[text()='Core Java Training']")
	})
	private WebElement greensCoreJavaClick;
	
	
	@FindAll({
		@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	})
	private WebElement greensReviewAnitha;
	
	
	@FindAll({
		@FindBy(xpath="//a[text()='CAREERS']"),
		@FindBy(xpath="//a[@href='careers.html']")
	})
	private WebElement greensCarrierClick;
	
	@FindBy(xpath="//div[@class='copyright']")
	private WebElement greensEmail;
	
	@FindAll({
		@FindBy(id="i-icon-profile"),
		@FindBy(xpath="//i[@class='icon-profile-new-unsigned ']")	
	})
	private WebElement redSignLogo;
	
	@FindAll({
		@FindBy(id="signInLink"),
		@FindBy(xpath="//li[@class='config-options ']"),
		@FindBy(xpath="//li[text()='Sign In/Sign Up']")
	})
	private WebElement redSignInBtn;
	

	@FindAll({
		@FindBy(xpath="(//span[text()='Sign in with Google'])[1]"),
		@FindBy(xpath="//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']"),
	})
	private WebElement redSignGoogle;
	
	@FindAll({
		@FindBy(xpath="//input[@aria-label='Email or phone']"),
		@FindBy(id="identifierId"),
		@FindBy(name="identifier")
	})
	private WebElement redEmail;
	
	@FindAll({
		@FindBy(xpath="(//span[@jsname='V67aGc'])[2]"),
		@FindBy(xpath="//span[text()='Next']")
	})
	private WebElement redEmailNxt;
	
	@FindAll({
		@FindBy(xpath="(//input[@type='text'])[2]"),
		@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	})
	private WebElement flipkartEmail;
	
	@FindAll({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	})
	private WebElement flipkartPassword;
	
	@FindAll({
		@FindBy(xpath="(//button[@type='submit'])[2]"),
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	})
	private WebElement flipkartLoginBtn;
	
	
	public WebElement getFlipkartEmail() {
		return flipkartEmail;
	}

	public WebElement getFlipkartPadssword() {
		return flipkartPassword;
	}

	public WebElement getFlipkartLoginBtn() {
		return flipkartLoginBtn;
	}

	public WebElement getRedEmail() {
		return redEmail;
	}

	public WebElement getRedEmailNxt() {
		return redEmailNxt;
	}

	public WebElement getRedSignGoogle() {
		return redSignGoogle;
	}

	public WebElement getRedSignLogo() {
		return redSignLogo;
	}

	public WebElement getRedSignInBtn() {
		return redSignInBtn;
	}

	public WebElement getGreensEmail() {
		return greensEmail;
	}

	public WebElement getGreensCopyRight() {
		return greensCopyRight;
	}

	public WebElement getGreensChennaiPlacements() {
		return greensChennaiPlacements;
	}

	public WebElement getGreensCertificationsClick() {
		return greensCertificationsClick;
	}

	public WebElement getGreensSeleniumClick() {
		return greensSeleniumClick;
	}

	public WebElement getGreensParagraph() {
		return greensParagraph;
	}

	public WebElement getGreensCoursesMove() {
		return greensCoursesMove;
	}

	public WebElement getGreensJavaTrainingMove() {
		return greensJavaTrainingMove;
	}

	public WebElement getGreensCoreJavaClick() {
		return greensCoreJavaClick;
	}

	public WebElement getGreensReviewAnitha() {
		return greensReviewAnitha;
	}

	public WebElement getGreensCarrierClick() {
		return greensCarrierClick;
	}

	public WebElement getAdactinUsername() {
		return adactinUsername;
	}

	public WebElement getAdactinPassword() {
		return adactinPassword;
	}

	public WebElement getAdactinLogin() {
		return adactinLogin;
	}

	public WebElement getAdactinFormUsername() {
		return adactinFormUsername;
	}

	public WebElement getAdactinFormPassword() {
		return adactinFormPassword;
	}

	public WebElement getAdactinFormCnfrmPassword() {
		return adactinFormCnfrmPassword;
	}

	public WebElement getAdactinFormFullName() {
		return adactinFormFullName;
	}

	public WebElement getAdactinFormEmail() {
		return adactinFormEmail;
	}

	public WebElement getAdactinFormSubmit() {
		return adactinFormSubmit;
	}

	public WebElement getFlipkartPassword() {
		return flipkartPassword;
	}

	public WebElement getFbUsername() {
		return fbUsername;
	}

	public WebElement getFbPassword() {
		return fbPassword;
	}
	
	public WebElement getFbLogin() {
		return fbLogin;
	}

	public WebElement getDemoQAformClick() {
		return demoQAformClick;
	}

	public WebElement getDemoQAPracticeClick() {
		return demoQAPracticeClick;
	}

	public WebElement getDemoQAfirstName() {
		return demoQAfirstName;
	}

	public WebElement getDemoQALastName() {
		return demoQALastName;
	}

	public WebElement getDemoQAEmail() {
		return demoQAEmail;
	}

	public WebElement getDemoQAMobileNo() {
		return demoQAMobileNo;
	}

	public WebElement getDemoQADOB() {
		return demoQADOB;
	}

	public WebElement getDemoQASubject() {
		return demoQASubject;
	}

	public WebElement getDemoQAAddress() {
		return demoQAAddress;
	}
	
	
	
	

}
