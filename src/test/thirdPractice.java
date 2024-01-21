package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class thirdPractice {
    
	@Test(dataProvider = "getData")
	public void Cars(String carName, String carPrice) {
		System.out.println("This method deals with Cars");
		System.out.println("Car Name: "+carName+" Car Price: "+carPrice);
	}
	
	@Test
	public void bikes() {
		System.out.println("This method deals with Bike");
	}
	
	@Test(groups = "Reg")
	public void aeroplanes() {
		System.out.println("This method deals with Aeroplanes");
	}
	
	@DataProvider
	public Object getData() {
		Object[][] data = new Object[3][2];
		
		//Column - Car Name, Car Price
		//Row - Values of Columns attributes
		data[0][0] = "BMW";
		data[0][1] = "3 Crore";
		
		data[1][0] = "Lamborgini";
		data[1][1] = "4 Crore";
		
		data[2][0] = "Audi";
		data[2][1] = "1 Crore";
		
		return data;
	}
}
