package Class30;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Sebas\\Desktop\\Batch11.xlsx";
        List<Map<String,String>>excelData= ExcelReader.read(path);
        System.out.println(excelData.get(1).get("LastName"));
    }
}
