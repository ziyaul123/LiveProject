package New_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pass_Fail {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/Datas.xlsx");
		// get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from ws
		XSSFSheet ws = wb.getSheet("newSheet"); 
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
			ws.getRow(1).createCell(4).setCellValue("Right_pass");
			ws.getRow(2).createCell(4).setCellValue("False_Fail");
			ws.getRow(3).createCell(4).setCellValue("Right_pass");
			ws.getRow(4).createCell(4).setCellValue("False_Fail");
			ws.getRow(5).createCell(4).setCellValue("Right_pass");
			ws.getRow(6).createCell(4).setCellValue("False_Fail");
			ws.getRow(7).createCell(4).setCellValue("False_Fail");
			ws.getRow(8).createCell(4).setCellValue("False_Fail");
			ws.getRow(9).createCell(4).setCellValue("Right_pass");
			ws.getRow(10).createCell(4).setCellValue("Right_pass");
			ws.getRow(11).createCell(4).setCellValue("Right_pass");
			ws.getRow(12).createCell(4).setCellValue("Right_pass");
			}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/NA.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}


	}


