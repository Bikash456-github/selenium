package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment54_DataProvider_multipleInput_SkeletonProg {

	@Test(dataProvider="Set1")
	public void method1(String BD,String SS,String SBD,String DB,String DH)
	{
		System.out.println(BD+" "+SS+"  "+SBD+" "+DB+" "+DH);
	}
	@DataProvider(name="Set1")
	public Object[][] data1()
	{
		Object[][] dataset=new Object[10][15];
		//FirstName Data
		
		dataset[0][0]= "BD0";
		dataset[1][0]= "BD1";
		dataset[2][0]= "BD2";
		dataset[3][0]= "BD3";
		dataset[4][0]= "BD4";
		dataset[5][0]= "BD5";
		dataset[6][0]= "BD6";
		dataset[7][0]= "BD7";
		dataset[8][0]= "BD8";
		dataset[9][0]= "BD9";
		
		//LASTNAMEDATA

		dataset[0][0]= "SS0";
		dataset[1][0]= "SS1";
		dataset[2][0]= "SS2";
		dataset[3][0]= "SS3";
		dataset[4][0]= "SS4";
		dataset[5][0]= "SS5";
		dataset[6][0]= "SS6";
		dataset[7][0]= "SS7";
		dataset[8][0]= "SS8";
		dataset[9][0]= "SS9";
		
		//LASTNAMEMIDDLENAME

		dataset[0][0]= "SBD0";
		dataset[1][0]= "SBD1";
		dataset[2][0]= "SBD2";
		dataset[3][0]= "SBD3";
		dataset[4][0]= "SBD4";
		dataset[5][0]= "SBD5";
		dataset[6][0]= "SBD6";
		dataset[7][0]= "SBD7";
		dataset[8][0]= "SBD8";
		dataset[9][0]= "SBD9";
		
		 //LASTNAMEFIRSTNAME
		
		dataset[0][0]= "DB0";
		dataset[1][0]= "DB1";
		dataset[2][0]= "DB2";
		dataset[3][0]= "DB3";
		dataset[4][0]= "DB4";
		dataset[5][0]= "DB5";
		dataset[6][0]= "DB6";
		dataset[7][0]= "DB7";
		dataset[8][0]= "DB8";
		dataset[9][0]= "DB9";
		
		 //LASTNAME
		
		dataset[0][0]= "DH0";
		dataset[1][0]= "DH1";
		dataset[2][0]= "DH2";
		dataset[3][0]= "DH3";
		dataset[4][0]= "DH4";
		dataset[5][0]= "DH5";
		dataset[6][0]= "DH6";
		dataset[7][0]= "DH7";
		dataset[8][0]= "DH8";
		dataset[9][0]= "DH9";
		
		return dataset;
	}
	
	
	
	
	





















}