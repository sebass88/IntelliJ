package Class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        String path="files/Trump.properties";
        File file=new File(path);
        try {
            System.out.println("yes file exist i will not be getting any errors");
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException e){
            System.out.println("file is not found");
        }

        System.out.println("last line");
    }
}
