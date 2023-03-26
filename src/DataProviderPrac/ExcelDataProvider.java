package DataProviderPrac;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
//	@DataProvider
//	public Object[][] getData() throws EncryptedDocumentException, IOException {
//	
////	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		
//	
//		FileInputStream file;
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int rows=WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
//		System.out.println(rows);
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int cols=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
//		System.out.println(cols);
//		
//		Object[][] data = new Object[rows+1][cols];
//		for(int i=1; i<=rows; i++) {
//			for(int j=0; j<cols; j++) {
//				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
////				DataFormatter df = new DataFormatter();                                                                                //it will convert any value to string
////				data[i][j]=df.formatCellValue(WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j));
//				data[i][j]=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue(); 
//			}
//		}
//		return data;
//		
////		for (Object[] objects : data) {
////			System.out.println(Arrays.toString(objects));
////		}
//	}
	
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {
		
		FileInputStream file;
		
		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
		int rows=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
		int cols=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows+1][cols];
		for(int i=1; i<=rows; i++) {
			for(int j=0; j<cols; j++) {
				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
				data[i][j]=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
  }
		
	
//	@DataProvider
//	public Object[][] getData() throws EncryptedDocumentException, IOException {
//		FileInputStream file;
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int rows=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
//		
//		file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//		int cols=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
//		
//		Object[][] data=new Object[rows+1][cols];
//		for(int i=1; i<=rows; i++) {
//			for(int j=0; j<cols; j++) {
//				file=new FileInputStream("C:\\Users\\GAURAV\\New ecliipse-workspace\\POMWithPagefactory\\src\\Resources\\data1.xlsx");
//				data[i][j]=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//				}
//		}
//		return data;

	}




	
//	}



