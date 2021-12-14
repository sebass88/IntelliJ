package ReviewClass10;

public class DataBaseTester {
    public static void main(String[] args) {

        DataBase dataBase=new GoogleDataBase(10);
        dataBase.openDataBase();
        dataBase.ReadData();
        dataBase.editData();
        dataBase.closeDataBase();
    }
}
