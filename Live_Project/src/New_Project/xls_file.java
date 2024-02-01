package New_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xls_file {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/Demo.xls");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("ZIYAUL01");
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
			ws.getRow(i).createCell(4).setCellValue("Pass");
	        }
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/DNew.xls");
		wb.write(fo);
		fo.close();
		wb.close();

	}

	}


