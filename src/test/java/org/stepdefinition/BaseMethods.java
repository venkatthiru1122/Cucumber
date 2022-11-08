package org.stepdefinition;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	public static WebDriver launchBrowser() { 
		WebDriverManager.chromedriver().setup();         //----->1
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void closeBrowser() {
		driver.quit();

	}
	
	public static void maxBrowser() {                   //----->2
		driver.manage().window().maximize();

	}
	
	public static void launchUrl(String url) {
		driver.get(url);         //----->3

	}
	
	public static void passTxt(WebElement element, String value) {    //----->4
		
		 element.sendKeys(value);

	}
	
	public static void implictWaits() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void btn(WebElement btnClick ) {            //----->5
        btnClick.click();
	}
	
	public static String getTitlePrint() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void dateTime() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dd = s.format(d);
		System.out.println(dd);
	}
	
	public static void screenShot(String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;                       //----->6
		File a = t.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\venka\\eclipse-workspace\\Cucumber\\ScreenShots\\"+name+".png");
		FileUtils.copyFile(a, b);
	}
	
	

	public static  String excelReadSingleData(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {
		  File f = new File("C:\\Users\\venka\\eclipse-workspace\\Thiru\\Excel\\"+fileName+".xlsx");
		  FileInputStream fis = new FileInputStream(f);
		  Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheet(sheetName);
			Row r = s.getRow(rowNo);                            //get single data
			Cell c = r.getCell(cellNo);
			String j = c.getStringCellValue();
			return j;

	}
	
	public static String excelStringDateNum(String fileName, String sheetName ) throws IOException {          //doubt
		
		String value ="";
		File f = new File ("C:\\Users\\venka\\eclipse-workspace\\Thiru\\Excel\\"+fileName+".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);               //print all the data
		Sheet s = w.getSheet(sheetName);
		

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if (cellType==1) {
					c.getStringCellValue();
					
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
					sdf.format(dateCellValue);
				}
				else {
					double d = c.getNumericCellValue();
					long l = (long)d;
					String.valueOf(l);
				
				}
				System.out.println(value);				
			}
			System.out.println(value);
		}
		System.out.println(value);
		return value;
				
}
	public static void excelAllWordsRead( String loc, String sheetName) throws IOException {
		File f = new File (loc);
		FileInputStream fis  = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		 Sheet s = w.getSheet(sheetName);
		 for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			 Row r = s.getRow(i);
			 
			 for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				 Cell text = r.getCell(j);
				 System.out.println(text);
				
			}
			
		}
	}
	
	 public static void excelCreateAndWrite(String fileName, int rowNo, int cellNo, String sheetName,String cellName ) throws IOException {
			File f = new File("C:\\Users\\venka\\eclipse-workspace\\Thiru\\Excel\\"+fileName+".xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet s = w.createSheet(sheetName);
			Row r = s.createRow(rowNo);
			Cell c = r.createCell(cellNo);
			c.setCellValue(cellName);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
		}
	 public static void noRowsAndColumn(String fileName, String sheetName) throws IOException {
			File f = new File ("C:\\\\Users\\\\venka\\\\eclipse-workspace\\\\Thiru\\\\Excel\\\\"+fileName+".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheet(sheetName);             //number of rows and cells
			int rowCount = 0;
			int cellCount = 0;
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
				rowCount++;
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					cellCount++;
					
				}
				
				
			}
			System.out.println("Number of Rows :"+rowCount);
			System.out.println("Number of Cells :"+cellCount);
			
		}
		public static void excelCreateRow(String fileName, String sheetName, int rowNo, int cellNo, String cellName) throws IOException {
			File f = new File ("C:\\Users\\venka\\eclipse-workspace\\Thiru\\Excel\\"+fileName+".xlsx");
			FileInputStream fis = new  FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheet(sheetName);
			Row r = s.createRow(rowNo);                            //create row
			Cell c = r.createCell(cellNo);
			c.setCellValue(cellName);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
				}
		public static void excelCreateCell(String fileName, String sheetName, int rowNo, int cellNo, String cellName) throws IOException {
			File f = new File ("C:\\Users\\venka\\eclipse-workspace\\Thiru\\Excel\\"+fileName+".xlsx");
			FileInputStream fis = new  FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheet(sheetName);
			Row r = s.getRow(rowNo);                            //create column
			Cell c = r.createCell(cellNo);
			c.setCellValue(cellName);
			FileOutputStream fos = new FileOutputStream(f);
			w.write(fos);
				}
		
		public static void mouseOver(WebElement target) {
			a = new Actions(driver);
			a.moveToElement(target);
		}
		
		
	 
}		
