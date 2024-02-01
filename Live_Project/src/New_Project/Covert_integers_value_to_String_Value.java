package New_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Covert_integers_value_to_String_Value {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fi = new FileInputStream("D:/ZSHEET01.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("ZIYAUL01"); 
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are::"+rc);
		for(int i=1;i<=rc;i++)
		{
			if(wb.getSheet("ZIYAUL01").getRow(i).getCell(3).getCellType()==CellType.NUMERIC) 
			{
				int celldata = (int) wb.getSheet("ZIYAUL01").getRow(i).getCell(3).getNumericCellValue();
				// convert cell data integer data to string data
				String eid = String.valueOf(celldata);
				System.out.println(eid);
				ws.getRow(i).createCell(4).setCellValue("Wrong_Fail");	
			}
		}
			fi.close();
			FileOutputStream fo = new FileOutputStream("D:/Data.xlsx");
			wb.write(fo);
			wb.close();;
			fo.close();
			wb.close();
			
	

}
}