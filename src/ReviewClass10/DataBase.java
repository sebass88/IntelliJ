package ReviewClass10;

public abstract class DataBase {
    int numberofConnections;
    DataBase(int numberofConnections){
        this.numberofConnections=numberofConnections;
    }
    abstract void openDataBase();
    abstract void ReadData();
    abstract void editData();
    abstract void closeDataBase();

}
class MySQL extends DataBase{

    MySQL(int numberofConnections) {
        super(numberofConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the database from Microsoft");
    }

    @Override
    void ReadData() {
        System.out.println("Reading the data from Microsoft");
    }

    @Override
    void editData() {
        System.out.println("Editing the data from MicroSoft");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the data from Microsoft");
    }
}
class GoogleDataBase extends DataBase{
    GoogleDataBase(int numberofConnections) {
        super(numberofConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the database from Google DataBase");
    }

    @Override
    void ReadData() {
        System.out.println("Reading the data from Google Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data from Google Databse");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the data from Google DataBase");
    }

}
class InformixDatabase extends DataBase{
    InformixDatabase(int numberofConnections) {
        super(numberofConnections);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the database from IBM DataBase");
    }

    @Override
    void ReadData() {
        System.out.println("Reading the data from IBM Database");
    }

    @Override
    void editData() {
        System.out.println("Editing the data from IBM Databse");
    }

    @Override
    void closeDataBase() {
        System.out.println("Closing the data from IBM DataBase");
    }
}