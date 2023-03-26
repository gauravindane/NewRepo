package DataProviderPrac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDataForRegistration {
	
//	@DataProvider
//	public Object[][] getFBData() throws EncryptedDocumentException, IOException {
//		FileInputStream file;
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int rows=WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int cols=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
//		
//		Object[][] data=new Object[rows+1][cols];
//		for(int i=1; i<=rows; i++) {
//			for(int j=0; j<cols; j++) {
//				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//				data[i][j]=WorkbookFactory.create(file).getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
//			}
//		}
//		
//		return data;
//	}
	
	
	
//	@DataProvider
//	public Object[][] getFBData() throws EncryptedDocumentException, IOException {
//		FileInputStream file;
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int rows=WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int cols = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
//		
//		Object[][] data = new Object[rows+1][cols];
//		for(int i=1; i<=rows; i++) {
//			for(int j=0; j<cols; j++) {
//				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//				data[i][j]=WorkbookFactory.create(file).getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
//			}
//		}
//		
//		return data;
//	}
	
	
	
//	@DataProvider
//	public Object[][] getData() throws EncryptedDocumentException, IOException {
//		FileInputStream file;
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int rows = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int cols = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
//		
//		Object[][] data = new Object[rows+1][cols];
//		for(int i=1; i<=rows; i++) {
//			for(int j=0; j<cols; j++) {
//				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//			    data[i][j]=WorkbookFactory.create(file).getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
//		    }
//		}
//		
//		return data;
//
//
//	}
	
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		
		FileInputStream file;
		
		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
		int rows=WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum();
		
		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
		int cols=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
		
		Object data[][]=new Object[rows+1][cols];
		for(int i=1; i<=rows; i++) {
			for(int j=0; j<cols; j++) {
				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
				data[i][j]=WorkbookFactory.create(file).getSheet("Sheet3").getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
	}
	
	
	
	
	

}
