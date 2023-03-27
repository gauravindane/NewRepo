package com.demo.qa.mastertest;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.qa.TestBase.TestBase;
import com.demo.qa.master.Product;

public class ProductTest extends TestBase {



	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver=intializeBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		//	TestBase.driver.close();
	}


	@Test
	public void ProductPageTest() throws InterruptedException {
		Product pr=new Product(TestBase.driver);  
//		pr.verifyMyerpagancycode();
//		pr.verifyMyerpUserid();
//		pr.verifyMyerpPassword();
//		pr.VerifyandClickonMyerpLoginBtn();
		pr.setup(driver);
		pr.VerifyMyerpMasterModule();
		pr.VerifyMyerpGenralMasterModule();
		pr.VerifyMyerpProductForm();
		pr.VerifyMyerProductname();
		pr.VerifyMyerProductcode();
		pr.VerifyMyerProductDesc();
		pr.setselectunitofmeasurement();
		pr.setselectproductcategory();
		pr.setselectinventorymethod();
		pr.VerifyMyerIsGST();
		pr.VerifyMyerpTaxDetails();
		pr.VerifyMyerpHSNCode();
		pr.VerifyMyerpPName();
		pr.VerifyMyerpPCGST();
		pr.VerifyMyerpPTaxSavebtn();
		pr.VerifyMyerpPActiveCheckbox();
		pr.VerifyMyerpPSubmitBtn();
		pr.VerifyMyerpPSubmitBtnOK();
		pr.VerifyandClickonPSearchbar2();
		pr.VerifyMyerProductname1();
		pr.VerifyMyerProductcode1();
		pr.VerifyMyerProductDesc1();
		pr.setselectunitofmeasurement1();
		pr.setselectproductcategory1();
		pr.setselectinventorymethod1();
		pr.VerifyMyerIsGST1();
		pr.VerifyMyerpTaxDetails1();
		pr.VerifyMyerpHSNCode1();
		pr.VerifyMyerpPName1();
		pr.VerifyMyerpPCGST1();
		pr.VerifyMyerpPTaxSavebtn1();
		pr.VerifyMyerpPActiveCheckbox1();
		pr.VerifyMyerpPClearBtnBtn();
		pr.VerifyMyerpPEditBtn();
		pr.VerifyMyerpPYesUpdateItBtn();
		pr.VerifyMyerProductcode2();
		pr.VerifyMyerProductDesc2();
		pr.VerifyMyerpPUpdateBtn();
		pr.VerifyMyerpPUpdateOKBtn();
		pr.VerifyandClickonPSearchbar3();
		pr.VerifyMyerpPExportBtn();

	}

}





