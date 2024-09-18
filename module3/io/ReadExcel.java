package com.ust.module3.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
public class ReadExcel {
	public static void main(String args[]) throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\VINOD\\Downloads\\UST\\Java Module\\student.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
		for (Row row : sheet) 
		{	for (Cell cell : row) 
			{   switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC: // field that represents numeric cell type
					System.out.print(cell.getNumericCellValue() + "\t\t");
					break;
				case Cell.CELL_TYPE_STRING: // field that represents string cell type
					System.out.print(cell.getStringCellValue() + "\t\t");
					break;
				}
			}
			System.out.println();
		}
			XSSFSheet sheet1 = wb.getSheetAt(1);
		FormulaEvaluator formulaEvaluator1= wb.getCreationHelper().createFormulaEvaluator();
		for (Row row : sheet1) 
		{	for (Cell cell : row) 
			{   switch (formulaEvaluator1.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC: // field that represents numeric cell type
					System.out.print(cell.getNumericCellValue() + "\t\t");
					break;
				case Cell.CELL_TYPE_STRING: // field that represents string cell type
					System.out.print(cell.getStringCellValue() + "\t\t");
					break;
				}
			}
			System.out.println();
		}
	}
}