package Abstraction;

public abstract class File {
    //Create a class File that will have the following behaviors
    // : open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour
    // : Example: to open .java file we need notepad++ or sublime text,
    // to open .doc file we need Microsoft word to be installed etc

    void Edit(){
        System.out.println("editing file");
    }
    void Close(){
        System.out.println("closing file ");
    }
    abstract void Open();
}
class Javafile extends File{
    @Override
    void Open() {
        System.out.println("To open in JavaFile we need notepad++");
    }
}
class WordFile extends File{
    @Override
    void Open() {
        System.out.println("To open in WordFile we need Microsoft");
    }
}
class PdfFile extends File{
    @Override
    void Open() {
        System.out.println("To open in PdfFile we need Adobe Pdf reader");
    }
}