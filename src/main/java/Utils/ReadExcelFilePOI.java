package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFilePOI {
	
	HSSFWorkbook wb;
	HSSFSheet mysheet;

	public String readExcel(int sheetnumber,int row, int cell){
		try{
		String path= "C:/Users/AGL/git/hyperlocal/hyperlocal/src/main/java/hyperlocalUtils/hyperlocal-domains.xls";
		File myfile= new File(path);
		System.out.println("my file is " +myfile);
		FileInputStream myinputfile= new FileInputStream(myfile);
		wb= new HSSFWorkbook(myinputfile);
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
		mysheet= wb.getSheetAt(sheetnumber);
		System.out.println("My sheet is =" +mysheet);
		int rowCount = mysheet.getLastRowNum();
		System.out.println("rowcount is " +rowCount);
		
		//Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row rowa = mysheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < rowa.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(rowa.getCell(j).getStringCellValue()+"|| ");

	        }

	      //  System.out.println("Row data is " + rowa);
	       
	    } 
		
		
		
		DataFormatter format= new DataFormatter();
		String data=format.formatCellValue(mysheet.getRow(row).getCell(cell));
		System.out.println("Data is " +data);
		return data;
	}

	/*public String getData(){
		mysheet= wb.getSheetAt(0);
		System.out.println("My sheet is =" +mysheet);
		DataFormatter format= new DataFormatter();
		String data=format.formatCellValue(mysheet.getRow(0).getCell(0));
		return data;
	}*/
/*	public static void main(String[] args){
		ReadExcelFilePOI excel= new ReadExcelFilePOI();
		excel.readExcel();
	}*/
	}


