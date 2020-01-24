package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) {

		try {
			File fp = new File(
					"/Users/pintu/eclipse-workspace/appium-selenium-framework/src/test/resources/ExcelFile.xlsx");
			FileInputStream fip = new FileInputStream(fp);
			XSSFWorkbook workbook = new XSSFWorkbook(fip);
			XSSFSheet sheet = workbook.getSheetAt(0);
			

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				System.out.print(sheet.getRow(i).getCell(0));
				System.out.print(" ");
				System.out.println(sheet.getRow(i).getCell(1));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
