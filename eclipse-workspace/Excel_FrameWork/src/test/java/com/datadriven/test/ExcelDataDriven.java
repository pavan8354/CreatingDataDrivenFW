package com.datadriven.test;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import Com.Excel.Utilities.Excel_Utility;

public class ExcelDataDriven {		
	@Test
	public void test1() {
		
		try {
			Map<String,String> testdata = Excel_Utility.getMapData();
			
		for (Entry<String,String> map :testdata.entrySet()) {
			
			System.out.println("key = "+map.getKey()+ " , value = "+map.getValue());
			
		}					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	

}