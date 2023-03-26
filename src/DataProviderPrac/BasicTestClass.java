package DataProviderPrac;

import org.testng.annotations.Test;

public class BasicTestClass {
	
	@Test (dataProvider = "getData", dataProviderClass = ExcelDataProvider.class)
	public void Login(String s, String p) {
		System.out.println(s+" "+p);
	}

}
