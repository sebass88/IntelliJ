package Class30.Hw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
    public static void main(String[] args) throws IOException {

        //Create a property file to store following configurations:
        //browser=chrome
        //url=https://facebook.com
        //username
        //password
        //Read file and extract values of browser & url

        String path="files/Config.properties";
        Properties properties=new Properties();
        properties.put("browser","chrome");
        properties.put("url","https://facebook.com");
        properties.put("userName","sebas123");
        properties.put("password","pass123!");

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"new file");

        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));


    }
}
