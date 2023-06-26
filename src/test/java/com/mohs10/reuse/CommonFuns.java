package com.mohs10.reuse;



import com.mohs10.base.StartBrowser;

import org.openqa.selenium.WebDriver;

import com.mohs10.ActionDriver.Action;
import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.ActionDriver.Validation;
import com.mohs10.ActionDriver.dataEncrypt_Decrypt2;
import com.mohs10.ActionDriver.dataMasking;

import com.mohs10.ActionDriver.videohandling;
import com.mohs10.or.HomePage;

public class CommonFuns extends Action {

	public static Action aDriver;
	public WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}

	// *****************************************************Data Masking
	// Script*******************************************************//

	public void login(String url, String Msg) throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("login for data Masking");
		aDriver.navigateToApplication(url);

		aDriver.click(HomePage.Carrier, "clicked on carrier");
		Validation.pagetextValidation(Msg);

	}

	public void ApplyjavaBackend(String Ename, String emailId) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Apply in Java backend");
		aDriver.click(HomePage.javaBackEnd, "clicked on java backend possition");

		aDriver.type(HomePage.Ename, Ename, "name typed");
		aDriver.type(HomePage.email, emailId, "Email typed");
		// aDriver.type(HomePage.mobile,mobile,"Mobile number entered");
		// aDriver.type(HomePage.location, location, "Location entered");
		// aDriver.type(HomePage.experience, experience, "experience entered");
		// aDriver.UploadFile(HomePage.uploadresume, uploadResume, "resume uploded");
		// aDriver.click(HomePage.submit, "Submited");
		Thread.sleep(5000);

	}

	public void caseStudy(String name, String email, String msg) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Enter Masked Data");
		aDriver.navigateToApplication("https://mohs10.io/");
		aDriver.click(HomePage.resources, "clicked on resouces");
		aDriver.click(HomePage.caseStudy, "clicked on case study");
		aDriver.click(HomePage.casestudy1, "clicked on first case study");
		aDriver.type(HomePage.name1, name, "Name typed");
		aDriver.type(HomePage.Email1, email, "email entered");
		aDriver.click(HomePage.sumbit1, "clicked on submit");
		Thread.sleep(5000);
		Validation.pagetextValidation(msg);
		aDriver.click(HomePage.download1, "name");
		aDriver.switchToNewWindow(driver);
		aDriver.click(HomePage.downloadToLocal, "click on save button");
		//aDriver.switchToOldWindow(driver);
		// fileDownLoad.fileDownload("https://mohs10.io/wp-content/uploads/2023/05/Performance-Testing-for-an-Online-Reservation-Platform.pdf");
	}

	public void Protalk() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Enter Masked Data");
		aDriver.navigateToApplication("https://mohs10.io/");

		aDriver.click(HomePage.resources, "clicked on resoursec");
		aDriver.click(HomePage.events, "click on events");
		aDriver.click(HomePage.protalk, "clicked on protalk");
		aDriver.click(HomePage.webinar, "clicked on webinar");
		aDriver.switchToOldWindow(driver);
		videohandling.videoplayPause();

	}
}
