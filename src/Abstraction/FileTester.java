package Abstraction;

public class FileTester {
    public static void main(String[] args) {
        File [] files={new Javafile(),new WordFile(),new PdfFile()};
    for(File f:files){
        f.Close();
        f.Edit();
        f.Open();
    }
    }
}
