package assignment59_Fethtoexcellsheet_TestCases;


	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	public class Feththevale_excelsheet {
	public static void main(String[] args) throws EncryptedDocumentException,IOException              
	{

	FileInputStream f1 = new FileInputStream("/Users/bikashdhungana/Desktop/Selenium 2/FirstMavenproject/Excell.xlsx"); 

	Workbook w1= WorkbookFactory.create(f1);


	String username=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	String password=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(username);
	System.out.println(password);
				

		
		
		
		
		
		
		
		
		
		
		
	}
		
	}


