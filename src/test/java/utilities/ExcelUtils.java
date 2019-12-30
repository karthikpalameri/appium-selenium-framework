package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	File fp;
	InputStream is;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelUtils(String excelFilePath) {
		fp = new File(excelFilePath);
		try {
			is = new FileInputStream(fp);
			wb = new XSSFWorkbook(is);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public String getData(int sheetNumber, int row, int column) {
		sheet = wb.getSheetAt(sheetNumber);
		return sheet.getRow(row).getCell(column).getStringCellValue();
	}

	public static void main(String[] args) throws IOException {
		ExcelUtils excel = new ExcelUtils(System.getProperty("user.dir") + "/src/test/resources/ExcelFile.xlsx");
		System.out.println(excel.getData(0, 0, 1));

	}

}
