package casestudy1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleData {

	@SuppressWarnings("resource")
	public void readCredInputs(String FileName, String SheetName) {

		try {
			FileInputStream fis = new FileInputStream(new File(FileName));
			Workbook wb = null;
			String ext = FileName.substring(FileName.indexOf("."));
			if (ext.equals(".xlsx"))
				wb = new XSSFWorkbook(fis);
			else
				wb = new HSSFWorkbook(fis);

			Sheet sh = wb.getSheet(SheetName);
			int rowcnt = sh.getPhysicalNumberOfRows();
			System.out.println("Row Count:" + rowcnt);
			for (int i = 0; i < rowcnt; i++) {
				TestDataOrganization.hmInput.put(sh.getRow(i).getCell(0).toString(),
						sh.getRow(i).getCell(1).toString());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void writeLocationTableData(String FileName, String SheetName) {

		try {
			File fl = new File(FileName);
			FileInputStream inputStream = new FileInputStream(fl);
			String fileEtensionName = FileName.substring(FileName.indexOf("."));
			Workbook workbook = null;
			if (fileEtensionName.equals(".xlsx"))
				workbook = new XSSFWorkbook(inputStream);
			else if (fileEtensionName.equals(".xls"))
				workbook = new HSSFWorkbook(inputStream);

			Sheet sh = workbook.getSheet(SheetName);

			for (int i = 0; i < TestDataOrganization.listLocationTableDataUI.size(); i++) {
				Row rw = sh.createRow(i);
				HashMap<String, String> hm = TestDataOrganization.listLocationTableDataUI.get(i);

				int col = 0;
				for (String k : hm.keySet()) {

					rw.createCell(col).setCellValue(hm.get(k));
					col = col + 1;
				}
			}

			inputStream.close();

			FileOutputStream fos = new FileOutputStream(fl);
			workbook.write(fos);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
