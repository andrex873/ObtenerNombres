package com.incoltest.obtenernombres;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        if(args.length != 1){
            throw new Exception("Debe enviar la ruta del archivo como argumento");
        }
        File file = new File(args[0]);
        HSSFWorkbook libro = new HSSFWorkbook(new FileInputStream(file));
        int totalSheets = libro.getNumberOfSheets();
        for (int idx = 0; idx < totalSheets; idx++) {
            HSSFSheet sheet = libro.getSheetAt(idx);
            System.out.println(""+sheet.getSheetName());
        }
    }
}
