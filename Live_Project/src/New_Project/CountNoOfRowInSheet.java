package New_Project;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountNoOfRowInSheet {

	public static void main(String[] args) throws Throwable
	{
		//read path of exel file
		FileInputStream fi = new FileInputStream("D:/Results.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get  sheet from wb
		XSSFSheet ws = wb.getSheet("ZIYAUL01");
		//get first row from sheet 
		XSSFRow row = ws.getRow(0);
		//count no of rows in sheet
		int rc = ws.getLastRowNum();
		//no of cell in first row 
		int cc = row.getLastCellNum();
		System.out.println("no of rows ZIYAUL01 sheet::"+rc+""+" no of cell in first row ::" +cc);
		fi.close();
		wb.close();
		

	}

}
