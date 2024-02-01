package New_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data_And_Write_Pass {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/ZSHEET01.xlsx");
		// get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from ws
		XSSFSheet ws = wb.getSheet("ZIYAUL01"); 
		//count no of rows in sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			String fname = ws.getRow(i).getCell(0).getStringCellValue();
			String mname = ws.getRow(i).getCell(1).getStringCellValue();
			String lname = ws.getRow(i).getCell(2).getStringCellValue();
			double eid = ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+"    "+mname+"     "+lname+"  "+eid);
			//write as pass into result cell
			ws.getRow(i).createCell(4).setCellValue("Right_pass");
	        }
		fi.close();
		FileOutputStream fo = new FileOutputStream("A:/Output.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
