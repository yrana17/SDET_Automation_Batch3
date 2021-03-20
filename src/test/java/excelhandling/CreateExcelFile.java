package excelhandling;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {

	public static void main(String[] args) throws IOException {

		String file = "src/main/resources/TestData1.xlsx";
		Workbook wb = new XSSFWorkbook();
		OutputStream fout = new FileOutputStream(file);
		wb.write(fout);

	}

}
