package excelhandling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {

		try {
			String FileName = "src/main/resources/TestData.xlsx";
			String SheetName = "Emp";

			FileInputStream fis = new FileInputStream(new File(FileName));

			Workbook wb = null;

			String ext = FileName.substring(FileName.indexOf("."));

			if (ext.equals(".xlsx"))
				wb = new XSSFWorkbook(fis);
			else
				wb = new HSSFWorkbook(fis);

			Sheet sh = wb.getSheet(SheetName);

			int rowcnt = sh.getPhysicalNumberOfRows();
			int colcnt = sh.getRow(0).getLastCellNum();

			System.out.println("Row Count:" + rowcnt);
			System.out.println("Col Count:" + colcnt);

			for (int i = 0; i < rowcnt; i++) {
				System.out.println();
				for (int j = 0; j < colcnt; j++) {
					System.out.print(sh.getRow(i).getCell(j) + "    ");

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
