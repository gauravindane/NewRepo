package DataProviderPrac;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	@DataProvider
	public String[] dp1() {
		String[] data = new String[4];
		data[0]="Yadagiri";
		data[1]="John";
		data[2]="Rebecca";
		data[3]="Smith";
		
		return data;
	}
	
	
	@DataProvider
	public String[] dp2() {
		String[] data = new String[4];
		data[0]="Gaurav";
		data[1]="Adam";
		data[2]="Heyden";
		data[3]="Gill";
		
		return data;
	}

}
