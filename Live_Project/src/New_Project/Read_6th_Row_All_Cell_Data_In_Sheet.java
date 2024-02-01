package New_Project;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_6th_Row_All_Cell_Data_In_Sheet {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/ZSHEET01.xlsx");
		// get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from ws
		XSSFSheet ws = wb.getSheet("ZIYAUL01");
		//get 6th row in sheet
		XSSFRow row = ws.getRow(9);
		//get each cell from 6 row
		XSSFCell c1 = row.getCell(0);
		XSSFCell c2 = row.getCell(1);
		XSSFCell c3 = row.getCell(2);
		XSSFCell c4 = row.getCell(3);
		//read cell data
		String fname = c1.getStringCellValue();
		String mname = c2.getStringCellValue();
		String lname = c3.getStringCellValue();
		int eid = (int)c4.getNumericCellValue();
		System.out.println(fname+"    "+mname+"     "+lname+"  "+eid);
		fi.close();
		wb.close();
	}

}
