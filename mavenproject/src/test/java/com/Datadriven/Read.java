package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {


	private static void one() throws IOException {


		File f = new File("C:\\Users\\rajuv\\eclipse-workspace\\mavenproject\\Datadriven\\Data driven-Read.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);


		Sheet s = w.getSheet("yuvi");

		Row rs = s.getRow(3);

		Cell  c = rs.getCell(1);

		CellType ct = c.getCellType();


		if (ct.equals(CellType.STRING)) {
			String st = c.getStringCellValue();
			System.out.println(st);

		} 

		else if (ct.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();	
			int du = (int) d;
			System.out.println(du);
		}

	}


	private static void all() throws IOException {

		File fs = new File("C:\\\\Users\\\\rajuv\\\\eclipse-workspace\\\\mavenproject\\\\Datadriven\\\\Data driven-Read.xlsx");

		FileInputStream fis = new FileInputStream(fs);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j <physicalNumberOfCells ; j++) {
				Cell ce = row.getCell(j);

				CellType cte = ce.getCellType();

				if (cte.equals(CellType.STRING)) {
					String st = ce.getStringCellValue();
					System.out.println(st+"/");

				} 

				else if (cte.equals(CellType.NUMERIC)) {
					double d = ce.getNumericCellValue();	
					int du = (int) d;
					System.out.println(du);
				}

			}

			System.out.println();

		}


	}


	public static void main(String[] args) throws IOException {
		one();
		System.out.println("***********");
		all();
	}


}
