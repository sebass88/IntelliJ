package ReviewClass13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        String path="fsfsfa";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
    }
}
