package Com.Excel.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	
	public static Map<String,String> getMapData() throws IOException{
		
		Map<String,String> testData = new HashMap<String,String>();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Excel_FrameWork\\src\\main\\java\\Com\\TestData\\SampleExcel.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = 	wb.getSheetAt(0);
		int lastrownumber = sheet.getLastRowNum();
		
		
		
		for(int i=0;i<lastrownumber;i++) {
			Row row = sheet.getRow(i);
			Cell keycell = row.getCell(0);
			 String cellkeyvalue = keycell.getStringCellValue().trim();
			 
			 Cell columnvaluecell = row.getCell(1);
			 String value = columnvaluecell.getStringCellValue().trim();	 
			 testData.put(cellkeyvalue, value);
	
		}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;	
		
	}
	
public static List<Map<String,String>> gettestDatainMap() throws IOException{	
	List<Map<String,String>> testDataAllRows= null;
		Map<String,String> testData = null;
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Excel_FrameWork\\src\\main\\java\\Com\\TestData\\SampleExcel.xlsx");
			Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = 	wb.getSheetAt(1);
		int lastrownumber = sheet.getLastRowNum();	
		int LastcolNum = sheet.getRow(0).getLastCellNum();
		
		List list = new ArrayList();
		for(int i=0;i<LastcolNum;i++) {	
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(i);
			String rowheader = cell.getStringCellValue().trim();
			list.add(rowheader);
		}
		
		testDataAllRows = new ArrayList<Map<String,String>>();
		for(int j=1;j<=lastrownumber;j++) {		
			Row rows = sheet.getRow(j);
			testData = new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);	
			
		for(int k=0;k<LastcolNum;k++) {		
			Cell cell = rows.getCell(k);
			String colvalue = cell.getStringCellValue().trim();
			testData.put((String) list.get(k), colvalue);
		}		
		testDataAllRows.add(testData);		
		}
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testDataAllRows;	
			
	}

}
