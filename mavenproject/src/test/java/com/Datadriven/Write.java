package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	
	private static void write() throws IOException {
		
		
		File f = new File("C:\\Users\\rajuv\\OneDrive\\Desktop\\Data driven-Read.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fi);
		
		Sheet s = w.createSheet("modric");
		
		w.getSheet("modric").createRow(0).createCell(0).setCellValue("midfielder");
		w.getSheet("modric").getRow(0).createCell(1).setCellValue("striker");
		w.getSheet("modric").createRow(1).createCell(0).setCellValue("enzo");
		w.getSheet("modric").getRow(1).createCell(1).setCellValue("alvarez");
		w.getSheet("modric").createRow(2).createCell(0).setCellValue("2-3");
		w.getSheet("modric").getRow(2).createCell(1).setCellValue("3-0");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		w.write(fo);
		w.close();
		
		System.out.println("done");
	}
	
    public static void main(String[] args) throws IOException {
		write();
	}
	
}
