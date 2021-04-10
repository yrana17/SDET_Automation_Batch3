package casestudy1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

}
