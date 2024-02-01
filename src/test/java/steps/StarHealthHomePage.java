package steps;
import static steps.StarHealthHooks.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StarHealthHomePage  {

	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	WebElement popupClose;

	@FindBy(xpath = "(//span[@class='btn-text'])[1]")
	WebElement buynow;

	@FindBy(xpath = "//*[@id='fullname']")
	WebElement fullname;

	@FindBy(xpath = "//*[@id='mobile']")
	WebElement mobile;
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//*[@id='zipcode']")
	WebElement pincode;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement getstarted;
	
	@FindBy(xpath = "//*[@id=\"insureDetails-form\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/label/span[2]")
	WebElement myself;

	public StarHealthHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPopUp() {
		popupClose.click();
	}
	
	public void clickOnBuyNow() {
		buynow.click();
	}
	
	public void enterFullname(String name) {
		fullname.sendKeys(name);
	}
	public void enterMobile(String phone) {
		mobile.sendKeys(phone);
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	public void enterPincode(String code) {
		pincode.sendKeys(code);
	}
	public void clickOnGetStarted() {
		getstarted.click();
	}
	public void clickOnMyself() {
		myself.click();
	}
}
