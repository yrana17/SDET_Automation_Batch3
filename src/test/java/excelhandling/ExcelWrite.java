package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {

		try
		{
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

			Sheet sh = workbook.getSheet(SheetName);
			int rowcnt = sh.getPhysicalNumberOfRows();
			System.out.println(rowcnt);
			
			sh.createRow(rowcnt).createCell(0).setCellValue("Aditya1");
			sh.getRow(rowcnt).createCell(1).setCellValue(34);
			sh.getRow(rowcnt).createCell(2).setCellValue("Hderabad");
			sh.getRow(rowcnt).createCell(3).setCellValue("E029");
			sh.getRow(rowcnt).createCell(4).setCellValue("Dveloper");
			
			inputStream.close();
			
			FileOutputStream fos = new FileOutputStream(fl);
			workbook.write(fos);
			workbook.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
