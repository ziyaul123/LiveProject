package New_Project;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Any_Specific_Row_Cell_Data {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/ZSHEET01.xlsx");
		// get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from ws
		XSSFSheet ws = wb.getSheet("ZIYAUL01");
		//count no of row in sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		String fname = ws.getRow(10).getCell(0).getStringCellValue();
		String mname = ws.getRow(23).getCell(1).getStringCellValue();
		String lname =  ws.getRow(19).getCell(2).getStringCellValue();
		int eid = (int) ws.getRow(11).getCell(3).getNumericCellValue();
		System.out.println(fname+"    "+mname+"     "+lname+"  "+eid);
		fi.close();
		wb.close();

	}

}
