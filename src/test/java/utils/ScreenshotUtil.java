package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class ScreenshotUtil {
	public static String captureScreenshot(String testName) {
        File src = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String destPath = "src/test/resources/chaintestreport/screenshots/" + testName + "_" + timestamp + ".png";
        File dest = new File(destPath);
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }

}
