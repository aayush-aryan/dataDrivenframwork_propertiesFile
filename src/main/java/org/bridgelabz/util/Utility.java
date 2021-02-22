package org.bridgelabz.util;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    public static String screenShotsCapture(WebDriver driver) throws IOException {
        //1. take screenShots and store it as file format;
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File file = new File("src/../applicationImage/" + System.currentTimeMillis() + ".jpg");
        String fileAbsolutePath = file.getAbsolutePath();
        FileUtils.copyFile(screenshot, file);
        return fileAbsolutePath;
    }
  public static String getProperty(String key) {
      String property = "";
      Properties prop = new Properties();
      try {
          prop.load(new FileInputStream("C:\\Users\\ankit\\Desktop\\newdatadrivenframework" +
                  "\\src\\test\\resources\\data.properties"));
          property = prop.getProperty(key);
      } catch (Exception e) {
          e.printStackTrace();
      }
      return property;
  }


}
