package com.demo.qa.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Product {
	

		@FindBy (xpath="//input[@id='txtAgencyCode']") private WebElement agancycode ;
		@FindBy (xpath="//input[@id='txtEmail']") private WebElement userid;
		@FindBy (xpath="//input[@id='password-field']") private WebElement password;
		@FindBy (xpath="//button[@id='btnLogin']") private WebElement login;
		@FindBy (xpath="//*[@id='menuMasters']") private WebElement master;
		@FindBy (xpath="//*[@id=\"menuMasters\"]/ul/li[1]/a") private WebElement genralmaster;  
		@FindBy (xpath="//a[text()='Product']") private WebElement productform;
		@FindBy (xpath="//input[@id='txtProductName']") private WebElement productname;
		@FindBy (xpath="//input[@id='txtProductCode']") private WebElement productcode;
		@FindBy (xpath="//input[@id='txtDescription']") private WebElement productdesc; 
		@FindBy (xpath="//select[@id='ddlUnitOfMeasurement']") private WebElement selectunitofmeasurement; 
		@FindBy (xpath="//select[@id=\"ddlProdCat\"]") private WebElement selectproductcategory; 
		@FindBy (xpath="//*[@id=\"ddlInventoryMethod\"]") private WebElement selectinventorymethod;
		@FindBy (xpath="//*[@id=\"chkTax\"]") private WebElement prodisgst; 
		@FindBy (xpath="//h4[text()='Tax Details']") private WebElement prodtaxdetials;
		@FindBy (xpath="//input[@id='txtHSN_SAC']") private WebElement hsncode; 
		@FindBy (xpath="//input[@id='txtName']") private WebElement pname;
		@FindBy (xpath="//input[@id='txtTaxRate_1']") private WebElement pcgst;
		@FindBy (xpath="//button[@id='btnSaveTax']") private WebElement ptaxsavebtn;
		@FindBy (xpath="//input[@id='chkActive']") private WebElement pactivechk;  
		@FindBy (xpath="//button[@id='btnclear']") private WebElement pclearbtn; 
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement psubmitbtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement psubmitbtnok;
		@FindBy (xpath="//input[@class='form-control input-sm']") private WebElement  psearchbar;
		@FindBy (xpath="//a[@id='btnEdit']") private WebElement peditbtn;   
		@FindBy (xpath="//button[text()='Yes, update it!']") private WebElement yesupdateitbtn;
		@FindBy (xpath="//button[@id='btnSubmit']") private WebElement updatebtn;
		@FindBy (xpath="//button[text()='OK']") private WebElement pupdatedok;
		@FindBy (xpath="//input[@id='btnExportToExcel']") private WebElement exportbtn;
		
		//initialization
		WebDriver driver;
		public void setup(WebDriver driver) 
		{
			this.driver=driver;
		}
			public Product(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			// usage
			
			public void verifyMyerpagancycode() {
				 Assert.assertTrue(agancycode.isEnabled(),"agancycode field is enabled");
				 Reporter.log("verifyMyerpagancycode", true);
				 agancycode.sendKeys("ERP_00001");
			}
			public void verifyMyerpUserid() {
				 Assert.assertTrue(userid.isEnabled(),"uerid field is enabled");
				 Reporter.log("verifyMyerpUserid", true);
				 userid.sendKeys("admin");
			}
			public void verifyMyerpPassword() {
				 Assert.assertTrue(password.isEnabled(),"passwordfield is enabled");
				 Reporter.log(" verifyMyerpPassword", true);
				 password.sendKeys("admin@123");
			}
			
			public void VerifyandClickonMyerpLoginBtn() {
				 Assert.assertTrue(login.isEnabled(),"login btn is enabled");
				 Reporter.log(" verifyMyerplogin", true);
				 login.click();
			}
			
			public void VerifyMyerpMasterModule() {
				 Assert.assertTrue(master.isEnabled(),"Master Module field is enabled");		 
				 Reporter.log("verifyMyerpMasterModule", true);
				 master.click(); 
			}
			public void VerifyMyerpGenralMasterModule() {
				 Assert.assertTrue(genralmaster.isEnabled(),"GenralMaster Module field is enabled");		 
				 Reporter.log("verifyMyerpGenralMasterModule", true);
				 genralmaster.click(); 
			}
			public void VerifyMyerpProductForm() {
				 Assert.assertTrue(productform.isEnabled(),"productform field is enabled");		 
				 Reporter.log("verifyMyerpproductform ", true);
				 productform.click(); 
			}
			public void VerifyMyerProductname() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productname.click(); 
				 productname.sendKeys("19KG DOM");
			}
			public void VerifyMyerProductcode() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productcode.click(); 
				 productcode.sendKeys("1006");
			}

			public void VerifyMyerProductDesc() throws InterruptedException {
				Thread.sleep(500);
				 Assert.assertTrue(productdesc.isEnabled(),"productcode field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productdesc.click(); 
				 productdesc.sendKeys("19KG DOM"); 
			}
		
			public void setselectunitofmeasurement() throws InterruptedException {
				Select suom = new Select(selectunitofmeasurement);
				Thread.sleep(1000);
				Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
				Assert.assertFalse(selectunitofmeasurement.isSelected());
				suom.selectByVisibleText("KILOGRAM");
			}
			public void setselectproductcategory() throws InterruptedException {
				Select spc = new Select(selectproductcategory);
				Thread.sleep(1000);
				Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
				Assert.assertFalse(selectproductcategory.isSelected());
				spc.selectByVisibleText("DOMESTIC");
			}
			
			public void setselectinventorymethod() throws InterruptedException {
				Select sim = new Select(selectinventorymethod);
				Thread.sleep(1000);
				Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectproductcategory is not displayed");
				Assert.assertFalse(selectinventorymethod.isSelected());
				sim.selectByVisibleText("FIFO");
			}
		     public void VerifyMyerIsGST() throws InterruptedException {
		    	 Thread.sleep(500);
		       Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		       Reporter.log("verifyMyerpprodisgst ", true);
		       prodisgst.click(); 
				/*
				 * Alert al = driver.switchTo().alert();
				 * driver.switchTo().frame("iframeResult"); prodisgst.click();
				 * System.out.println(al.getText()); al.accept();
				 */
		       }
		     
		     public void VerifyMyerpTaxDetails() throws InterruptedException {
		    	 Thread.sleep(500);
			       Assert.assertTrue(prodtaxdetials.isEnabled(),"prodisgst field is enabled");		 
			       Reporter.log("verifyMyerpprodtaxdetails ", true);
			       prodtaxdetials.getText();
			       System.out.println(prodtaxdetials.getText());
			       
		     }
		     
		     
		    public void VerifyMyerpHSNCode() throws InterruptedException {
		    	Thread.sleep(500);
			  Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
			  Reporter.log("verifyMyerphsncode ", true);
			  hsncode.click(); 
		
		   }
		    public void VerifyMyerpPName() throws InterruptedException {
		    	Thread.sleep(500);
			  Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
			  Reporter.log("verifyMyerppname ", true);
			  pname.click(); 
			  pname.sendKeys("Pritesh");
		 }
		   public void VerifyMyerpPCGST() throws InterruptedException {
			   Thread.sleep(500);
			  Assert.assertTrue(pcgst.isEnabled(),"hsncode field is enabled");		 
			  Reporter.log("verifyMyerphsncode ", true);
			  pcgst.click(); 
			  pcgst.sendKeys("18");
		 }
		   public void VerifyMyerpPTaxSavebtn() throws InterruptedException {
			   Thread.sleep(700);
			  Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
			  Reporter.log("verifyMyerpptaxsavebtn ", true);
			  ptaxsavebtn.click(); 
			 
		 }
		   public void VerifyMyerpPActiveCheckbox() throws InterruptedException {
			   Thread.sleep(700);
			  Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
			  Reporter.log("verifyMyerppactivechk ", true);
			  pactivechk.click(); 
		 }
		
		   public void VerifyMyerpPSubmitBtn() throws InterruptedException {
			   Thread.sleep(700);
				  Assert.assertTrue(psubmitbtn.isEnabled(),"psubmitbtn field is enabled");		 
				  Reporter.log("verifyMyerppsubmitbtn ", true);
				  psubmitbtn.click(); 
				  
			 }
		   public void VerifyMyerpPSubmitBtnOK() throws InterruptedException {
			   Thread.sleep(700);
				  Assert.assertTrue(psubmitbtnok.isEnabled(),"psubmitbtnok field is enabled");		 
				  Reporter.log("verifyMyerppsubmitbtnok ", true);
				  psubmitbtnok.click(); 
			 }
		   
		   
		   public void VerifyandClickonPSearchbar2() throws InterruptedException {
		    	  Thread.sleep(800);
		    	  Assert.assertTrue(psearchbar.isEnabled()," psearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp psearchbar", true);
		    	  psearchbar.click(); 
		    	  psearchbar.sendKeys("19 KG DOM");
		    	  }
		   public void VerifyMyerProductname1() throws InterruptedException {
			   Thread.sleep(700);
				 Assert.assertTrue(productname.isEnabled(),"productname field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productname.click(); 
				 productname.sendKeys("40 KGG");
			}
			public void VerifyMyerProductcode1() throws InterruptedException {
				Thread.sleep(700);
				 Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productcode.click(); 
				 productcode.sendKeys("1003");
			}

			public void VerifyMyerProductDesc1() throws InterruptedException {
				Thread.sleep(700);
				 Assert.assertTrue(productdesc.isEnabled(),"productcode field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productdesc.click(); 
				 productdesc.sendKeys("19 KG"); 
			}
		
			public void setselectunitofmeasurement1() throws InterruptedException {
				Select suom = new Select(selectunitofmeasurement);
				Thread.sleep(1000);
				Assert.assertFalse(selectunitofmeasurement.isDisplayed(),"selectunitofmeasurement is not displayed");
				Assert.assertFalse(selectunitofmeasurement.isSelected());
				suom.selectByVisibleText("KILOGRAM");
			}
			public void setselectproductcategory1() throws InterruptedException {
				Select spc = new Select(selectproductcategory);
				Thread.sleep(1000);
				Assert.assertFalse(selectproductcategory.isDisplayed(),"selectproductcategory is not displayed");
				Assert.assertFalse(selectproductcategory.isSelected());
				spc.selectByVisibleText("DOMESTIC");
			}
			
			public void setselectinventorymethod1() throws InterruptedException {
				Select sim = new Select(selectinventorymethod);
				Thread.sleep(1000);
				Assert.assertFalse(selectinventorymethod.isDisplayed(),"selectproductcategory is not displayed");
				Assert.assertFalse(selectinventorymethod.isSelected());
				sim.selectByVisibleText("FIFO");
			}
		     public void VerifyMyerIsGST1() throws InterruptedException {
		    	 Thread.sleep(500);
		       Assert.assertTrue(prodisgst.isEnabled(),"prodisgst field is enabled");		 
		       Reporter.log("verifyMyerpprodisgst ", true);
		       prodisgst.click(); 
				/*
				 * Alert al = driver.switchTo().alert();
				 * driver.switchTo().frame("iframeResult"); prodisgst.click();
				 * System.out.println(al.getText()); al.accept();
				 */
		       }
		     
		     public void VerifyMyerpTaxDetails1() throws InterruptedException {
		    	 Thread.sleep(700);
			       Assert.assertTrue(prodtaxdetials.isEnabled(),"prodisgst field is enabled");		 
			       Reporter.log("verifyMyerpprodtaxdetails ", true);
			       prodtaxdetials.getText();
			       System.out.println(prodtaxdetials.getText());
			       
		     }
		     
		     
		    public void VerifyMyerpHSNCode1() throws InterruptedException {
		    	Thread.sleep(700);
			  Assert.assertTrue(hsncode.isEnabled(),"hsncode field is enabled");		 
			  Reporter.log("verifyMyerphsncode ", true);
			  hsncode.click(); 
		
		   }
		    public void VerifyMyerpPName1() throws InterruptedException {
		    	Thread.sleep(700);
			  Assert.assertTrue(pname.isEnabled(),"pname field is enabled");		 
			  Reporter.log("verifyMyerppname ", true);
			  pname.click(); 
			  pname.sendKeys("Pritesh");
		 }
		   public void VerifyMyerpPCGST1() throws InterruptedException {
			   Thread.sleep(700);
			  Assert.assertTrue(pcgst.isEnabled(),"hsncode field is enabled");		 
			  Reporter.log("verifyMyerphsncode ", true);
			  pcgst.click(); 
			  pcgst.sendKeys("18");
		 }
		   public void VerifyMyerpPTaxSavebtn1() throws InterruptedException {
			   Thread.sleep(500);
			  Assert.assertTrue(ptaxsavebtn.isEnabled(),"ptaxsavebtn field is enabled");		 
			  Reporter.log("verifyMyerpptaxsavebtn ", true);
			  ptaxsavebtn.click(); 
			 
		 }
		   public void VerifyMyerpPActiveCheckbox1() throws InterruptedException {
			   Thread.sleep(700);
			  Assert.assertTrue(pactivechk.isEnabled(),"pactivechk field is enabled");		 
			  Reporter.log("verifyMyerppactivechk ", true);
			  pactivechk.click(); 
		 }
		   public void VerifyMyerpPClearBtnBtn() throws InterruptedException {
				  Assert.assertTrue(pclearbtn.isEnabled(),"pclearbtn field is enabled");		 
				  Reporter.log("verifyMyerppclearbtn ", true);
				  pclearbtn.click(); 
				  Thread.sleep(700);
			 }
		   public void VerifyMyerpPEditBtn() throws InterruptedException {
			   Thread.sleep(700);
				  Assert.assertTrue(peditbtn.isEnabled(),"peditbtn field is enabled");		 
				  Reporter.log("verifyMyerppeditbtn ", true);
				  peditbtn.click(); 
			 }
		   public void VerifyMyerpPYesUpdateItBtn() throws InterruptedException {
			   Thread.sleep(800);
				  Assert.assertTrue(yesupdateitbtn.isEnabled(),"yesupdateitbtn field is enabled");		 
				  Reporter.log("verifyMyerpyesupdateitbtn ", true);
				  yesupdateitbtn.click(); 
			 }
		  
		   public void VerifyMyerProductcode2() throws InterruptedException {
				Thread.sleep(700);
				 Assert.assertTrue(productcode.isEnabled(),"productcode field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productcode.click();
				 productcode.clear();
				 productcode.sendKeys("1007");
			}

			public void VerifyMyerProductDesc2() throws InterruptedException {
				Thread.sleep(700);
				 Assert.assertTrue(productdesc.isEnabled(),"productcode field is enabled");		 
				 Reporter.log("verifyMyerpproductname ", true);
				 productdesc.click(); 
				 productdesc.clear();
				 productdesc.sendKeys("20KG DOM"); 
			}
		   
		   public void VerifyMyerpPUpdateBtn() throws InterruptedException {
			   Thread.sleep(700);
				  Assert.assertTrue(updatebtn.isEnabled(),"updatebtn field is enabled");		 
				  Reporter.log("verifyMyerpupdatebtn ", true);
				  updatebtn.click(); 
			 }
		   public void VerifyMyerpPUpdateOKBtn() throws InterruptedException {
			   Thread.sleep(500);
				  Assert.assertTrue(pupdatedok.isEnabled(),"pupdatedokfield is enabled");		 
				  Reporter.log("verifyMyerppupdatedok ", true);
				  pupdatedok.click(); 
			 }
		   public void VerifyandClickonPSearchbar3() throws InterruptedException {
		    	  
		    	  Assert.assertTrue(psearchbar.isEnabled()," psearchbar field is enabled");
		    	  Reporter.log(" verifyMyerp psearchbar", true);
		    	  psearchbar.click(); 
		    	  psearchbar.sendKeys("20 KG DOM");
		    	  Thread.sleep(1000);
		    	  }
		   public void VerifyMyerpPExportBtn() throws InterruptedException {
			   Thread.sleep(500);
				  Assert.assertTrue(exportbtn.isEnabled(),"exportbtn field is enabled");		 
				  Reporter.log("verifyMyerpexportbtn ", true);
				  exportbtn.click(); 
			 }
		   
		   
		 
	}




