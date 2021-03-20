package excelhandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PlayWIthExcel {

	public static void main(String[] args) {
		
		try {
			String FileName = "src/main/resources/TestData.xlsx";
			String SheetName = "Tmp";
			File fl = new File(FileName);
			FileInputStream inputStream = new FileInputStream(fl);
			String fileEtensionName = FileName.substring(FileName.indexOf("."));
			Workbook workbook = null;
			if (fileEtensionName.equals(".xlsx"))
				workbook = new XSSFWorkbook(inputStream);
			else if (fileEtensionName.equals(".xls"))
				workbook = new HSSFWorkbook(inputStream);

			Sheet sh = workbook.getSheet(SheetName);

			System.out.println(sh.getPhysicalNumberOfRows()); //total no of rows having data 
			System.out.println(sh.getLastRowNum());  //total no of rows -1 (it includes blank line as well)

			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
