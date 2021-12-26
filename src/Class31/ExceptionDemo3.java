package Class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) throws FileNotFoundException {

        String path="files/Trump.properties";
        File file=new File(path);
        if(file.exists()){
            System.out.println("Yes file exits  i will be not getting any errors");
            FileInputStream fileInputStream=new FileInputStream(path);
        }else{
            System.out.println("file is not present at this path");
        }

    }
}
