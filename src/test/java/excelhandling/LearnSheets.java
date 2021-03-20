package excelhandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnSheets {

	public static void main(String[] args) {

		try {

			String FileName = "src/main/resources/TestData.xlsx";
			String SheetName = "Emp";
			File fl = new File(FileName);
			FileInputStream inputStream = new FileInputStream(fl);
			String fileEtensionName = FileName.substring(FileName.indexOf("."));
			Workbook workbook = null;
			if (fileEtensionName.equals(".xlsx"))
				workbook = new XSSFWorkbook(inputStream);
			else if (fileEtensionName.equals(".xls"))
				workbook = new HSSFWorkbook(inputStream);

			//workbook.createSheet("");
			
			int n = workbook.getNumberOfSheets();
			System.out.println(n);
			for (int i = 0; i < n; i++) {
				System.out.println(workbook.getSheetName(i));
				// workbook.removeSheetAt(i);//delete excel sheet
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
